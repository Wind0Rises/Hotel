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
        			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>客房列表</b>
        		</div>
        		<div id="seach_from" class="form-inline" style="margin-top: 20px;">
				  	<div class="form-group">
				    	<label >房间号：</label>
				    	<input type="text" id="roomNo" name="roomNo" class="form-control"  placeholder="房间号">
				  	</div>
				  	<div class="form-group" id="second">
				    	<label >状态：</label>
				    	<%--<input type="text" id="status" name="status" class="form-control"  placeholder="状态">--%>
				    	
				    	<select id="status" name="status" class="form-control" class="form-control">
				    		<option></option>
				    		<option value="0">空闲</option>
				    		<option value="1">入住</option>
				    		<option value="2">整理中</option>
				    	</select>
				    </div>
				  	<button onclick="search()" id="search" type="button" class="btn btn-primary">搜索</button>
				  	<%--<buttont style="margin-left: 200px;background: #467ca2;" type="button" class="btn btn-default"><a href="<%=basePath %>room/add" style="color: white;font-weight:700;">添加</a></button>--%>
				
					<button id="addBut" onclick="javascript:window.location.href='<%=basePath %>room/add'" type="button" class="btn btn-default" >添加</button>
				
				
				</div>
				<div class="table-responsive" id="mainBoby">
				  	<table class="table">
				   		<thead>
				   			<tr id="directory">
				   				<td>#</td>
					   			<td>房间号</td>
					   			<td>楼层</td>
					   			<td>原价</td>
					   			<td>现价</td>
					   			<td>描述</td>
					   			<td class="col-sm-1">状态</td>
					   			<td class="col-sm-2">操作</td>
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
				menu(4,0);
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
		   		var roomNo = $("#roomNo").val();
		   		var status = $("#status").val();
		   		$.ajax({
		   			url: '<%=basePath%>room/intiData',
		   			data: {"roomNo":roomNo,"status":status},
		   			type: 'post',
		   			success: function(data){
		   			 	count = data.count;
		   				$("#tbody").empty();
		   				$("#tbody").html(replace(data.rooms));
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
			   		var roomNo = $("#roomNo").val();
			   		var status = $("#status").val();
			   		
			   		index += 1;
			   		$.ajax({
			   			url: '<%=basePath%>room/intiData',
			   			data: {"correntPage":index,"roomNo":roomNo,"status":status},
			   			type: 'post',
			   			success: function(data){
			   				$("#tbody").empty();
			   				$("#tbody").html(replace(data.rooms));
			   			},
			   			error: function(){
			   				alert("分页失败！");
			   			}
			   		});
			   	};
	   		};
		   	
		   	/*
		   	
		   	*/
		   	function replace(dateSet){
		   		var html = "";
		   		for(var i in dateSet){
		   			html +=
		   			"<tr>" +
						"<td>"+ (i - (-1)) +"</td>" +
						"<td>" + dateSet[i].roomNo +"</td>" +
						"<td>" + dateSet[i].level +"楼</td>" +
						"<td>" + dateSet[i].original_price +"</td>" +
						"<td>" + dateSet[i].now_price +"</td>" +
						"<td>" + dateSet[i].description +"</td>";
						
						var status = "";
						if(dateSet[i].status == 1){
							status = "<td><div class='status1'>入住中<div></td>";
						}else if(dateSet[i].status == 0){
							status = "<td><div class='status0'>空闲<div></td>";
						}else{
							status = "<td><div class='status2'>整理中<div></td>";
						}
						
						html += status + 
						"<td><a style='margin-left: 20px;text-decoration: none' onclick=edit('<%=basePath%>room/edit?id=" + dateSet[i].id + "') >编辑</a>" + 
							"<a style='margin-left: 20px;text-decoration: none' onclick=deleteM('<%=basePath%>room/delete?id=" + dateSet[i].id + "') >删除</a>" +
							"<a style='margin-left: 20px;text-decoration: none' onclick=show('<%=basePath%>room/show?id=" + dateSet[i].id + "') >查看</a>" +
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
		   		删除操作
		   		layer有的skin：layui-layer-lan layui-layer-molv layer-ext-moon
		   	*/
		   	var deleteM = function(url){
		   		layer.confirm("您确定要删除该条数据吗？",{
		   			btn: ['确定','取消']
		   		},function(){
		   			$.ajax({
			   			url: url,
			   			type: 'get',
			   			success: function(data){
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
		   		});
		   	};
		   	
		   	/*
		   		跳转到查看页面
		   	*/
		   	var show = function(url){
		   		location.href= url;
		   	};
		   	
		   	
		</script>
	</body>
</html>