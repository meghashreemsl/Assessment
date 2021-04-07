<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<table style="color:white; text-align:center;"  >

<thead>
<tr>
<td>BookId</td>
<td>BookName</td>
<td>BookPrice</td>
<td>BookAuthor</td>
<td>update</td>
<td>delete</td>
</tr>
</thead>
<tbody>
	<c:forEach var="library" items="${libraryList}">
	<tr>
		<td>${library.getBookId()}</td>
		<td>${library.getBookName()}</td>
		<td>${library.getPrice()}</td>
		<td>${library.getAuthor()}</td>
		<td><a href="update.jsp" style="color: white;">Edit</a></td>
		<td><a href="delete.jsp"  style="color: white;">Delete</a></td>
		</tr>
	</c:forEach>
	</tbody>

</table>


</body>
</html>