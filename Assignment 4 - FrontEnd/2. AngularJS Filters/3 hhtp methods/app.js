// Define AngularJS application module
var app = angular.module('myApp', []);

// Define controller
app.controller('MainController', ['$http', function($http) {
    var vm = this;

    // Function to perform HTTP GET request
    vm.getData = function() {
        $http.get('https://jsonplaceholder.typicode.com/posts/1')
            .then(function(response) {
                // Success
                vm.getDataResponse = 'Response Status: ' + response.status + '\n';
                vm.getDataResponse += 'Response Data: ' + JSON.stringify(response.data);
            })
            .catch(function(error) {
                // Error
                vm.getDataError = 'Error Status: ' + error.status + '\n';
                vm.getDataError += 'Error Data: ' + JSON.stringify(error.data);
            });
    };

    // Function to perform HTTP POST request
    vm.postDataRequest = function() {
        var postData = {
            data: vm.postData
        };
        $http.post('https://jsonplaceholder.typicode.com/posts', postData)
            .then(function(response) {
                // Success
                vm.postDataResponse = 'Response Status: ' + response.status + '\n';
                vm.postDataResponse += 'Response Data: ' + JSON.stringify(response.data);
            })
            .catch(function(error) {
                // Error
                vm.postDataError = 'Error Status: ' + error.status + '\n';
                vm.postDataError += 'Error Data: ' + JSON.stringify(error.data);
            });
    };
}]);
