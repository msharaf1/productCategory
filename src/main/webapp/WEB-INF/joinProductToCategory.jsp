<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category Product</title>
</head>
<body>
	<div class="container"> 
		<h1>Product Name</h1>
<%--		<c:out value="${productList.}" />--%>
	<div clas="categoriesList">
		<h1>Product Page! <c:out value="${product.get().name}" /></h1>
		<c:if test = "${product.get().name == null}">
		<p style="font-size: 20px"> <c:out value = "Not found. Please enter another value or id"/><p>
		</c:if>

		<table>
			<thead>
			<th>Categor ID</th>
			<th>Product Name</th>
			</thead>
			<tbody>
	<c:forEach items="${categoryList}" var="category">
	<tr>
		<td>House:</td>
		<td>
			<form:select path="house">
				<form:option value="Gryffindor"/>
				<form:option value="Hufflepuff"/>
				<form:option value="Ravenclaw"/>
				<form:option value="Slytherin"/>
			</form:select>
		</td>
	</tr>
			<tr>
				<td>${category.id}</td>
				<td>${category.name}</td>
			</tr>

			</tbody>
			</c:forEach>
		</table>
	</div>
	</div>

</body>
</html>