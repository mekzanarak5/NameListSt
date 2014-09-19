<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Login</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link href="css/styles.css" rel="stylesheet">
	</head>
        <form action="Login">
	<body bgcolor="#C2C2C2" >
<!--login modal-->
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  
  
      <div class="modal-header">
          
          <h1 class="text-center">Login</h1>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block">
            <div class="form-group" align ="center">
              <input type="text" class="form-control input-lg" name="TUsername" placeholder="Username">
            </div>
            <div class="form-group" align ="center">
              <input type="password" class="form-control input-lg" name="TPassword" placeholder="Password">
            </div>
            <div class="form-group" align="center">
              <button class="btn btn-primary btn-lg">Sign In</button>
              <button class="btn btn-danger btn-lg"  aria-hidden="true">Cancel</button>
              <font color="red">${msg}</font>
            </div>
          </form>
      </div>
    
  
  
</div>
	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
        </form>
	</body>
</html>