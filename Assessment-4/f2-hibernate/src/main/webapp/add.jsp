<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style= "background-image: url('library2.jpg');
text-align:center;
background-attachment:fixed;
background-size:cover;
padding-top:center;">
<form action="add">
<label style="color: white;">Book Id:</label>label<input type=text name= "book_id" style="color=white;">
<label style="color:white;">Book  Name: </label><input type=text name= "book_name" style="color=white;">
<label style="color:white;">Book price:</label><input type=text name="book_price" style="color=white;">
<label style="color: white;">Book author:</label><input type=text name="book_author" style="color=white;">
<input type="submit" value="SUBMIT" style="color=white;">
</form>
</body>
</html>