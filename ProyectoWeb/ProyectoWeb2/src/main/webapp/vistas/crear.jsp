<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
 
<jsp:include page="menu.jsp"></jsp:include>

<div class="container">

<form:form  modelAttribute="usuario" action="/crearUs" method="POST">
<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Nombre</span>
  <input type="text" class="form-control" path="nombre" placeholder="nombre" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Apellidos</span>
  <input type="text" class="form-control" path="apellidos" placeholder="apellidos" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Edad</span>
  <input type="text" class="form-control" path="edad"  aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Email</span>
  <input type="text" class="form-control" path="email" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
</div>

<form:button>Enviar</form:button>

</form:form>

</div>



<jsp:include page="footer.jsp"></jsp:include>