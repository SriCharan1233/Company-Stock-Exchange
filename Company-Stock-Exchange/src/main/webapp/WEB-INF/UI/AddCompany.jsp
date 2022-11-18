<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">

<title>Add Company</title>
</head>
<body class="container">
	<div class="display-1" style="text-align: center">New Company</div>
	<hr />
	<div class="col d-flex justify-content-center">
		<div class="col-6">
			<div class="card">
				<div class="card-header">
					<h6>New Company Register</h6>
				</div>
				<div class="card-body">
					<form action="addingCompany" method="post">
						<div class="form-group">
							<label class="form-control-label" for="CompanyID">CompanyID</label>
							<input type="number" class="form-control" id="CompanyID"
								placeholder="Enter Company_ID" name="CompanyID" />
						</div>
						<div class="form-group">
							<label class="form-control-label" for="CompanyName">CompanyName</label>
							<input type="text" class="form-control" id="CompanyName"
								placeholder="Enter CompanyName" name="CompanyName" />
						</div>
						<div class="form-group">
							<label class="form-control-label" for="SharePrice">SharePrice</label>
							<input type="number" class="form-control" id="SharePrice"
								placeholder="SharePrice" name="SharePrice" />
						</div>
						<hr />
						<div class="text-center">
							<button type="submit" class="btn btn-info col-2"
								style="align: center">submit</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>