<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap CSS CDN -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link rel="stylesheet" href="css/custom.css">
<!-- jQuery CDN -->
<script src="js/jquery-1.12.0.js"></script>
<!-- Bootstrap Js CDN -->
<script src="js/bootstrap.min.js"></script>

<!-- Angular JS CDN -->
<script src="angular/js/angular.min.js"></script>
<script src="angular/js/angular-route.js"></script>
<script src="angular/js/angular-cookies.js"></script>

<!-- Custom view angular JS controller -->
<script src="myroute/customroute.js"></script>
<script src="views/c_student/StudentProfileController.js"></script>


<title>ALDER COLLEGE</title>
</head>
<body ng-app="myApp">

	<div class="wrapper">
		<!-- Sidebar Holder -->
		<nav id="sidebar">
		<div class="sidebar-header">
			<h3>ALDER COLLEGE</h3>
			<strong>AC</strong>
		</div>

		<ul class="list-unstyled components">
			<li class="active"><a href="#homeSubmenu" data-toggle="collapse"
				aria-expanded="false" target="_self"> <i
					class="glyphicon glyphicon-home"></i> STUDENT
			</a>
				<ul class="collapse list-unstyled" id="homeSubmenu">
					<li><a href="#!AddStudent">Add New</a></li>
					<li><a href="#">Home 2</a></li>
					<li><a href="#">Home 3</a></li>
				</ul></li>

		</ul>


		</nav>
		<!--  Page holder -->
		<div id="content">

			<nav class="navbar navbar-default">
			<div class="container-fluid">

				<div class="navbar-header">
					<button type="button" id="sidebarCollapse"
						class="btn btn-info navbar-btn">
						<i class="glyphicon glyphicon-align-left"></i> <span>Toggle
							Sidebar</span>
					</button>
				</div>

				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="">Page</a></li>
						<li><a href="#">Page</a></li>
						<li><a href="#">Page</a></li>
						<li><a href="#">Page</a></li>
					</ul>
				</div>
			</div>
			</nav>

			<div ng-view></div>

		</div>




	</div>


























	<script type="text/javascript">
             $(document).ready(function () {
                 $('#sidebarCollapse').on('click', function () {
                     $('#sidebar').toggleClass('active');
                 });
             });
         </script>




</body>
</html>