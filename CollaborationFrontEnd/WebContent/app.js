var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "index.html",
    })
    .when("/blog", {
        templateUrl : "Blog.html",
        //controller : "blogCtrl"
    })
    .when("/chat", {
        templateUrl : "Chat.html",
        //controller : "chatCtrl"
    });
});
// app.controller("blogCtrl", function ($scope) {
//     $scope.msg = "I love London";
// });
// app.controller("chatCtrl", function ($scope) {
//     $scope.msg = "I love Paris";
// });

