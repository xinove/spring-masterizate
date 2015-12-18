<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>PERFIL
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<script>
$(document).ready(function() {
	$("form").submit(function(){
	    //$("form").attr("action", "verSiniestros");
	    $("form").attr('action', '/masterizate/curriculum');
	});
    
});
</script>
</head>
<body>
	<h1>Title : ${title}</h1>	
	<h1>Message : ${message}</h1>	
	
	<h1>${usuario.username}</h1>
    <h1>${usuario.password}</h1>
    <!-- <h1>${usuario.enabled}</h1>  -->
	<form name='perfilForm' id="form" action="/masterizate/perfil" method="POST">
		<input name="submit" type="submit" value="submit" />
	</form>
</body>
</html>