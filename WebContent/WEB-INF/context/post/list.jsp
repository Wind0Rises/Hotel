<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/context/common/common_meta.jsp"%>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/WEB-INF/context/common/common_css.jsp"%>
		<link rel="styleSheet" href="<%=basePath%>resource/css/mainPage/mainPage.css">
		<%@ include file="/WEB-INF/context/common/common_js.jsp"%>
		<title>首页</title>
	</head>
	<body>
        <%@ include file="/WEB-INF/context/common/common_head.jsp"%>
		<div>
			<%@ include file="/WEB-INF/context/common/common_left.jsp"%>
			<!--
	           	作者：offline
	           	时间：2017-05-18
	           	描述：主题内容
	         -->
	       	<div id="main">
	       		<img src="<%=basePath%>resource/images/common/welcome2.png">
	       	</div>
		</div>
		<script type="text/javascript">
			$(document).ready(function(){
				menu(1,2);
				intiDate();
			});
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	};
	  	</script>
	</body>
</html>

