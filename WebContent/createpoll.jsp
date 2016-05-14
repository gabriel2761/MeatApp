<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*" %>
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
			String time = request.getParameter("time"+i);
			if (time != null && !time.isEmpty()) times.addTime(time);
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
<body>

	<h1>Create Poll</h1>
<%
	if (submitted == null) {
%>
	<form action="createpoll.jsp">
		Title: <input type="text" name="title" required /> <br /> 
		Date: <input type="text" name="date" required /> <br /> 
		Location: <input type="text" name="location" required /> <br /> 
		Description: <input type="text" name="description" required /> <br />		
		
		Time 1: <input type="text" name="time1" /> <br />
		Time 2: <input type="text" name="time2" /> <br />
		Time 3: <input type="text" name="time3" /> <br />
		Time 4: <input type="text" name="time4" /> <br />
		Time 5: <input type="text" name="time5" /> <br />
		
		<input type="hidden" name="submitted"value="yes" /> 
		<input type="submit" value="Create Poll" />
	</form>
<%
	} else {
%>
	<p>Poll Successfully Created</p>
	<p>Click <a href="index.jsp"> to go back to the main page.</a></p>
<% 
	} 
%>
</body>
</html>