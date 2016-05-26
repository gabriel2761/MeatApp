<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>



<c:set var="xmltext">
	<body>
		<navbar>
			<logged-out></logged-out>
		</navbar>
		
		<log-out></log-out>

		<%session.invalidate();%>

	</body>
</c:set>
<c:import url="WEB-INF/logout.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />
