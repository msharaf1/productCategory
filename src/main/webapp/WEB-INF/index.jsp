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
		<h1>Welcome Products related Categories of MSX</h1>
<%--		<c:out value="${productList.get(0).name}" />--%>

<%--		<forEach items="${employees}" var="employee">${employee.lastName}, ${employee.firstName}--%>
		<table>
			<thead>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Description</th>
			<th>Registered At</th>
			</thead>
			<tbody>
	<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.description}</td>
                <td>${product.price}</td>
				<td>${product.createdAt}</td>
			</tr>

			</tbody>
			</c:forEach>
		</table>
	</div>
<a href="/products/show">Product Page</a>

</body>
</html>