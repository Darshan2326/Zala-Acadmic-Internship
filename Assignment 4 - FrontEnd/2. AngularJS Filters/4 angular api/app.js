var app = angular.module('textApp', []);

app.controller('TextController', ['$scope', function($scope) {
    $scope.inputText = '';

    $scope.$watch('inputText', function(newValue) {
        console.log('Input Text:', newValue); // Debugging: Log input text
        $scope.lowercaseText = angular.lowercase(newValue || '');
        $scope.uppercaseText = angular.uppercase(newValue || '');
        console.log('Lowercase Text:', $scope.lowercaseText); // Debugging: Log lowercase text
        console.log('Uppercase Text:', $scope.uppercaseText); // Debugging: Log uppercase text
    });
}]);
