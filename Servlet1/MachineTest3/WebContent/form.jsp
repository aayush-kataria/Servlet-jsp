<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Trainee here</h2>
	<form METHOD="post" action="LoginCheck">
		<table>
			<tr>
				<td>Trainee ID</td>
				<td><input type="text" name="traineeId"></td>
			</tr>
			<tr>
				<td>Trainee name</td>
				<td><input type="text" name="traineeName"></td>
			</tr>
			<tr>
				<td>Branch</td>
				<td><select name="branch" size="4">
						<option value="Java">Java</option>
						<option value="Oracle">Oracle</option>
						<option value="PHP">PHP</option>
						<option value="dotnet">Dotnet</option>
				</select></td>
			</tr>
			<tr>
				<td>Percentage</td>
				<td><input type="text" name="percentage"></td>
			</tr>
		</table>
		</form>
</body>
</html>