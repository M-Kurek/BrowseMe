'use strict';

var listDetailsApp = angular.module("listDetailsApp", ['ngSanitize']);

listDetailsApp.controller('listDetailsController', function($scope, $http) {
    $scope.cnt = 3;
    $scope.loadList = function() {
        console.log('loading ' + $scope.cnt + ' / ' + new Date());
        $http({
            method: 'GET',
            url: 'more?cnt=' + (!$scope.cnt || $scope.cnt < 1 ? 1 : $scope.cnt)
        }).then(function successCallback(response) {
            $scope.listOfData = response.data.datLines;
        }, function errorCallback(response) {
            console.log('cannot load  : ', response);
        });
    };
    $scope.loadStarts = function() {
        console.log('render starts ' + new Date());
    }
    $scope.loadEnding = function() {
        console.log('render ending ' + new Date());
    }
});