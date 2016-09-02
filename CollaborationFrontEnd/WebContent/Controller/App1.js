
var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    
    .when("/blog", {
        templateUrl : "Blog.html",
        controller: 'BlogController'
    })
    .when("/forum", {
        templateUrl : "Forum.html"
    })
    .when("/chat", {
        templateUrl : "Chat.html"
    });
});

mainApp.controller('BlogController', function($scope) {
    $scope.message = "Blog Page is under Construction....";
 });
