<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*" import="java.util.ArrayList"%>
<%
	String filePath = application.getRealPath("WEB-INF/polls.xml");
%>
<jsp:useBean id="pollBean" class="uts.wsd.PollBean" scope="application">
	<jsp:setProperty name="pollBean" property="pollFilePath"
		value="<%=filePath%>" />
</jsp:useBean>
<%
	Creator creator = (Creator) session.getAttribute("creator");
	ArrayList<Poll> polls = pollBean.getPolls().getPollByCreator(creator.getUsername());
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<c:set var="xmltext">
	<body>
	<% 
		if (creator == null) { 
			out.print("<navbar><logged-out></logged-out></navbar>");
			out.print("<p>404 Profile not found</p>");
		} else {
			out.print("<navbar><logged-in></logged-in></navbar>");
			out.print("<main>");
			
			if (polls.isEmpty()) out.print("You currently have no polls");
			
			for (Poll poll : polls) {
				out.print("<poll><title>"+poll.getTitle()+"</title><status></status></poll>");
			}
			
			out.print("</main>");
		}
	%>
	</body>
</c:set>
<c:import url="WEB-INF/profile.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />