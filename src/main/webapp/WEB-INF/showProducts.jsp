<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		<h1>Product Name! <c:out value="${product.get().name}" /></h1>
		<c:if test = "${product.get().name == null}">
			<p style="font-size: 20px"> <c:out value = "Not found. Please enter another value or id"/><p>
		</c:if>

		<c:forEach items="${productList}" var="product">
			<li>${product.name}</li>
		</c:forEach>

		<div class="subContainer">
<%--			<form:form action="/products/{id}" method="post" modelAttribute="catObj" var="">--%>
<%--				<form:hidden path=""--%>


<%--				<form:select path="category" >--%>
<%--					<form:option items="${categoriesList}" />--%>
<%--				</form:select>--%>
<%--			<form:select path="category">--%>

<%--				<c:forEach items="${categoriesList}" var="category">--%>
<%--					<form:option value="${category.id}">${category.name}</form:option>--%>
<%--				</c:forEach>--%>

<%--			</form:select>--%>
<%--			</form:form>--%>
	</div>
	</div>

</body>
</html>