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
        		<form class="form-horizontal" id="form_edit">
        			<input type="hidden" name="id" id="id" value="${employee.id }" />
					<input type="hidden" name="images" id="images" value="${employee.images }"  >
					<div class="form-group">
				    	<label for="employeeName" class="col-sm-2 control-label">姓名：</label>
					    <div class="col-sm-10">
					      	<input class="form-control" id="employeeName" name="employeeName" value="${employee.employeeName }" placeholder="请填写雇员姓名">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<label for="age" class="col-sm-2 control-label">年龄：</label>
					    <div class="col-sm-10">
					      <input pattern="^([0-9]|[1-9][0-9]|1[0-3][0-9])$" title="输入有误" type="text" class="form-control" name="age" id="age" value="${employee.age }" placeholder="请填写雇员年龄">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="phone" class="col-sm-2 control-label">手机号：</label>
					    <div class="col-sm-10">
					      <input pattern="^1[34578]\d{9}$" title="输入有误" type="text" class="form-control" name="phone" id="phone" value="${employee.phone }" placeholder="请填写手机号码">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="email" class="col-sm-2 control-label">电子邮件：</label>
					    <div class="col-sm-10">
					      <input pattern="^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$" title="输入有误" type="text" class="form-control" name="email" id="email" value="${employee.email }" placeholder="请填写电子邮件">
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
					      <input type="text" pattern="^\d+(\.\d+)?$" title="请输入正确的格式" class="form-control" name="salary" id="salary" value="${employee.salary }" placeholder="请填写薪资">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="reward" class="col-sm-2 control-label">奖金：</label>
					    <div class="col-sm-10">
					      <input type="text" pattern="^\d+(\.\d+)?$" title="请输入正确的格式"	 class="form-control" name="reward" id="reward" value="${employee.reward }" placeholder="请填写奖金">
					    </div>
					</div>
					<div class="form-group" id="imageContainer">
				  		<label for="exampleInputFile" class="col-sm-2 control-label">上传图片:</label>
				  		<div class="col-sm-10" id="leftImageContainer">
				  			<div class="col-sm-12" id="imageContent">
				  				<img alt="未上传" id="image_0"  style="width: 180px;height: 180px;margin-top: 10px;" src="" class="img-rounded imageClass0">
				  				<div class="btn btn-primary  imageClass0" onclick="deleteImage(0)">删除</div>
				  				<img alt="未上传" id="image_1"  style="width: 180px;height: 180px;margin-top: 10px;" src="" class="img-rounded imageClass1">
				  				<div class="btn btn-primary  imageClass1" onclick="deleteImage(1)">删除</div>
				  				<img alt="未上传" id="image_2"  style="width: 180px;height: 180px;margin-top: 10px;" src="" class="img-rounded imageClass2">
				  				<div class="btn btn-primary  imageClass2" onclick="deleteImage(2)">删除</div>
				  			</div>
							<input type="file" name="exampleInputFile" id="exampleInputFile">
					    	<button type="button" id="uploadBtn" class="btn btn-info" onclick="uploadImage()" >上传</button>				    
					    </div>
				 	</div>
				  	
					<div class="form-group">
				    	<label for="departmentNo" class="col-sm-2 control-label">部门：</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="departmentNo" id="departmentNo" value="${employee.departmentNo }" placeholder="请填写职位">
					    </div>
					</div>
					
					<div class="form-group">
				    	<label for="status" class="col-sm-2 control-label">状态：</label>
					    <div class="col-sm-10">
						    <c:choose>
						    	<c:when test="${employee.status != null }">
						    		<label class="radio-inline">
								      <input type="radio" name="status" id="status1" value="1" <c:if test="${employee.status == 1 }">checked</c:if> >在职
								    </label>
								    <label class="checkbox-inline">
								      <input type="radio" name="status" id="status2" value="0" <c:if test="${employee.status == 0 }">checked</c:if> >离职
								   	</label>
								    <label class="checkbox-inline">
								      <input type="radio" name="status" id="status3" value="2" <c:if test="${employee.status == 2 }">checked</c:if> >休假
								    </label>
						    	</c:when>
						    	<c:otherwise>
						    		<label class="radio-inline">
								      <input type="radio" name="status" id="status1" value="1" checked >在职
								    </label>
								    <label class="checkbox-inline">
								      <input type="radio" name="status" id="status2" value="0" >离职
								   	</label>
								    <label class="checkbox-inline">
								      <input type="radio" name="status" id="status3" value="2" >休假
								    </label>
						    	</c:otherwise>
						    </c:choose>
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
		    
		    //提交修改
		    $("#form_edit").submit(function(){
		    	console.log("submit");
		    	$.ajax({
		    		url:"<%=basePath %>employee/save",
		    		data: $("#form_edit").serialize(),
		    		type: 'post',
		    		success: function(data){
		    			console.log("进入成功");
		    			if(data.message == null || data.message == ""){
		    				layer.confirm("操作失败！确定返回列表页面，取消留在编辑页面！",{
			    				btn:['确定','取消']
			    			},function(index){
			    				location.href="<%=basePath %>employee/list";
			    			},function(){
			    				location.reload();
			    			});
		    			}else{
		    				layer.confirm(data.message,{
			    				btn:['确定','取消']
			    			},function(index){
			    				location.href="<%=basePath %>employee/list";
			    			},function(){
			    				location.reload();
			    			});
		    			}
	    				
		    			
		    		},
		    		error: function(){
		    			console.log("进入失败");
		    			layer.msg("保存错误！");
		    		}
		    	});
		    	return false;
		    });
		    
		  	//删除文件
	    	var deleteImage = function (i){
	    		var imageId = "#image_" + i;
	    		var src= $(imageId).attr("src");
	    		var fileName = src.substr(src.lastIndexOf("/") +1);
	    		
			  	layer.confirm('您确定删除图片！？',{
			  		btn: ['确定','取消']
			  	},function(index){
			  		layer.close(index);
			  		$.ajax({
			  			url: "<%=basePath %>employee/deleteImage",
			    		type: "post",
			    		data: {"fileName":fileName,"id":"${employee.id }"},
			    		success: function(data){
			    			var _images = $("[name = images]").val();
			    			//把上传的图片加到input的value里去,并设给input里
			    			var imageList = _images.split(",");
			    			var valueImage = ""; 
			    			for(var i in imageList){
			    				if(imageList[i] == fileName){continue;};
			    				valueImage += imageList[i] + ",";
			    			}
			    			valueImage = valueImage.substr(0,valueImage.length -1);
			    			$("[name = images]").val(valueImage);
			    			diaplayImage(valueImage);
			    			layer.msg("删除成功！");
			    		},
			    		error: function(){
			    			
			    		}
			  		});
			  	},function(index){
			  		layer.close(index);
			  	});
			  	
	    		return false;
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
	    	
		    
		    //上传图片
		    function uploadImage(){
		    	var formdata = new FormData();
		    	formdata.append('file',$('#exampleInputFile')[0].files[0]);
		    	formdata.append('id',"${employee.id }");
		    	$.ajax({
		    		url: "<%=basePath %>employee/upload",
		    		type: "post",
		    		//cache的作用就是第一次请求完毕之后，如果再次去请求，可以直接从缓存里面读取而不是再到服务器端读取。
		    		cache: false,
		    		data: formdata,
		    		processData: false,
		    		contentType: false,
		    		success: function(data){
		    			var _images = $("[name = images]").val();
		    			
		    			//把上传的图片加到input的value里去,并设给input里
		    			if(_images == null || _images == ""){
		    				_images +=  data.fileName;
		    			}else{
		    				_images += "," + data.fileName;
		    			}
		    			
		    			$("[name = images]").val(_images);
		    			diaplayImage(_images);
		    			
		    			//清空file
		    			var file = $("#exampleInputFile");
		    			file.after(file.clone().val(""));
		    			file.remove();
		    			layer.msg(data.message);
		    		},
		    		error: function(){
		    			layer.msg("上传失败");
		    		}
		    	});
		    	
		    };
		</script>
	</body>
</html>