<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/context/common/common_meta.jsp"%>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/WEB-INF/context/common/common_css.jsp"%>
		<%@ include file="/WEB-INF/context/common/common_js.jsp"%>	
		<style type="text/css">
			
			
		</style>
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
       			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>人员<c:choose><c:when test="${employee == null }">添加</c:when><c:otherwise>编辑</c:otherwise> </c:choose></b>
       		</div>
        		
        	<!-- 下面是edit主体部分 -->
        	<!--  -->	
        	<div style="padding-left: 60px;border: solid red 1px;">
        		<div class="form-horizontal" id="form_edit" style="padding-top: 25px;">
					<div class="form-group">
				    	<label class="col-sm-2 control-label">姓名：</label>
					    <div class="col-sm-10">
					      	<input type="text" class="form-control" value="${employee.employeeName }"  disabled >
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label for="age" class="col-sm-2 control-label">年龄：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" value="${employee.age }" disabled>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label class="col-sm-2 control-label">手机号：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control"  value="${employee.phone }" disabled>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label class="col-sm-2 control-label">电子邮件：</label>
					    <div class="col-sm-10">
					      <input  type="text" class="form-control"  value="${employee.email }" disabled>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="date" class="col-sm-2 control-label">入住日期：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control date_form" value="${employee.date }" id="datetimepicker" data-date-format="yyyy-mm-dd" disabled>
					    </div>
					</div>
					<div class="form-group">
				    	<label class="col-sm-2 control-label">薪资：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" value="${employee.salary }" disabled>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label  class="col-sm-2 control-label">奖金：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" value="${employee.reward }" disabled>
					    </div>
					</div>
					<div class="form-group">
				    	<label class="col-sm-2 control-label">部门：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" value="${employee.departmentNo }" disabled>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="status" class="col-sm-2 control-label">状态：</label>
					    <div class="col-sm-10">
				    		<label class="radio-inline">
						      <input type="radio" name="status" id="status1" value="1" <c:if test="${employee.status == 1 }">checked</c:if> >在职
						    </label>
						    <label class="checkbox-inline">
						      <input type="radio" name="status" id="status2" value="0" <c:if test="${employee.status == 0 }">checked</c:if> >离职
						   	</label>
						    <label class="checkbox-inline">
						      <input type="radio" name="status" id="status3" value="2" <c:if test="${employee.status == 2 }">checked</c:if> >休假
						    </label>
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="postNo" class="col-sm-2 control-label">岗位：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" value="${employee.postNo }" disabled >
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="description" class="col-sm-2 control-label">部门描述：</label>
					    <div class="col-sm-10">
					      	<textarea class="form-control" name="description" disabled >${employee.description }</textarea>
					    </div>
					</div>
					<div class="form-group" id="imageContainer">
				  		<label for="exampleInputFile" class="col-sm-2 control-label">上传图片:</label>
				  		<div class="col-sm-10" id="leftImageContainer">
				  			<div class="col-sm-12" id="imageContent">
				  				<img alt="未上传" id="image_0"  style="width: 180px;height: 180px;margin-top: 10px;" src="" class="img-rounded imageClass0">
				  				<img alt="未上传" id="image_1"  style="width: 180px;height: 180px;margin-top: 10px;" src="" class="img-rounded imageClass1">
				  				<img alt="未上传" id="image_2"  style="width: 180px;height: 180px;margin-top: 10px;" src="" class="img-rounded imageClass2">
				  			</div>
					    </div>
				 	</div>
					
					<div class="form-group">
				    	<div class="col-sm-offset-2 col-sm-10" style="margin-top: -58px;">
					      	<button type="button" onclick="back()" class="btn btn-primary">返回</button>
					    </div>
				  	</div>
				</div>
        	</div>
        		
        </div>
        <script type="text/javascript">
        
	       	$(document).ready(function(){
				menu(1,1);
				diaplayImage("${employee.images }");
			});
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	};
			
		   	
		   	$('#date').datetimepicker();
		   	
			/*
		   		返回上一级
		   	*/
		   	var back = function(){
		   		history.go(-1);
		   	};
	    	
	    	//图片显示与加载
	    	var diaplayImage = function(images){
	    		var imageList = images.split(",");
	    		//先隐藏
	    		for(var i=0; i < 3;i++){
	    			var imageClass = ".imageClass" + i;
	    			$(imageClass).css("display","none");
	    		}
	    		
	    		//循环设值和显示
	    		if(images != null && images != ""){
	    			for(var i in imageList){
		    			var image_id = "#image_" + i;
	    				$(image_id).attr("src","<%=basePath %>image/employee/" + imageList[i]);
		    			var imageClass = ".imageClass" + i;
		    			$(imageClass).css("display","block");
		    		}
	    		}
	    	};
		</script>
	</body>
</html>