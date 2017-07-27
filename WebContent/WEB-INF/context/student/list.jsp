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
	       		${rooms }
	       		
	       	</div>
		</div>
	</body>
</html>

