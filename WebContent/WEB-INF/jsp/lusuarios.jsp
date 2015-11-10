<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.css"/>
	<script type="text/javascript" src="js/script.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.js"></script>
<script>	
	$(document).ready(function() {
	    $('#example').DataTable();
	} );
</script>
</head>
<body>
	<h1>Pagina paga gestionar los usuarios</h1>		
	<form name='perfilForm' id="form" action="/masterizate/usuarios" method="POST">
		<table id="example" class="display" cellspacing="0" width="100%" >
        <thead>
            <tr>
                <th>Name</th>
                <th>Password</th>
                <th>Estado</th>
            </tr>
        </thead>
 
        <tfoot>
        
            <tr>
                <th>Name</th>
                <th>Password</th>
                <th>Estado</th>
            </tr>
        </tfoot>
 
        <tbody>
	        <c:forEach items="${users}" var="usuario">
				<tr>
	                <td>${usuario.username}</td>
	                <td>${usuario.password}</td>
	                <td>${usuario.enabled}</td>
	            </tr>			
			</c:forEach> 
           
           
        </tbody>
    </table>
		
		<input name="submit" type="submit" value="submit" />
	</form>
</body>
</html>