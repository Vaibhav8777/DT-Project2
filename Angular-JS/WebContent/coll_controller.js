var app = angular.module("myApp",[])
app.controller("myCtrl",function($scope)
		{
	
	$scope.fname="Vaibhav"
	$scope.lname="K"
	$scope.fullname=function()
	{
		return $scope.fname+$scope.lname
		
	}
		}
		
)