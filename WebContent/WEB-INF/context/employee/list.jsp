<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/context/common/common_meta.jsp"%>

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/WEB-INF/context/common/common_css.jsp"%>
		<%@ include file="/WEB-INF/context/common/common_js.jsp"%>
		<link rel="stylesheet" href="<%=basePath %>resource/css/common/comment-list.css">
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
        			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>人员列表</b>
        		</div>
        		<div id="seach_from" class="form-inline" style="margin-top: 20px;">
				  	<div class="form-group">
				    	<label >姓名：</label>
				    	<input type="text" id="employeeName" name="employeeName" class="form-control"  placeholder="人员姓名">
				  	</div>
				  	<div class="form-group" id="second">
				    	<label >入职时间：</label>
				    	<input type="text" id="date" name="date" class="form-control"  placeholder="入职时间">
				  	</div>
				  	<button onclick="search()" type="button" class="btn btn-default">搜索</button>
				  	<button id="addBut" onclick="javascript:window.location.href='<%=basePath %>employee/add'" type="button" class="btn btn-default" >添加</button>
				</div>
				<div class="table-responsive" id="mainBoby">
				  	<table class="table">
				   		<thead>
				   			<tr id="directory">
				   				<td>#</td>
					   			<td>姓名</td>
					   			<td>年龄</td>
					   			<td>入职时间</td>
					   			<td>手机号码</td>
					   			<td>月薪</td>
					   			<td>部门</td>
					   			<td>职位</td>
					   			<td>状态</td>
					   			<td>操作</td>
				   			</tr>
				   		</thead>
				   		<tbody id="tbody">
				   			
				   		</tbody>
				  	</table>
				</div>
				<div id="page"></div>
        	</div>
		<script type="text/javascript" src="<%=basePath %>resource/js/common/jquery.pagination.js"></script>
		<script type="text/javascript">
			var count;
			$(document).ready(function(){
				menu(1,1);
				intiDate();
			});
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	};
		   	
		   	//数据初始化
		   	var intiDate = function(){
		   		var employeeName = $("#employeeName").val();
		   		var date = $("#date").val();
		   		$.ajax({
		   			url: '<%=basePath%>employee/intiData',
		   			data: {"employeeName":employeeName,"date":date},
		   			type: 'post',
		   			success: function(data){
		   			 	count = data.count;
		   				$("#tbody").empty();
		   				$("#tbody").html(replace(data.employees));
		   				page();
		   			},
		   			error: function(){
		   				alert("初始化页面错误！");
		   			}
		   		});
		   	};
			
		   	//分页
	   		var page = function(){
	   			$("#page").pagination(count, {
			   		//两侧显示的首尾分页的条目数
				    num_edge_entries: 2,
				   	//连续分页主体部分显示的分页条目数
				    num_display_entries: 4,
				    //每页显示的条数
				    items_per_page:10,
				    prev_text: '上一页',
				    next_text: '下一页',
				    callback: PageCallback,
				});
			   	
			   	function PageCallback (index,js){
			   		var employeeName = $("#employeeName").val();
			   		var date = $("#date").val();
			   		index += 1;
			   		$.ajax({
			   			url: '<%=basePath%>employee/intiData',
			   			data: {"correntPage":index,"employeeName":employeeName,"date":date},
			   			type: 'post',
			   			success: function(data){
			   				$("#tbody").empty();
			   				$("#tbody").html(replace(data.employees));
			   				
			   			},
			   			error: function(){
			   				alert("error");
			   			}
			   		});
			   	};
	   		};
		   	
		   	/*
		   	
		   	*/
		   	function replace(listsData){
		   		var html = "";
		   		console.log(listsData);
		   		for(var i in listsData){
		   			html +=
		   			"<tr>" +
						"<td>"+ (i - (-1)) +"</td>" +
						"<td>" + listsData[i].employeeName +"</td>" +
						"<td>" + listsData[i].age +"</td>" +
						"<td>" + listsData[i].date +"</td>" +
						"<td>" + listsData[i].phone +"</td>" +
						"<td>" + listsData[i].salary +"</td>" +
						"<td>" + listsData[i].departmentNo +"</td>" +
						"<td>" + listsData[i].postNo +"</td>";
						var status = "";
						if(listsData[i].status == 1){
							status = "<td style='padding-left: 50px;'><div style='margin-right: -50px;margin-left:0px;' class='status1'>在职<div></td>";
						}else if(listsData[i].status == 0){
							status = "<td style='padding-left: 50px;'><div style='margin-right: -50px;margin-left:0px;' class='status0'>离职<div></td>";
						}else{
							status = "<td style='padding-left: 50px;'><div style='margin-right: -50px;margin-left:0px;' class='status2'>休假<div></td>";
						}
						
						html += status + 
						
						"<td><a style='margin-left: 20px;text-decoration: none' onclick=edit('<%=basePath%>employee/edit?id=" + listsData[i].id + "') >编辑</a>" + 
							"<a style='margin-left: 20px;text-decoration: none' onclick=deleteM('<%=basePath%>employee/delete?id=" + listsData[i].id + "') >删除</a>" +
							"<a style='margin-left: 20px;text-decoration: none' onclick=show('<%=basePath%>employee/show?id=" + listsData[i].id + "') >查看</a>" +
						"</td>" +
					"</tr>";
		   		};
		   		return html;
		   	};
		   	
		   	var search = function(){
		   		intiDate();
		   		page();
		   	};
		   	
		   	/**
		   		跳转编辑页面
		   	*/
		   	var edit = function(url){
		   		location.href= url;
		   	};
		   	
		   	/**
		   		跳转到查看页面
		   	*/
		   	var show = function(url){
		   		location.href= url;
		   	};
		   	
		   	/**
		   		删除操作
		   		layer有的skin：layui-layer-lan layui-layer-molv layer-ext-moon
		   	*/
		   	var deleteM = function(_url){
		   		layer.confirm("您确定要删除该条数据吗？",{
		   			btn: ['确定','取消']
		   		},function(){
		   			$.ajax({
			   			url: _url,
			   			type: 'get',
			   			success: function(data){
			   				console.log(data.message);
			   				layer.alert("恭喜您，删除成功!",{
			   					icon: 6,
			   					skin: 'layui-layer-lan',
			   				},function(){
			   					location.reload();
			   				});
			   			},
			   			error: function(){
			   				layer.alert("删除失败！",{
			   					icon: 2,
			   					skin:'layer-ext-moon',
			   				});
			   			}
			   		});
		   		},function(){
		   			//取消操作
		   		});
		   	};
		   	
		   	
		   	
		</script>
	</body>
</html>