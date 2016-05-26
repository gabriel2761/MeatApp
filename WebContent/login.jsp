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
	if (username == null) username = "";
%>

<c:set var="xmltext">
	<body>
		<title></title>
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
					session.setAttribute("creator", creator);
					out.print("<success><username>"+ username +"</username></success>");

				} else {
					out.print("<main><username>"+ username +"</username></main>");
					if (submitted != null) {
						out.print("<p>Username or password is incorrect</p>");
					}
				}
		%>
	</body>
</c:set>
<c:import url="WEB-INF/login.xsl" var="xslt" />
<x:transform xml="${xmltext}" xslt="${xslt}" />
