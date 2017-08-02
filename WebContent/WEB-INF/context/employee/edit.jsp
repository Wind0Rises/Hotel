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
       			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>人员<c:choose><c:when test="${employee == null }">添加</c:when><c:otherwise>编辑</c:otherwise> </c:choose></b>
       		</div>
        		
        	<!-- 下面是edit主体部分 -->
        	<!--  -->	
        	<div style="padding-left: 60px;border: solid red 1px;">
        		<form class="form-horizontal" id="form_edit">
					<div class="form-group">
				  		<label for="exampleInputFile" class="col-sm-2 control-label">上传图片</label>
				  		<div class="col-sm-10">
				  			<div class="col-sm-10" style="height: 200px;border: red solid 3px;">
				  				<img alt="" style="width: 180px;height: 180px;margin-top: 10px;" src="http://bpic.588ku.com/back_pic/02/66/65/68578b3fca8af67.jpg!/fh/300/quality/90/unsharp/true/compress/true" class="img-rounded">
				  				<img alt="" style="width: 180px;height: 180px;margin-top: 10px;" src="http://bpic.588ku.com/back_pic/02/66/65/68578b3fca8af67.jpg!/fh/300/quality/90/unsharp/true/compress/true" class="img-rounded">
				  				<img alt="" style="width: 180px;height: 180px;margin-top: 10px;" src="http://bpic.588ku.com/back_pic/02/66/65/68578b3fca8af67.jpg!/fh/300/quality/90/unsharp/true/compress/true" class="img-rounded">
				  			</div>
							<input type="file" name="exampleInputFile" id="exampleInputFile">
					    	<button type="button" class="btn btn-info" onclick="uploadImage()" >上传</button>				    
					    </div>
				 	</div>
        			<input type="hidden" name="id" id="id" value="${employee.id }" />
					<div class="form-group">
				    	<label for="employeeName" class="col-sm-2 control-label">姓名：</label>
					    <div class="col-sm-10">
					      	<input class="form-control" id="employeeName" name="employeeName" value="${employee.employeeName }" placeholder="请填写雇员姓名">
					    </div>
				  	</div>
				  	
					<div class="form-group">
				    	<label for="age" class="col-sm-2 control-label">年龄：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="age" id="age" value="${employee.age }" placeholder="请填写雇员年龄">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="date" class="col-sm-2 control-label">入住日期：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control date_form" name="date" id="date" value="${employee.date }" id="datetimepicker" data-date-format="yyyy-mm-dd" placeholder="请填写入职日期">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="salary" class="col-sm-2 control-label">薪资：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="salary" id="salary" value="${employee.salary }" placeholder="请填写薪资">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="reward" class="col-sm-2 control-label">奖金：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="reward" id="reward" value="${employee.reward }" placeholder="请填写奖金">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="departmentNo" class="col-sm-2 control-label">部门：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="departmentNo" id="departmentNo" value="${employee.departmentNo }" placeholder="请填写职位">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="postNo" class="col-sm-2 control-label">岗位：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="postNo" id="postNo" value="${employee.postNo }" placeholder="请填写岗位" >
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="description" class="col-sm-2 control-label">部门描述：</label>
					    <div class="col-sm-10">
					      	<textarea class="form-control" name="description" name="description" rows="3" placeholder="描述（备注信息）">${employee.description }</textarea>
					    </div>
					</div>
					
					
					
					<div class="form-group">
				    	<label for="images" class="col-sm-2 control-label">图片：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="images" id="images" value="${employee.images }" placeholder="请填写入职日期">
					    </div>
					</div>
					
					<%--<div class="form-group">
				    	<label for="status" class="col-sm-2 control-label">入住日期：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="status" id="status" value="${employee.status }" placeholder="请填写入职日期">
					    </div>
					</div>
					
					--%>
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
				menu(1,1);
			});
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	};
			
		   	
		   	$('#date').datetimepicker();
		    
		    //提交修改
		    $("#form_edit").submit(function(){
		    	$.ajax({
		    		url:"<%=basePath %>employee/save",
		    		data: $("#form_edit").serialize(),
		    		type: 'post',
		    		success: function(data){
		    			layer.confirm(data.message,{
		    				btn:['确定','取消']
		    			},function(index){
		    				location.href="<%=basePath %>employee/list";
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
		    
		    //上传图片
		    function uploadImage(){
		    	var formdata = new FormData();
		    	formdata.append('file',$('#exampleInputFile')[0].files[0]);
		    	$.ajax({
		    		url: "<%=basePath %>employee/upload",
		    		type: "post",
		    		//cache的作用就是第一次请求完毕之后，如果再次去请求，可以直接从缓存里面读取而不是再到服务器端读取。
		    		cache: false,
		    		data: formdata,
		    		processData: false,
		    		contentType: false,
		    		success: function(){
		    			alert("上传成功");
		    		},
		    		error: function(){
		    			alert("上传失败");
		    		}
		    	});
		    	
		    	<%-- alert(exampleInputFile);
		    	console.log($('#exampleInputFile')[0].files[0]);
		    	var files = $('input[name="exampleInputFile"]').prop('files');
		    	
		    	formData.append("file","asdf");
		    	
		    	console.log(files);
		    	
		    	console.log(files[0]);
		    	
		    	console.log(formData);
		    	$.ajax({
		    		url: "<%=basePath %>employee/upload",
		    		type: "post",
		    		data: {"exampleInputFile":exampleInputFile},
		    		success: function(){
		    			alert("上传成功");
		    		},
		    		error: function(){
		    			alert("上传失败");
		    		}
		    	}); --%>
		    };
		</script>
	</body>
</html>