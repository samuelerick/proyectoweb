<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modificar datos</title>
</head>
<body>
<% HttpSession misesion= request.getSession();%>
<form action="RegistrarServlet" method="post">
		<table>
			<tr>
				<td class="costado"><label>Nombre: </label></td>
				<td><input type="text" name="nombre" maxlength="15" value="<% misesion.getAttribute("nombre"); %>"></td>
			</tr>
			<tr>
				<td class="costado" ><label>Apellido: </label></td>
				<td><input type="text" name="apellido" value="<% misesion.getAttribute("apellido"); %>" ></td>
			</tr>
			<tr>
				<td class="costado" ><label>Estado: </label></td>
				<td><select name="rol">
						<option value="true">activo</option>
						<option value="false">desactivo </option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit" value="modificar"></td>
			</tr>
		</table>
	</form>
</body>
</html>