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
       			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>客房<c:choose><c:when test="${room == null }">添加</c:when><c:otherwise>编辑</c:otherwise> </c:choose></b>
       		</div>
        		
        	<!-- 下面是edit主体部分 -->
        	<!--  -->	
        	<div style="padding-left: 60px;border: solid red 1px;">
        		<form class="form-horizontal" id="form_edit">
        			<input type="hidden" name="id" id="id" value="${room.id }" />
					<div class="form-group">
				    	<label for="roomNo" class="col-sm-2 control-label">房间号：</label>
					    <div class="col-sm-10">
					      	<input class="form-control" id="roomNo" name="roomNo" value="${room.roomNo }" disabled >
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label for="level" class="col-sm-2 control-label">楼层：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="level" id="level" value="${room.level }" disabled >
					    </div>
					</div>
					<div class="form-group">
				    	<label for="original_price" class="col-sm-2 control-label">房间原件：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="original_price" id="original_price" value="${room.original_price }" disabled >
					    </div>
					</div>
					<div class="form-group">
				    	<label for="now_price" class="col-sm-2 control-label">房间现价：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="now_price" id="now_price" value="${room.now_price }" disabled >
					    </div>
					</div>
					
					<div class="form-group">
					    <label for="status" class="col-sm-2 control-label">预定状态：</label>
					    <div class="col-sm-10">
					    	<c:choose>
					    		<c:when test="${room.status != null}">
					    			<input type="radio" id="status" name="status" value="0" disabled <c:if test="${room.status == 0 }">checked</c:if> />空闲
					    			<input type="radio" id="status" name="status" value="1" disabled <c:if test="${room.status == 1 }">checked</c:if> />入住中
					    			<input type="radio" id="status" name="status" value="2" disabled <c:if test="${room.status == 2 }">checked</c:if> />清理中
					    		</c:when>
					    		<c:otherwise>
					    			<input type="radio" id="status" name="status" value="0" disabled checked />空闲
					    			<input type="radio" id="status" name="status" value="1" disabled  />入住中
					    			<input type="radio" id="status" name="status" value="2" disabled  />清理中
					    		</c:otherwise>
					    	</c:choose>
					    </div>
					</div>
					
					
					<div class="form-group">
				    	<label for="description" class="col-sm-2 control-label">描述：</label>
					    <div class="col-sm-10">
					      	<textarea class="form-control" name="description" name="description" rows="3" disabled >${room.description }</textarea>
					    </div>
					</div>
					
					
					<div class="form-group">
				    	<div class="col-sm-offset-2 col-sm-10">
					      	<button type="button" class="btn btn-info" onclick="javascript:window.history.go(-1)" style="margin-left: 300px;">返回</button>
					    </div>
				  	</div>
				</form>
        	</div>
        		
        </div>
        <script type="text/javascript">
			$(document).ready(function(){
				menu(4,0);
			});
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	};
		   	
		   $("#enterDate").datetimepicker();
		   $("#outDate").datetimepicker();
		   
		    
		    //提交修改
		    $("#form_edit").submit(function(){
		    	$.ajax({
		    		url:"<%=basePath %>room/save",
		    		data: $("#form_edit").serialize(),
		    		type: 'post',
		    		success: function(data){
		    			layer.confirm(data.message,{
		    				btn:['确定','取消']
		    			},function(index){
		    				location.href="<%=basePath %>room/list";
		    			},function(){
		    				location.reload();
		    			});
		    		},
		    		error: function(){
		    			console.log("保存error");
		    		}
		    	});
		    	return false;
		    });
		</script>
	</body>
</html>