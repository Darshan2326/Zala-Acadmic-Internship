// Define AngularJS application module
var app = angular.module('myApp', []);

// Define custom service
app.service('TextManipulationService', function() {
    this.reverse = function(input) {
        return input.split('').reverse().join('');
    };
});

// Define controller
app.controller('MainController', ['$location', '$http', '$timeout', 'TextManipulationService', function($location, $http, $timeout, TextManipulationService) {
    var vm = this;

    // $location service example
    vm.currentUrl = $location.absUrl();

    // $http service example
    vm.fetchData = function() {
        $http.get('https://jsonplaceholder.typicode.com/posts/1')
            .then(function(response) {
                vm.data = response.data;
                vm.error = null;
            })
            .catch(function(error) {
                vm.data = null;
                vm.error = 'Error fetching data: ' + error.statusText;
            });
    };

    // $timeout service example
    vm.startTimer = function() {
        vm.timer = 'Timer started!';
        $timeout(function() {
            vm.timer = null;
        }, 3000); // 3 seconds delay
    };

    // Custom service example
    vm.manipulateText = function() {
        vm.outputText = TextManipulationService.reverse(vm.inputText);
    };
}]);
