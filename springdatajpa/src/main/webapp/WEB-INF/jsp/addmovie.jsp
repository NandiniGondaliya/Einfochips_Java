<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="insertmovie" method="post">


Movie Name:<input type="text" name="mname"><br><br>
Director:<input type="text" name="mdirector"><br><br>
language:<select name="mlanguage">
<option value="English">English</option>
<option value="Hindi">Hindi</option>
<option value="Others">Others</option>
</select><br><br>

<input type="submit" value="Insert Movie">


</form>
</body>
</html>