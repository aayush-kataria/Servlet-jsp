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
		<input type="radio" id="rose" name="flower" value="200">Rose - Rs200/- <br><br>
		<input type="radio" id="marigold" name="flower" value="100">Marigold -Rs100/- <br><br>
	    <input type="radio" id="lilies" name="flower" value="150">Lilies- Rs150/-
	    <input type="submit">
	</form>
	<br>
	<h3>To Add Card click below</h3>
	<a href="cards.jsp"> flower page </a>
	<br>
	<h3>To get bill click below</h3>
	<a href="welcome.jsp"> flower page </a>
	<br>
</body>
</html>