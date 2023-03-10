<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Movie</title>
</head>
<body>
${movie}<br><br>
<form action="deleteMovie" method = "post">
Enter Movie id:<input type="text" name="mid"><br><br>
<input type ="submit" value = "Delete Movie">
 </form>
</body>
</html>