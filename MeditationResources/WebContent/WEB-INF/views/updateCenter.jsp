<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${teacher.firstName }${teacher.lastName }</title>
</head>
<body>
	<style type="text/css">
body {
	padding: 10px;
	background-color: lightblue;
}

.filmTitle {
	text-shadow: 1px 1px black;
	text-decoration: underline;
	text-decoration-style: wavy;
}

form {
	align-content: flex-end;
}

div {
	text-align: center;
	background-color: white;
	border: 2px solid black;
	padding: 10px;
	margin: 5px;
}
</style>

	<form action="update.do">
		<input type="hidden" name="centerId" value="${center.id }"> <input
			type="text" name="name" placeholder="${center.name }"><br>
		<input type="text" name="tradition" placeholder="${center.tradition }"><br>
		<input type="text" name="address"
			placeholder="${center.address }"><br> <input
			type="text" name="city" placeholder="${center.city }"> <input
			type="text" name="state" placeholder="${center.state }"> <input
			type="text" name="country" placeholder="${center.country }"> <input
			type="text" name="postalCode" placeholder="${center.postalCode }"> <input
			type="text" name="map" placeholder="Paste a google map html embed"><br>
		<input type="submit" name="update" value="Submit"> <br>

	</form>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>