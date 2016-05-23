<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MeatApp - You have been logged out</title>
</head>
<c:set var="xmltext">
	<body>
		<navbar></navbar>
		<log-out></log-out>

		<%session.invalidate();%>

	</body>
</c:set>
<c:import url="WEB-INF/logout.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />
</html>