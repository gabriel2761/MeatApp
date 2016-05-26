<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*" %>
<%
	String pollFilePath = application.getRealPath("WEB-INF/polls.xml");
%>
<jsp:useBean id="pollBean" class="uts.wsd.PollBean" scope="application">
	<jsp:setProperty name="pollBean" property="pollFilePath"
		value="<%=pollFilePath%>" />
</jsp:useBean>

<%
	Creator creator = (Creator) session.getAttribute("creator");
	String voted = request.getParameter("voted");
	String title = request.getParameter("polltitle");
	String voterName = request.getParameter("voterName");
	String voterTime = request.getParameter("voterTime");
	Poll poll = pollBean.getPolls().findPoll(title);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<c:set var="xmltext">
<body>
	
 <% 
	if (creator == null) { 
		out.print("<navbar><logged-out></logged-out></navbar>");
	} else {
		out.print("<navbar><logged-in></logged-in></navbar>");
	}
%>
	
<%
	if (poll != null) {
%>
	<details>
		<title><%= poll.getTitle() %></title>
		<username><%= poll.getCreatorUsername() %></username>
		<date><%= poll.getCreationDate() %></date>
		<location><%= poll.getLocation() %></location>
		<description><%= poll.getDescription() %></description>	
	</details>
<%
	if (voted == null) {
%>
	
	<times>
		<title><%= poll.getTitle() %></title>
<%
	for (String time : poll.getTimes().getList()) {	
%>
		<time><value><%= time %></value></time>
<% 
	} 
%>
	</times>
<% 
	} else {
%>
		<h2>Poll Results</h2>
		
<%
		pollBean.getPolls().findPoll(title).addVote(new Vote(voterName, voterTime));
		pollBean.save();
		
		for (Vote vote : pollBean.getPolls().findPoll(title).getVotes()) {
%>
		<result>
			<votename><%= vote.getName() %></votename>
			<votetime><%= vote.getTime() %></votetime>
		</result>
<% 
	}}} else {
%>
	<p>404 Poll details not found.</p>
<%	
	}
%> 
</body>
</c:set>
<c:import url="WEB-INF/polldetails.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />