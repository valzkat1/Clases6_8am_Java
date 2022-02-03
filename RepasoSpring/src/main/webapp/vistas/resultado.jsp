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


<strong>Nombre Medico: </strong>${medico.getNombre()}
<br/>
<strong>Edad Medico: </strong>${medico.getEdad()}
<br/>
<strong>Edad Especialidad: </strong>${medico.getEspecialidad()}

<hr/>

<strong>Nombre Paciente: </strong>${paciente.getNombre()}
<br/>
<strong>Edad Paciente: </strong>${paciente.getEdad()}
<br/>
<strong>Peso Paciente: </strong>${paciente.getPeso()}
<br/>
<strong>Altura Paciente: </strong>${paciente.getAltura()}
<br/>
<strong>IMC Paciente: </strong>${paciente.calcularIMC()}
<br/>
</center>
</body>
</html>