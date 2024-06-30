// app.js
var app = angular.module('studentApp', []);

app.controller('StudentController', ['$scope', function($scope) {
    $scope.students = [];

    $scope.initialize = function() {
        $scope.students = [
        
        ];
        $scope.newStudent = {};
    };

    $scope.addStudent = function() {
        if ($scope.newStudent.name && $scope.newStudent.age) {
            $scope.students.push($scope.newStudent);
            $scope.newStudent = {};
        }
    };

    $scope.removeStudent = function(index) {
        $scope.students.splice(index, 1);
    };
}]);
