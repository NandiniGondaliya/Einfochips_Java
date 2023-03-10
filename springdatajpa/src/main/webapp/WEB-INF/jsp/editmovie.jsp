<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="insertmovie">

<input type="hidden" name="mid" value="${movie.mid}"><br><br>
Movie Name:<input type="text" name="mname" value="${movie.mname}"><br><br>
Director:<input type="text" name="mdirector" value="${movie.mdirector}"><br><br>
Language:<input type="text" name="mlanguage" value="${movie.mlanguage}"><br><br>
<input type="submit" value="update">
</form>
</body>
</html>