<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<br/>
<div class="container">

<h3>Tipos de validaciones Spring</h3>
<form:form action="/validaciones" modelAttribute="validaciones" method="POST">


<label class="form-check-label">Es verdad</label>
<form:checkbox path="esVerdadero" name="esVerdadero" value="true" class="form-check-input"/>

<!--<div class="invalid-feedback"><form:errors path="esVerdadero"/></div>-->
 <span style="color: red;"><form:errors path="esVerdadero"/></span>
<br/>
<br/>
<div class="input-group">
<span class="input-group-text">Maximo decimal</span>
<form:input type="number" path="maximoDecimal" name="maximoDecimal"  step="0.1" class="form-control"/>
</div>

 <span style="color:red;font-size: 16px;"><form:errors path="maximoDecimal"/></span>



<div class="input-group">
<span class="input-group-text">Email</span>
<form:input type="text" path="Email" name="Email" class="form-control"/>
</div>

<span style="color: red;"><form:errors path="Email"/></span>




<div class="input-group">
<span class="input-group-text">Edad</span>
<form:input type="number" path="edad" name="edad" class="form-control"/>
</div>


<span style="color: red;"><form:errors path="edad"/></span>




<div class="input-group">
<span class="input-group-text">Tamaño</span>
<form:input type="text" path="tamano" name="tamano" class="form-control"/>
</div>

<span style="color: red;"><form:errors path="tamano"/></span>



<!--
<div class="input-group">
<span class="input-group-text">No Vacio</span>
<form:input type="text" path="noVacio" name="noVacio[]" class="form-control"/>
<br/>
<form:input type="text" path="noVacio" name="noVacio[]" class="form-control"/>

<br/>
<span style="color: red;"><form:errors path="noVacio"/></span>
</div>



<label class="form-label">No Nulo</label>
<!--<form:input type="text" path="noNulo" name="noNulo" />--
<br/>

<span style="color: red;"><form:errors path="noNulo"/></span>

<br/>
<br/>
-->
<div class="input-group">
<span class="input-group-text">Expresion Regular Fecha (dd/MM/yy  o  dd/MM/yyyy)</span>
<form:input type="text" path="expReg1" name="expReg1" class="form-control"/>
</div>

<span style="color: red;"><form:errors path="expReg1"/></span>


<br/>

<div class="input-group">
<span class="input-group-text">Expresion Regular Telefono Colombia (+57-300xxxxxxxx)</span>
<form:input type="text" path="expReg2" name="expReg2" class="form-control"/>
</div>

<span style="color: red;"><form:errors path="expReg2"/></span>


<br/>

<div class="input-group">
<span class="input-group-text">Expresion Regular Email gmail (@gmail.com)</span>
<form:input type="text" path="expReg3" name="expReg3" class="form-control"/>
</div>

<span style="color: red;"><form:errors path="expReg3"/></span>

<br/>
<div class="input-group">
<span class="input-group-text">Expresion Regular Dir IP (192.168.0.1)</span>
<form:input type="text" path="expReg4" name="expReg4" class="form-control"/>
</div>

<span style="color: red;"><form:errors path="expReg4"/></span>


<br/>
<form:button>Enviar</form:button>

</form:form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>