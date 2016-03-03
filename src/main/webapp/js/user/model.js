/**
 * User Model
 */
$(function () {
	
	UserModel = (function () {	      
        var userModel = function UserModel(data) {
            this.id = data.id;
            this.userName = data.userName;
            this.password = data.password;
            this.firstName = data.firstName;
            this.lastName = data.lastName;
            this.email = data.email;
            this.lastLogin = new Date(data.lastLogin);
            this.enabled = data.enabled;
            this.createDate = new Date(data.createDate);
            var createdBy = data.createdBy;
            this.lastUpdateDate = new Date(data.lastUpdateDate);
            this.lastUpdateUser = data.lastUpdateUser;
        }
        return userModel;
    }());
});