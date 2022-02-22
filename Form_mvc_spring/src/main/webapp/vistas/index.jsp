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

<form:form action="/formulario3" method="POST"  modelAttribute="formu">

<label>Nombre:</label>
<form:input path="nombre" type="text" name="nombre"/> 
<br/>

<label>Apellidos:</label>
<form:input type="text" path="apellidos"  name="apellidos"/> 
<br/>

<label>Edad:</label>
<form:input type="number" path="edad" name="edad"/> 
<br/>

<form:button type="submit">Enviar</form:button>

</form:form>


</body>
</html>