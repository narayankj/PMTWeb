/**
 * User Services
 */
userMgmt.service('UserService', function ($http) {
    
	this.addUser = function (data) {
        var promise = $http.post('/user/v1/add', data).
            success(function (data, status) {
                var result = data;
                return result;
            }).
            error(function (data, status) {
                var result = data;
                return result;
            });
        return promise;
    }
	
	this.updateUser = function (data) {
        var promise = $http.post('/user/v1/update', data).
            success(function (data, status) {
                var result = data;
                return result;
            }).
            error(function (data, status) {
                var result = data;
                return result;
            });
        return promise;
    }
	
	this.deleteUser = function (data) {
        var promise = $http.post('/user/v1/delete', data).
            success(function (data, status) {
                var result = data;
                return result;
            }).
            error(function (data, status) {
                var result = data;
                return result;
            });
        return promise;
    }
	
	this.getUser = function (id) {
        var promise = $http.get('/user/v1/get', id).
            success(function (data, status) {
                var result = data;
                return result;
            }).
            error(function (data, status) {
                var result = data;
                return result;
            });
        return promise;
    }
	
	this.getAllUsers = function () {
        var promise = $http.get('/user/v1/getall').
            success(function (data, status) {
                var result = data;
                return result;
            }).
            error(function (data, status) {
                var result = data;
                return result;
            });
        return promise;
    }
});