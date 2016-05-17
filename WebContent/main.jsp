<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uts.wsd.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%
	String filePath = application.getRealPath("WEB-INF/polls.xml");
%>
<jsp:useBean id="pollBean" class="uts.wsd.PollBean" scope="application">
	<jsp:setProperty name="pollBean" property="pollFilePath"
		value="<%=filePath%>" />
</jsp:useBean>
<%
	Creator creator = (Creator) session.getAttribute("creator");
%>

<c:set var="xmltext">

<body>
	<navbar>
<% 
	if (creator == null) { 
		out.print("<logged-out></logged-out>");
	} else {
		out.print("<logged-in></logged-in>");
	}
%>
	</navbar>
	
	
		
	<main></main>
	
</body>

</c:set>
<c:import url="WEB-INF/template.xsl" var="xslt"/>
<x:transform xml="${xmltext}" xslt="${xslt}"/>

<% for (Poll poll : pollBean.getPolls().getList()) { %>
<p><%=poll.getCreatorUsername()%>'s <a href="polldetails.jsp?polltitle=<%=poll.getTitle()%>"><%=poll.getTitle()%></a></p>
<%
	}
%>