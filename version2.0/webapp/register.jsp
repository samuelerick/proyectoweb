<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<h1>Registro nuevo usuario</h1> 
<% HttpSession misesion= request.getSession();%>
<%if(misesion.getAttribute("rol").equals("admin")){ %>
<form action="RegistrarServlet" method="post">
		<table>
			<tr>
				<td class="costado"><label>Nombre: </label></td>
				<td><input type="text" name="nombre" maxlength="15"></td>
			</tr>
			<tr>
				<td class="costado" ><label>Apellido: </label></td>
				<td><input type="text" name="apellido" ></td>
			</tr>
			<tr>
				<td class="costado"><label>email: </label></td>
				<td><input type="text" name="email" placeholder="confe@gmail.com" maxlength="20"></td>
			</tr>
			<tr>
			<td class="costado"><label>Rol:</label></td>
			<td><select name="rol">
						<option value="profesor">profesor</option>
						<option value="admin">admin</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit" value="registrar"></td>
			</tr>
		</table>
	</form>
<p>No tienes permitido entrar aqui. Revisa tus datos de sesion.<a href="/index.html">Regrese a la pagina principal.</a>
<%} %>
</body>
</html>