<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-06-26
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Product</title>
</head>
<body>
    <div class="container">
    <h1>Product Registration</h1>

        <div class="productForm">
            <form:form action="/categories/new" method="post" modelAttribute="categoryObj">

                <form:label path="name">Product Name: </form:label>
                <form:errors path="name"/>
                <form:input path="name"/>


                <input type="submit" value="Create">


            </form:form>


        </div>


    </div>
</body>
</html>
