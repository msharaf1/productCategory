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


		<table>
			<thead>
			<th>Categor ID</th>
			<th>Product Name</th>
			</thead>
			<tbody>
	<c:forEach items="${categoryList}" var="category">
			<tr>
				<td>${category.id}</td>
				<td>${category.name}</td>
			</tr>

			</tbody>
			</c:forEach>
		</table>
	</div>

</body>
</html>