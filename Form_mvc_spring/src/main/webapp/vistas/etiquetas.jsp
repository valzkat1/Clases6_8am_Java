<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="/etiquetas" method="POST"  modelAttribute="etiquetas_from_mvc">


<label>Nombre:</label>
<form:input type="text" path="nombre" name="nombre"/>
<br/>
<br/>
<label>Sexo:</label>
<form:radiobutton path="sexo" name="sexo" label="Masculino" value="M"/>
<form:radiobutton path="sexo" name="sexo" label="Femenino" value="F"/>

<br/>
<br/>
<label>Habilidades:</label>
<form:checkbox path="habilidades" name="habilidades" label="Javascript" value="javascript"/>
<form:checkbox path="habilidades" name="habilidades" label="Java" value="java"/>
<form:checkbox path="habilidades" name="habilidades" label="HTML" value="html"/>
<br/>
<br/>
<label>Clave:</label>
<form:password  path="password" name="password"/>

<br/>
<br/>
<label>Ciudad:</label>
<form:select path="seleccion" name="seleccion">
  <form:option value="Medellin">Medellin</form:option>
 <form:option value="Bogota">Bogota</form:option>
  <form:option value="Cali">Cali</form:option>
  
  <form:option value="Medellin">Medellin</form:option>
 <form:option value="Bogota">Bogota</form:option>
  <form:option value="Cali">Cali</form:option>
  
</form:select>

<br/>
<br/>
<label>Descipcion Personal:</label>
<form:textarea path="textoLargo" name="textoLargo"/>

<br/>
<br/>

<form:button type="submit">Enviar</form:button>

</form:form>


</body>
</html>