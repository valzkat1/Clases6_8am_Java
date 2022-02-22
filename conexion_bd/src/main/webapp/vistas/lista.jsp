<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Lista usuarios</h3>

<table>
<thead>
<th>CC</th>
<th>Nombre</th>
<th>Apellidos</th>
<th>Edad</th>
<th>Email</th>
<th>Editar</th>
<th>Eliminar</th>
</thead>
<tbody>
<c:forEach items="${listaUser}"  var="us">
<tr>
<td>${us.getCc()}</td>
<td>${us.getNombre()}</td>
<td>${us.getApellidos()}</td>
<td>${us.getEdad()}</td>
<td>${us.getEmail()}</td>
<td> <a href="/editar?id=${us.getCc()}">Editar</a> </td>
<td> <a href="/eliminar?id=${us.getCc()}">Borrar</a> </td>
</tr>
</c:forEach>

</tbody>
</table>

</body>
</html>