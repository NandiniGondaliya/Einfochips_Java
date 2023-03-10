<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table {
  border-collapse: collapse;
  width: 100%;
  font-family: Arial, sans-serif;
  font-size: 14px;
}

th, td {
  border: 1px solid #ddd;
  padding: 12px 16px;
  text-align: left;
}

th {
  background-color: #f2f2f2;
  font-weight: bold;
}

tr:nth-child(even) {
  background-color: #f9f9f9;
}

tr:hover {
  background-color: #eaeaea;
}



</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" color="red">
<tr>

<th>Name</th>
<th>Director</th>
<th>Language</th>
</tr>


<c:forEach items="${movie}" var="m">
<tr>
<td>${m.mname}</td>
<td>${m.mdirector}</td>
<td>${m.mlanguage}</td>
<td><a href="editMovie?mid=${m.mid}">Edit</a></td>
<td><a href="deleteMovie?mid=${m.mid}">Delete</a></td>
</tr>
</c:forEach>
</table>
<p>${movie}</p><br><br>

${movielanguage}
${moviesdirector}
${languageDirector}

</body>
</html>