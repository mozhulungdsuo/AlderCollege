var myApp=angular.module("myApp",['ngRoute','ngCookies']);

myApp.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "views/c_home/home.jsp"
	})
	.when("/AddStudent",{
		templateUrl :"views/c_student/addStudent.jsp"
	})
	

});
