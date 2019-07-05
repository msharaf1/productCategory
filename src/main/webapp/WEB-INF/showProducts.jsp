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
<%--		<h1>Product Name! <c:out value="${product.get().name}" /></h1>--%>
<%--		<c:if test = "${product.get().name == null}">--%>
<%--			<p style="font-size: 20px"> <c:out value = "Not found. Please enter another value or id"/><p>--%>
<%--		</c:if>--%>

<%--		<c:forEach items="${productList}" var="product">--%>
<%--			<li>${product.name}</li>--%>
<%--		</c:forEach>--%>

		<div class="subContainer">
<%--			<form:form action="/products/addcat" method="post" modelAttribute="catProduct" var="product">--%>
<%--&lt;%&ndash;				<form:hidden path=""&ndash;%&gt;--%>


<%--&lt;%&ndash;				<form:select path="category" >&ndash;%&gt;--%>
<%--&lt;%&ndash;					<form:option items="${categoriesList}" />&ndash;%&gt;--%>
<%--&lt;%&ndash;				</form:select>&ndash;%&gt;--%>
<%--&lt;%&ndash;			<form:select path="category">&ndash;%&gt;--%>

<%--&lt;%&ndash;				<c:forEach items="${categoriesList}" var="category">&ndash;%&gt;--%>
<%--&lt;%&ndash;					<form:option value="${category.id}">${category.name}</form:option>&ndash;%&gt;--%>
<%--&lt;%&ndash;				</c:forEach>&ndash;%&gt;--%>

<%--&lt;%&ndash;			</form:select>&ndash;%&gt;--%>
<%--				<input type="submit" value="Submit" />--%>
<%--			</form:form>--%>

			<form:form action="/addcat" modelAttribute="catProduct" var ="product">
				<form:hidden path="product" value="${product.id}" />
				<form:label path="category"> Add Category: </form:label>
				<form:select path="category">
					<c:forEach items="${categoriesList}" var="category">
						<form:option value="${category.id}"> ${category.name} </form:option>
					</c:forEach>
				</form:select>
				<input type="submit" value="Add to Category" />

			</form:form>

		</div>
	</div>

</body>
</html>