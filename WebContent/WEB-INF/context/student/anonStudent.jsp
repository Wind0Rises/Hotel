<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<% 	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>首页</title>
		<script type="text/javascript" src="<%=basePath %>resource/js/comment/jquery-3.1.1.min.js"></script>
	</head>
	<body>
		<div>
			<shiro:authenticated>
				<a href="<%=basePath %>sysuser/mainPage">登陆之后显示</a>
			</shiro:authenticated>
			
			<div>
				<a href="<%=basePath %>login">没登录也能显示显示</a><br>
				上面有一个登陆之后显示
			</div>
		</div>	
	</body>
</html>

