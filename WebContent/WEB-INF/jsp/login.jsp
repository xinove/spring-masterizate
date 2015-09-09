<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Pagina de login</title>
<script type="text/javascript">
	function fNewUser(){
	    var form_url = $("#form").attr("action");
	    $("#form").attr("action","/masterizate/perfil");

	    $("#form").submit();
	}
</script>
</head>
<body onload='document.loginForm.username.focus();'>
 
	<h1>Spring Security Custom Login Form (XML)</h1>
 
	<div id="login-box">
 
		<h2>Login with Username and Password</h2>
 
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
 <form name='loginForm' id="form" action="/masterizate/login" method="POST">
		
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
					value="Login" /></td>
					
			</tr>
			<tr>
				<td colspan='2'><input name="nUsuario" type="button"
					value="New User" onclick="fNewUser()"/></td>
					
			</tr>
		  </table>
 
		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
 
		</form>
	</div>
 
</body>
</html>