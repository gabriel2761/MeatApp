<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="body">
		<html>
			<head>
				<title>MeatApp</title>
				<style>
					html,
					body {
					margin: 0;
					padding: 0;
					font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
					font-size: 22px;
					}
					.navbar {
					width: 100%;
					height: 40px;
					background-color: #D32F2F;
					display: flex;
					align-items: center;
					justify-content: space-between;
					padding: 16px;
					}
					.brand {
					text-decoration:none;
					color: #fff;
					}
					.navbar-button {
					margin-right: 50px;
					text-decoration:none;
					color: #fff;
					}
				</style>
			</head>
			<body>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>
	
	<xsl:template match="navbar">
		<nav class="navbar">
			<a class="brand" href="index.jsp">MeatApp</a>
		</nav>
	</xsl:template>
	<xsl:template match="main">
	<h1>Login</h1>
	<form action="login.jsp" method="post">
			<input type="text" name="username" required="true" /> 
			<input type="password" name="password" required="true" />
			<input type="hidden" name="submitted" value="yes" /> 
			<input type="submit" />
		</form>
	</xsl:template>
	
	<xsl:template match="success">
	<p>Login successful</p>
		<p>Welcome,</p>
		<p>Click <a href="index.jsp">here</a> to go to the main page.</p>
	
	</xsl:template>
	
	
</xsl:stylesheet>