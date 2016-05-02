<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*"%>
<%
	String filePath = application.getRealPath("WEB-INF/polls.xml");
%>
<jsp:useBean id="pollBean" class="uts.wsd.PollBean" scope="application">
	<jsp:setProperty name="pollBean" property="pollFilePath"
		value="<%=filePath%>" />
</jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Creator creator = (Creator) session.getAttribute("creator");
	%>
	
	<h1>Meat App</h1>
	<%
		if (creator != null) {
	%>
	
	<p>You are logged in as <%=creator.getUsername()%></p>
	<p>Click <a href="newpoll.jsp"> to create new poll</a></p>
	<p>Click <a href="logout.jsp">here</a> to logout</p>
	<%
		} else {
	%>

	<a href="register.jsp">register</a>
	<a href="login.jsp">login</a>

	<%
		}
	
		for (Poll poll : pollBean.getPolls().getList()) {
	%>

	<p><%=poll.getCreatorUsername()%>'s <a href="polldetails.jsp"><%=poll.getTitle()%></a>
	</p>

	<%
		}
	%>


</body>
</html>