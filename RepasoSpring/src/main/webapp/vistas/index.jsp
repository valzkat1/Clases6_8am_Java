<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<form action="/procesar_paciente" method="POST">

<label>Nombre Paciente:</label>
<input type="text" name="nombre" />
<br/>
<label>Edad Paciente:</label>
<input type="text" name="edad" />
<br/>
<label>Sexo Paciente:</label>
<input type="text" name="sexo" />
<br/>
<label>RUT Paciente:</label>
<input type="text" name="rut" />
<br/>
<label>Peso Paciente:</label>
<input type="text" name="peso" />
<br/>
<label>Altura Paciente:</label>
<input type="text" name="altura" />
<br/>
<label>Fecha primera consulta:</label>
<input type="date" name="fecha" />
<br/>

<button type="submit">Enviar</button>

</form>

</center>

${mensaje}
</body>
</html>