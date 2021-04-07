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

<script type="text/javascript">
function validate(){
	var book_price = document.f1.book_price.value;
	var status = false;
	if(book_price == ""){
		document.getElementById("nl");
        alert("Please enter your valid input");
		status = false;
	}
	else{
		document.getElementById("nl");
        alert("correct");
		status=true;
	}
	return status;
}
</script>

<form name="f1" action="delete" onsubmit="return validate()">
<label style="color:white;">Book price:</label><input type=text name="book_price" style="color=white;">
<!-- Book price:<input type="text" name="book_price"> --><span id =  "nl" style="color:red"></span>
<input type="submit" value="SUBMIT" style="text-align:center">
<button style="color:white;"> <a href="library.jsp" style="color:black;">Back</a> </button>
</form>

</body>
</html>