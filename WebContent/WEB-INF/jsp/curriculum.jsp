<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuevo CV</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<td>Usando el Metodo POST</td>
			</tr>
			<tr>
				<td> 
					<form name='registerFormGet' action="/masterizate/curriculum" method="post">
						<table>
							<tr>
								<td>Nombre:</td>
								<td><input type="text" size="20" name="nombre"></td>
							</tr>
							<tr>
								<td>Apellidos:</td>
								<td><input type="text" size="20" name="apellidos"></td>
							</tr>
							<tr>
								<td>Edad:</td>
								<td><input type="text" size="20" name="edad"></td>
							</tr>
							<tr>
								<td>Direcci�n:</td>
								<td><input type="text" size="100" name="address"></td>
							</tr>
							<tr>
								<td>Correo:</td>
								<td><input type="text" size="20" name="correo"></td>
							</tr>
							<tr>
								<td>Usuario:</td>
								<td><input type="text" size="20" name="usuario"></td>
							</tr>
							<tr>
								<td>Contrase�a:</td>
								<td><input type="password" size="20" name="pass"></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="Crear CV"></td>
							</tr>
						</table>
					</form>
				</td>
				<td>
					<form action="ServletCV" method="post">
						<table>
							<tr>
								<td>Nombre:</td>
								<td><input type="text" size="20" name="nombre"></td>
							</tr>
							<tr>
								<td>Apellido:</td>
								<td><input type="text" size="20" name="apellido"></td>
							</tr>
							<tr>
								<td>Edad:</td>
								<td><input type="text" size="20" name="edad"></td>
							</tr>
							<tr>
								<td>Correo:</td>
								<td><input type="text" size="20" name="correo"></td>
							</tr>
							<tr>
								<td>Usuario:</td>
								<td><input type="text" size="20" name="usuario"></td>
							</tr>
							<tr>
								<td>Contrase�a:</td>
								<td><input type="password" size="20" name="pass"></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="Registrar"></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</div>
	
			  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
 
</body>
</html>



<html>
<head>
<title>Pagina de REgistro</title>

</head>
<body onload='document.loginForm.username.focus();'>
 
	<h1>Crear nuevo usuario</h1>
 
	<div id="login-box">
 
		<h2>Datos Usuario</h2>
 
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
		
		  <table>
			<tr>
				<td>Usuario:</td>	
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>
 

		</form>
	</div>
 
</body>
</html>