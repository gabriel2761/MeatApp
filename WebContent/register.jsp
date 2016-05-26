<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>

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
	String email = request.getParameter("email");
	String passwordConfirm = request.getParameter("password-confirm");
	String submitted = request.getParameter("submitted");
	boolean passwordsMatch = false;
	Creators creators = creatorBean.getCreators();

	if (username == null) username = "";
	if (email == null) email = "";
	if (password != null && passwordConfirm != null) {
		passwordsMatch = password.equals(passwordConfirm);
	}
%>


<c:set var="xmltext">
	<body>
		<head><navbar></navbar></head>
		<%
			if (submitted != null && !creators.creatorExists(username) && passwordsMatch) {
		%>
		<p>Register successful</p>
		<p>Welcome, <%=username%></p>
		<p>Click <a href="index.jsp">here</a> to go to the main page</p>

		<%
			creatorBean.getCreators().addCreator(new Creator(username, password, email));
			creatorBean.save();
			} else {
				out.print("<register><username>"+username+"</username></register>");
			if (submitted != null && !passwordsMatch) {
		%>
		<p>Passwords don't match</p>
		<%
			} else if (submitted != null && creators.creatorExists(username)) {
		%>
		<p>The username <%=username%> already exists</p>
		<%
			}}
		%>
	</body>
</c:set>
<c:import url="WEB-INF/register.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />
