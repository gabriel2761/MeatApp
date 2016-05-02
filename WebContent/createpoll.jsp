<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*"%>
<%
	String filepath = application.getRealPath("WEB-INF/polls.xml");
%>

<jsp:useBean id="pollBean" class="uts.wsd.PollBean" scope="application">
	<jsp:setProperty name="pollBean" property="filepath"
		value="<%=filepath%>" />
</jsp:useBean>

<%
	String submitted = request.getParameter("submitted");

	if (submitted != null) {
		String title = request.getParameter("title");
		String date = request.getParameter("date");
		String location = request.getParameter("location");
		String description = request.getParameter("description");

		Creator creator = (Creator) session.getAttribute("creator");

		Poll poll = new Poll(title, creator.getUsername(), date, true, null);
		pollBean.getPolls().addPoll(poll);
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Create Poll</h1>

	<form action="createpoll.jsp">
		title: <input type="text" name="title" /> <br /> date: <input
			type="text" name="date" /> <br /> lcoati: <input type="text"
			name="location" /> <br /> description: <input type="text"
			name="description" /> <br /> <input type="hidden" name="submitted"
			value="yes" /> <input type="submit" />
	</form>

</body>
</html>