<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>插入user</title>
</head>
<body>
	<form action="/ssm01/insertOneUser.action" method="post">
		<span>姓名</span>
		<input type="text" name="userName" id="userName">
		<span id="name_result"></span>
		<br>

		<span>密码</span>
		<input type="text" name="password" id="password">
		<span id="pass_result"></span>
		<br>

		<span>电话</span>
		<input type="text" name="phone" id="phone">
		<span id="phone_result"></span>
		<br>

		<span>邮箱</span>
		<input type="text" name="email" id="email">
		<span id="email_result"></span>
		<br>

		<input type="submit" value="注册">
	</form>
</body>
</html>