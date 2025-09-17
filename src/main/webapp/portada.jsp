<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>Listado de alimentos de la tienda</div>
<c:forEach items="${info}" var="elemento">

<div style="margin 10px">
nombre :${elemento.nombre} calorias :${elemento.calorias} cantidad :${elemento.cantidad} precio :${elemento.precio} descripcion :${elemento.descripcion}
</div>


</c:forEach>
</body>
</html>