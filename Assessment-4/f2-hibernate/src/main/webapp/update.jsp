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
<!--  
<script type="text/javascript">
function validate(){
	var book_name = document.f2.book_name.value;
	//var book_price = document.f2.book_price.value;
	var status = false;
	if(book_name  == ""){
		document.getElementById("nl1");
        alert("Please enter your valid input");
		status = false;
	}
	else{
		document.getElementById("nl1");
        alert("correct");
		status=true;
	}
	
	
	return status;
}
</script>-->

<form name="f2" action="update">
<label style="color:white;">Book  Name: </label><input type=text name= "book_name" style="color=white;"><span id =  "nl1" style="color:red"></span>
<label style="color:white;">Book price:</label><input type=text name="book_price" style="color=white;">
<!--  Book Name:<input type="text" name="book_name">
Book price:<input type="text" name="book_price">-->
<input type="submit" value="SUBMIT">
<button style="color=white;"><a href="library.jsp" style="color=white;">Back</a></button>

</form>
</body>
</html>