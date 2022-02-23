<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style type="text/css">
.gradient-custom {
  /* fallback for old browsers */
  background: #ffffff;

  /* Chrome 10-25, Safari 5.1-6 
  background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
*/
  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ 
  background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1))*/
}
</style>

</head>
<body>

<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">Autenticaci&oacute;n</h2>
              <p class="text-white-50 mb-5">Por favor digite el nombre de usuario y la clave!</p>

<form:form modelAttribute="usuario" action="/login" method="POST">
              <div class="form-outline form-white mb-4">
                <form:input type="text" id="typeEmailX" path="username" name="username" class="form-control form-control-lg" />
                <label class="form-label" for="typeEmailX">Nombre Usuario</label>
                <form:errors path="username" />
              </div>

              <div class="form-outline form-white mb-4">
                <form:input type="password" id="typePasswordX" path="clave" name="clave" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Clave</label>
                <form:errors path="clave" />
              </div>


              <form:button class="btn btn-outline-light btn-lg px-5" type="submit">Enviar</form:button>

              <div class="d-flex justify-content-center text-center mt-4 pt-1">
                <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
                <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
                <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
              </div>
</form:form>
            </div>

            <div>
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>