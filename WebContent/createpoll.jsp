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

		Creator creator = (Creator) session.getAttribute("creator");

		Poll poll = new Poll(title, creator.getUsername(), date, location, description, true, times);
		pollBean.getPolls().addPoll(poll);
		pollBean.save();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<c:set var="xmltext">
	
	<body>
		<navbar></navbar>
		
		<%
			if (submitted == null) {
		%>
		<createpoll></createpoll>
		<%
			} else {
		%>
		<p>Poll Successfully Created</p>
		<p>
			Click <a href="index.jsp"> to go back to the main page.</a>
		</p>
		<%
			}
		%>
	</body>
</c:set>
<c:import url="WEB-INF/polls.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />
</html>