<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>PERFIL</head>
<body>
	<h1>Title : ${title}</h1>	
	<h1>Message : ${message}</h1>	
	<form name='perfilForm' id="form" action="/masterizate/perfil" method="POST">
		<input name="submit" type="submit" value="submit" />
	</form>
</body>
</html>