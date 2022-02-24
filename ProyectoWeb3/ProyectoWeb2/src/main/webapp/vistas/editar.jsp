<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 
<jsp:include page="menu.jsp"></jsp:include>

<div class="container">

<form:form  modelAttribute="usuario" action="/crearUs" method="POST"  enctype="multipart/form-data">
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Nombre</span>
  <form:input type="text" class="form-control" path="nombre" placeholder="nombre" aria-label="Username" aria-describedby="basic-addon1"/>
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Apellidos</span>
  <form:input type="text" class="form-control" path="apellidos" placeholder="apellidos" aria-label="Username" aria-describedby="basic-addon1"/>
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Edad</span>
  <form:input type="text" class="form-control" path="edad"  aria-label="Username" aria-describedby="basic-addon1"/>
<form:errors path="edad" />
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Email</span>
  <form:input type="text" class="form-control" path="email" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1"/>
</div>

  
  <form:hidden  path="cc" placeholder="CC" aria-label="CC" aria-describedby="basic-addon1"/>


<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Nombre Usuario</span>
  <form:input type="text" class="form-control" path="username" placeholder="username" aria-label="username" aria-describedby="basic-addon1"/>
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Clave</span>
  <form:input type="password" class="form-control" path="clave" placeholder="clave" aria-label="clave" aria-describedby="basic-addon1"/>
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Imagen</span>
  <input type="file" class="form-control"  name="archivo" aria-label="clave" aria-describedby="basic-addon1"/>
</div>


<form:button>Enviar</form:button>

</form:form>

</div>



<jsp:include page="footer.jsp"></jsp:include>