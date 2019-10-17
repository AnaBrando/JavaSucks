<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Pizza</h1>
<form action="Cadastro" method="post">
<table>
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
<tr><td>vendedor:</td><td><input type="text" name="vendedor"/></td></tr>
<tr><td>loja:</td><td><input type="text" name="loja"/></td></tr>
<tr><td>feedback:</td><td><input type="text" name="feedback"/></td></tr>
<tr><td>vendido:</td><td><input type="checkbox" name="vendido"/></td></tr>
<tr><td>preco:</td><td><input type="text" name="preco"/></td></tr>
<tr><td>Tamanho:</td><td>
<select name="country" style="width:150px">
<option>P</option>
<option>M</option>
<option>G</option>
<option>GG</option>
</select>
</td></tr>
<tr><td colspan="2"><input type="submit" value="SavePizza"/></td></tr>
</table>
</form>

<br/>
<a href="ViewServlet">Pizzas</a>

</body>
</html>