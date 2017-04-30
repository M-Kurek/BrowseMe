<html>

<head>
    <script src="vendor/jquery-3.1.1.min.js"></script>
    <script src="vendor/angular/angular.min.js"></script>
    <script src="vendor/angular/angular-route.min.js"></script>
    <script src="vendor/angular/angular-sanitize.min.js"></script>
    <script src="angulars/app.js"></script>
    <link rel="stylesheet" href="css/bootstrap.min.css" />
</head>

<body ng-app="listDetailsApp" ng-controller="listDetailsController">
    <div class="container">
        <h5>${message}</h5>
        <div>
            <form name="numForRepeat">
                <label class="description" for="element_1">repeat </label>
                <input name="cnt" type="text" maxlength="6" length="6" value="" ng-model="cnt" ng-pattern="/^[0-9]{1,6}$/">
                <span ng-show="numForRepeat.cnt.$error.pattern">Not valid number!</span>
                <p>
                    <button ng-click="loadList()">load</button>
                </p>
            </form>
        </div>
        <div style="padding-left : 40px">
            <ol>
                <li ng-repeat="lineData in listOfData">
                    {{lineData.aFld}} | {{lineData.bFld}} | {{lineData.cFld}} | {{lineData.dFld}} | {{lineData.tic_0}} | {{lineData.tic_1}} | {{lineData.tic_2}}
                    {{$first ? loadStarts() : ''}}
                    {{$last ? loadEnding() : ''}}
                </li>
            </ol>
        </div>
    </div>
</body>

</html>