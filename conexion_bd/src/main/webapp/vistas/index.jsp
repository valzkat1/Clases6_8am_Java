
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Basico</title>
</head>
<body>

<form:form action="/guardarUsuario" method="POST"  modelAttribute="usuarios">

<label>Nombre:</label>
<form:input path="nombre" type="text" name="nombre"/> 
<br/>

<label>Apellidos:</label>
<form:input type="text" path="apellidos"  name="apellidos"/> 
<br/>

<label>Edad:</label>
<form:input type="number" path="edad" name="edad"/> 
<br/>

<label>Email:</label>
<form:input type="email" path="email" name="email"/> 
<br/>

<label>CC:</label>
<form:input type="number" path="cc" name="cc"/> 
<br/>

<form:button type="submit">Enviar</form:button>

</form:form>



<br/>
<a href="/lista">Lista Usuarios</a>

</body>
</html>