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
	String submitted = request.getParameter("submitted");

	Creator creator = creatorBean.getCreators().login(username, password);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MeatApp - Login</title>
</head>

<c:set var="xmltext">
	<body>
		<navbar></navbar>
	<% if (creator != null) {
 		out.print("<success></success>");
 		
	} else {
		
		out.print("<main></main>");
	}
 	%>
	</body>
</c:set>
<c:import url="WEB-INF/login.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />
</html>