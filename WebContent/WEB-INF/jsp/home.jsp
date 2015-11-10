<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Usuario</title>
</head>
<body>
	<c:if test="${not empty error}">
		<div class="error">${error}</div>
	</c:if>
	<c:if test="${not empty msg}">
		<div class="msg">${msg}</div>
	</c:if>

	<div align="center">
		<table>
			<tr>
				<td>Usando el Metodo POST</td>
			</tr>
			<tr>
				
				<td>
					<form modelAttribute="register" action="/masterizate/register" method="post">
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
								<td>Dirección:</td>
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
								<td>Contraseña:</td>
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