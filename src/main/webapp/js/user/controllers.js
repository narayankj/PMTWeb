/**
 * User Controller
 */

userMgmt.controller('userController', function ($scope, UserService) {
	
	$scope.userModelArray = new Array();
	 
	UserService.getAllUsers().then(function (data) {
       
        angular.forEach(data.data, function (um) {
            var p = new UserModel(um);
            $scope.userModelArray.push(p);
        });
    });
	
});