<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<jsp:include page="menu.jsp"></jsp:include>



<a href="/crear" title="Crear Usuario"><img src="https://www.clipartmax.com/png/middle/23-230185_clipart-primary-add-plus-sign.png" width="32" height="32"/>
</a>
<table class="table">
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


<jsp:include page="footer.jsp"></jsp:include>