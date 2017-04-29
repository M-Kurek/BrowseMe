'use strict';

var listDetailsApp = angular.module("listDetailsApp", ['ngSanitize']);

listDetailsApp.controller('listDetailsController', function($scope, $http) {
    $scope.cnt = 3;
    $scope.loadList = function() {
        $http({
            method: 'GET',
            url: 'more?cnt=' + (!$scope.cnt || $scope.cnt < 1 ? 1 : $scope.cnt)
        }).then(function successCallback(response) {
            $scope.listOfData = response.data.datLines;
        }, function errorCallback(response) {
            console.log('cannot load  : ', response);
        });
    };
});