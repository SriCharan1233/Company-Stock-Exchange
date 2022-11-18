<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.stockexchange.model.CompanyStocks"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>company Stocks Home</title>
<div class="container my-2">
	<h1 align="center">
		<b>Company Share List</b>
	</h1>
	<a href="NewCompanyForm" class="btn btn-primary btn-sm mb-3">Enlist
		a New Company</a><br> <br>
</div>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">


</head>
<body>
	<div align="center" class="container my-2">

		<table border="1" class="table table-striped table-responsive-md">
			<thead>
				<tr>
					<th>Company_ID</th>
					<th>Company_Name</th>
					<th>Share_Price</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="CompanyList" items="${CompanyList}">
					<tr ${listCompanyStocks}>
						<td>${CompanyList.getCompany_ID()}</td>
						<td>${CompanyList.getCompany_Name()}</td>
						<td>${CompanyList.getStock_Price()}</td>
						<td><a href="UpdateSharePrice?id=${CompanyList.getCompany_ID()}" class="btn btn-primary">Edit
								Share Price</a> <a href="DeleteCompany?id=${CompanyList.getCompany_ID()}" class="btn btn-danger">Delete
								Company</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>

	</div>

</body>
</html>