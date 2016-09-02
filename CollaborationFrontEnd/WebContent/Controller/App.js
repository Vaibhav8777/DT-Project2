 var mainApp = angular.module("mainApp", ['ngRoute']);
         mainApp.config(['$routeProvider', function($routeProvider) {
            $routeProvider.
            
            when("/blog", {
               templateUrl: '/Blog.htm',
               controller: 'BlogController'
            })
            
            .when('/Forum', {
               templateUrl: 'Forum.htm',
               controller: 'ForumController'
            })
            
            
         }]);
         
        mainApp.controller('BlogController', function($scope) {
            $scope.message = "Blog Page is under Construction....";
        });
         
         mainApp.controller('ForumController', function($scope) {
            $scope.message = "Forum Page is Under Construction....";
         });