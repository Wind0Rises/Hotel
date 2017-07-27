<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/context/common/common_meta.jsp"%>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/WEB-INF/context/common/common_css.jsp"%>
		<%@ include file="/WEB-INF/context/common/common_js.jsp"%>	
		<title>酒店管理系统</title>
	</head>
	<body>
		
        <%@ include file="/WEB-INF/context/common/common_head.jsp"%>
		<%@ include file="/WEB-INF/context/common/common_left.jsp"%>
		<!--
           	作者：offline
           	时间：2017-05-18
           	描述：主题内容
         -->
       	<div id="main">
       		<div id="address">
       			<a href="#" ><span class="glyphicon glyphicon-home"></span> Home</a>
       			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>订单详情</b>
       		</div>
        		
        	<!-- 下面是edit主体部分 -->
        	<!--  -->	
        	<div style="padding-left: 60px;border: solid red 1px;">
        		<div class="form-horizontal" id="form_edit" style="margin-top:50px;">
        			<input type="hidden" name="id" id="id" value="${order.id }" />
        			<input type="hidden" name="date" id="date" value="${order.date }" />
					<div class="form-group">
				    	<label for="orderName" class="col-sm-2 control-label">预定人姓名：</label>
					    <div class="col-sm-10">
					      	<input class="form-control" id="orderName" name="orderName" value="${order.orderName }" disabled>
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label for="IDCard" class="col-sm-2 control-label">身份证号：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="IDCard" id="IDCard" value="${order.IDCard }" disabled>
					    </div>
					</div>
					<div class="form-group">
				    	<label for="phone" class="col-sm-2 control-label">联系方式：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="phone" id="phone" value="${order.phone }" disabled>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="outDate" class="col-sm-2 control-label">预计退房时间：</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control date_form" name="outDate" id="outDate" value="${order.outDate }" disabled data-date-format="yyyy-mm-dd hh:ii"> 		     
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="enterDate" class="col-sm-2 control-label">预计退房时间：</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control date_form" name="enterDate" id="enterDate" value="${order.enterDate }" disabled data-date-format="yyyy-mm-dd hh:ii"> 		     
					    </div>
					</div>
					
					
					<div class="form-group">
					    <label for="status" class="col-sm-2 control-label">预定状态：</label>
					    <div class="col-sm-10">
					    	<c:choose>
					    		<c:when test="${order.status != null}">
					    			<input type="radio" id="status" name="status" disabled value="1" <c:if test="${order.status == 1 }">checked</c:if> />入住中
					    			<input type="radio" id="status" name="status" disabled value="0" <c:if test="${order.status == 0 }">checked</c:if> />订单已结束
					    		</c:when>
					    		<c:otherwise>
					    			<input type="radio" id="status" name="status" disabled value="1" checked />入住中
					    			<input type="radio" id="status" name="status" disabled value="0"  />订单已结束
					    		</c:otherwise>
					    	</c:choose>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="other" class="col-sm-2 control-label">备注：</label>
					    <div class="col-sm-10">
					      	<textarea class="form-control" name="other" name="other" rows="3" disabled >${order.other }</textarea>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="date" class="col-sm-2 control-label">预计退房时间：</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control date_form" name="date" id="date" value="${order.date }" disabled data-date-format="yyyy-mm-dd hh:ii"> 		     
					    </div>
					</div>
					
					<div class="form-group">
				    	<div class="col-sm-offset-2 col-sm-10">
					      	<button type="button" onclick="back()" class="btn btn-primary">返回</button>
					    </div>
				  	</div>
				</div>
        	</div>
        		
        </div>
        <script type="text/javascript">
			$(document).ready(function(){
				menu(4,1);
			});
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	};
		   	
		   	/*
		   		返回上一级
		   	*/
		   	var back = function(){
		   		history.go(-1);
		   	};
		   	
		   	
		</script>
	</body>
</html>