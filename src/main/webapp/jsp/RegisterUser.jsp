<!DOCTYPE html>
<html lang="en">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<head>
<title>Register</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container text-center text-center">
		<form class="form-horizontal" role="form">
			<center>
				<h2>Registration Form</h2>
			</center>

			<form method="POST" action="/registerUser" modelAttribute="user">
				<div class="form-group">
					<label for="firstName" class="col-sm-3 control-label">UserName</label>
					<div class="col-sm-4">
					<input type="text" name="userName" placeholder="Full Name"class="form-control" autofocus>
                   </div>
				</div>
				<div class="form-group">
					<label for="password" class="col-sm-3 control-label">Password</label>
					<div class="col-sm-4">
						<input type="password" name="password" placeholder="Password"
							class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label for="Confirm Password" class="col-sm-3 control-label">Confirm
					</label>
					<div class="col-sm-4">
						<input type="text" name="confirmed" placeholder="Confirm"
							class="form-control">
					</div>
				</div>

				<div class="form-group">
					<label for="firstName" class="col-sm-3 control-label">Email
						Id</label>
					<div class="col-sm-4">
						<input type="text" name="email" placeholder="email"
							class="form-control" autofocus>

					</div>
				</div>

				<div class="form-group">
					<label for="firstName" class="col-sm-3 control-label">Mobile
						Number</label>
					<div class="col-sm-4">
						<input type="text" name="mobileNumber" placeholder="mobile"
							class="form-control" autofocus>

					</div>
				</div>
				<div class="form-group">
					<label for="type" class="col-sm-3 control-label">UserType</label>
					<div class="col-sm-4">
						<input type="text" name="userType" placeholder="user type"
							class="form-control" autofocus>
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-2 col-sm-offset-3">
						<button type="submit" class="btn btn-info">Submit</button>
					</div>
				</div>
			</form>
			<!-- /form -->
	</div>
	<!-- ./container -->



</body>

</html>
