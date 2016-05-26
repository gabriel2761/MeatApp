<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>

<%
	String filepath = application.getRealPath("WEB-INF/polls.xml");
%>
<jsp:useBean id="pollBean" class="uts.wsd.PollBean" scope="application">
	<jsp:setProperty name="pollBean" property="pollFilePath"
		value="<%=filepath%>" />
</jsp:useBean>
<%
	String submitted = request.getParameter("submitted");
	Creator creator = (Creator) session.getAttribute("creator");
	boolean pollexists = false;
	if (submitted != null) {
		Poll poll = pollBean.getPolls().findPoll(request.getParameter("title"));
		if (poll != null) pollexists = true;
	}
	if (submitted != null) {
		String title = request.getParameter("title");
		String date = request.getParameter("date");
		String location = request.getParameter("location");
		String description = request.getParameter("description");
		Times times = new Times();

		for (int i = 1; i <= 5; i++) {
			String time = request.getParameter("time" + i);
			if (time != null && !time.isEmpty())
				times.addTime(time);
		}

		Poll poll = new Poll(title, creator.getUsername(), date, location, description, true, times);
		pollBean.getPolls().addPoll(poll);
		pollBean.save();
	}
%>

<c:set var="xmltext">
	<body>
		<head>
		<title></title>
		</head>
		<navbar>
		<% 
			if (creator == null) { 
				out.print("<logged-out></logged-out>");
			} else {
				out.print("<logged-in></logged-in>");
			}
		%>
		</navbar>

	<%
		if (creator != null) {
		if (submitted == null && !pollexists) {
			out.print("<createpoll></createpoll>");
		} else if (submitted != null && pollexists) {	
			out.print("<createpoll></createpoll>");
			out.print("The poll title \"" + request.getParameter("title") + "\" already exists");
		} else {
	%>
	<success></success>
	<%
		}} else {
			out.print("Please log in to create a poll");
		}
	%>
	</body>
	
</c:set>
<c:import url="WEB-INF/polls.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />
