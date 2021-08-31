<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Select Flower</h2>
	<form action="AddToCart" method="post">
		<input type="radio" id="birthday" name="card" value="200">Birthday - Rs200/- <br><br>
		<input type="radio" id="Aniversary" name="card" value="100">Aniversary - Rs100/- <br><br>
		<input type="radio" id="goodbye" name="card" value="150">Goodbye - Rs150/-
		<input type="submit">
	</form>
	<h3>To Add Card click below</h3>
	<a href="flowers.jsp"> flower page </a>
	<br>
	<h3>To get bill click below</h3>
	<a href="welcome.jsp"> flower page </a>
	<br>
</body>
</html>