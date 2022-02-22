<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<div class="container">

<center><h3>Autenticacion</h3></center>

<form:form action="/validar2"  modelAttribute="usuario" method="POST">

<div class="input-group">
  <span class="input-group-text">Nombre Usuario</span>
  <form:input path="username" name="username" class="form-control"/>
</div>
<form:errors path="username" style="color:red;"/>
<br/>

<div class="input-group">
  <span class="input-group-text">Clave</span>
  <form:input type="password" path="clave" name="clave" class="form-control"/>
</div>
<form:errors path="clave" style="color:red;"/>
<br/>







<form:button>Enviar</form:button>

</form:form>

</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>