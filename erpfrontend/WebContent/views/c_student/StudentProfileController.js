myApp.controller("StudentProfileController", function($scope, $http, $location,$route) {
	console.log("In StudentProfileController");

	$scope.studentprofile = {
		"univRegNo":'',
		"aaddharNumber" : '',
		"firstName" : '',
		"lastName" : '',
		"middleName" : '',
		"gender" : '',
		"dateOfBirth" : '',
		"identificationMark":'',
		"religion":'',
		"tribeOrCommunity":''
	}
	$scope.insertStudent = function() {
		alert("In insert blog");
		console.log("In insertBlog method");
		$http.post('http://localhost:8081/erpmidware/addStudentProfile',
				$scope.studentprofile).then(function(response) {
					//$route.reload();
					console.log('Status Text ' + response.statusText);
					 //$location.path('/listBlogs');
			
		});
	};


	
	
});