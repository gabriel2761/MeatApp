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
			<h1>
				<a class="brand" href="index.jsp">MeatApp</a>
			</h1>
			<xsl:apply-templates />
		</nav>
	</xsl:template>


	<xsl:template match="main">
		<h1>Meat App</h1>

	</xsl:template>
	
	<xsl:template match="logged-out">
		<div class="navbar-buttons">
			<a class="navbar-button" href="register.jsp">Register</a>
			<a class="navbar-button" href="login.jsp">Login</a>
		</div>
	</xsl:template>
	
	<xsl:template match="logged-in">
		<div class="navbar-buttons">
			<a class="navbar-button" href="logout.jsp">Logout</a>
		</div>
	</xsl:template>

	<xsl:template match="register">
		<form action="register.jsp">
			
				<h2>Register</h2>
				<form action="register.jsp" method="post">
				<table>
					<tr><td>Username:</td><td><input type="text" name="username" placeholder="Username" required="true" /></td></tr>
					<tr><td>Password:</td><td><input type="password" name="password" placeholder="Password" required="true" /></td></tr>
					<tr><td>Confirm password:</td><td><input type="password" name="password-confirm" placeholder="Confirm Password" required="true" /></td></tr>
					<tr><td></td><td><input type="hidden" name="submitted" value="yes" /></td></tr>
					<tr><td></td><td><input type="submit" /></td></tr>
				</table>
				</form>
			
		</form>
	</xsl:template>


</xsl:stylesheet>