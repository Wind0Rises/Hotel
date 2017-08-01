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
       			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>客房<c:choose><c:when test="${department == null }">添加</c:when><c:otherwise>编辑</c:otherwise> </c:choose></b>
       		</div>
        		
        	<!-- 下面是edit主体部分 -->
        	<!--  -->	
        	<div style="padding-left: 60px;border: solid red 1px;">
        		<form class="form-horizontal" id="form_edit">
        			<input type="hidden" name="departmentNo" id="departmentNo" value="${department.departmentNo }" />
					<div class="form-group">
				    	<label for="roomNo" class="col-sm-2 control-label">部门名称：</label>
					    <div class="col-sm-10">
					      	<input class="form-control" id="departmentName" name="departmentName" value="${department.departmentName }" placeholder="请填写部门名称">
					    </div>
				  	</div>
					<div class="form-group">
				    	<label for="original_price" class="col-sm-2 control-label">部门领导：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="supervisorNo" id="supervisorNo" value="${department.supervisorNo }" placeholder="请填写领导编号">
					    </div>
					</div>
					<div class="form-group">
				    	<label for="now_price" class="col-sm-2 control-label">上级部门：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="higherOfficeNo" id="higherOfficeNo" value="${department.higherOfficeNo }" placeholder="请填写上级部门编号">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="description" class="col-sm-2 control-label">部门描述：</label>
					    <div class="col-sm-10">
					      	<textarea class="form-control" name="description" name="description" rows="3" placeholder="描述（备注信息）">${department.description }</textarea>
					    </div>
					</div>
					
					<div class="form-group">
				    	<div class="col-sm-offset-2 col-sm-10">
					      	<button type="submit" class="btn btn-primary">确定</button>
					      	<button type="button" class="btn btn-info" onclick="javascript:window.history.go(-1)" style="margin-left: 300px;">返回</button>
					    </div>
				  	</div>
				</form>
        	</div>
        		
        </div>
        <script type="text/javascript">
			$(document).ready(function(){
				menu(1,0);
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
		    		url:"<%=basePath %>department/save",
		    		data: $("#form_edit").serialize(),
		    		type: 'post',
		    		success: function(data){
		    			layer.confirm(data.message,{
		    				btn:['确定','取消']
		    			},function(index){
		    				location.href="<%=basePath %>department/list";
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