<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="userMgmt">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>ProjectManagementTool</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
		<script language="javascript" src="<%=request.getContextPath()%>/js/application.js"></script>
		<script language="javascript" src="<%=request.getContextPath()%>/js/user/controllers.js"></script>
		<script language="javascript" src="<%=request.getContextPath()%>/js/user/model.js"></script>
		<script language="javascript" src="<%=request.getContextPath()%>/js/user/service.js"></script>
	</head>
	<body>	
		<h1 align="center">Demo</h1>
		<div id="pageBodyData"></div>
			<script type="text/javascript">	
				$(document).ready(function(){
					showData('listusers');	
				});
				
				function showData(actionUrl) {
				    var options = {
						url : actionUrl,
						type : "GET",
						async : true,
						success : function(data, successCode, XMLHTTPRequestObject) {
							$("#pageBodyData").html(data);
						},
						error : function(data, errorCode, XMLHTTPRequestObject){
							alert(data	);
						}
				    };
				    $.ajax(options);
				}	
			</script>
		
		
	
	 </body>
</html>