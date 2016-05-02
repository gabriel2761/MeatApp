<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*"%>
<%
	String filePath = application.getRealPath("WEB-INF/creators.xml");
%>
<jsp:useBean id="creatorBean" class="uts.wsd.CreatorBean"
	scope="application">
	<jsp:setProperty name="creatorBean" property="creatorFilePath"
		value="<%=filePath%>" />
</jsp:useBean>

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String submitted = request.getParameter("submitted");

	if (submitted != null) {
		creatorBean.getCreators().addCreator(new Creator(username, password));
		creatorBean.save();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<form action="register.jsp" method="post">
		<input type="text" name="username" /> <input type="password"
			name="password" /> <input type="hidden" name="submitted" value="yes" />
		<input type="submit" />
	</form>
</body>
</html>