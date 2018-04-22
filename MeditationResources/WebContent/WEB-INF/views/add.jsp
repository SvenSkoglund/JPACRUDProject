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
<link rel="stylesheet" href="css/stylesheet.css">

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>

	<c:if test="${bookId > 0}">
		<div class="listItem">
				<h1> Add Book</h1>
		
			<form action="addBook.do">
				<input type="hidden" name="bookId" value="${book.id }"> <input
					type="text" name="title" placeholder="Title"><br> <input
					type="text" name="authorFirstName" placeholder="Author First Name"><br>
				<input type="text" name="authorLastName"
					placeholder="Author Last Name"><br> <input type="text"
					name="description" placeholder="Description"><br> <input
					type="text" name="releaseYear" placeholder="Release Year"><br>
				<input type="submit" name="addBook" value="Submit"> <br>

			</form>
		</div>
	</c:if>
	<c:if test="${centerId > 0}">
		<h1>Test</h1>
		<div class="listItem">
		<h1> Add Center</h1>
			<form action="addCenter.do">
				<input type="hidden" name="centerId" value="${center.id }">
				<input type="text" name="name" placeholder="Name"><br>
				<input type="text" name="tradition" placeholder="Tradition"><br>
				<input type="text" name="address" placeholder="Address"><br>
				<input type="text" name="city" placeholder="City"> <br>
				<input type="text" name="state" placeholder="State"> <br>
				<input type="text" name="country" placeholder="Country"> <br>
				<input type="text" name="postalCode" placeholder="Postal Code"><br>
				<input type="text" name="map" placeholder="Google Map html embed"><br>
				<input type="submit" name="update" value="Submit"> <br>

			</form>
		</div>

	</c:if>
	<c:if test="${teacherId > 0}">
		<div class="listItem">
		<h1> Add Teacher</h1>

			<form action="addTeacher.do">
				<input type="hidden" name="id" value="${teacher.id }"> <input
					type="text" name="firstName" placeholder="First Name"><br>
				<input type="text" name="lastName" placeholder="Last Name"><br>
				<input type="text" name="tradition" placeholder="Tradition"><br>
				<input type="text" name="description" placeholder="Description"><br>
				<input type="submit" name="update" value="Submit"> <br>

			</form>
		</div>

	</c:if>


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