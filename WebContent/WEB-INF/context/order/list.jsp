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
        		<div id="seach_from" class="form-inline" style="margin-top: 20px;">
				  	<div class="form-group">
				    	<label >预订人：</label>
				    	<input type="text" id="orderName" name="orderName" class="form-control"  placeholder="预订人姓名">
				  	</div>
				  	<div class="form-group" id="second">
				    	<label >身份证：</label>
				    	<input type="text" id="IDCard" name="IDCard" class="form-control"  placeholder="入住">
				  	</div>
				  	<button onclick="search()" type="button" class="btn btn-default">搜索</button>
				  	<buttont style="margin-left: 200px;background: #467ca2;" type="button" class="btn btn-default"><a href="<%=basePath %>order/add" style="color: white;font-weight:700;">添加</a></button>
				</div>
				<div class="table-responsive" id="mainBoby">
				  	<table class="table">
				   		<thead>
				   			<tr>
				   				<td>#</td>
					   			<td>订单人姓名</td>
					   			<td>订单日期</td>
					   			<td>身份证</td>
					   			<td>联系方式</td>
					   			<td>入住时间</td>
					   			<td>退房时间</td>
					   			<td>订单状态</td>
					   			<td>房间id</td>
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
				menu(4,1);
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
		   		var orderName = $("#orderName").val();
		   		var IDCard = $("#IDCard").val();
		   		
		   		$.ajax({
		   			url: '<%=basePath%>order/intiData',
		   			data: {"orderName":orderName,"IDCard":IDCard},
		   			type: 'post',
		   			success: function(data){
		   			 	count = data.count;
		   				$("#tbody").empty();
		   				$("#tbody").html(replace(data.orders));
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
			   	    var orderName = $("#orderName").val();
			   		var IDCard = $("#IDCard").val();
			   		
			   		index += 1;
			   		$.ajax({
			   			url: '<%=basePath%>order/intiData',
			   			data: {"correntPage":index,"orderName":orderName,"IDCard":IDCard},
			   			type: 'post',
			   			success: function(data){
			   				$("#tbody").empty();
			   				$("#tbody").html(replace(data.orders));
			   				
			   			},
			   			error: function(){
			   				alert("error");
			   			}
			   		});
			   	};
	   		};
		   	
		   	/*
		   	
		   	*/
		   	function replace(orders){
		   		var html = "";
		   		for(var i in orders){
		   			html +=
		   			"<tr>" +
						"<td>"+ (i - (-1)) +"</td>" +
						"<td>" + orders[i].orderName +"</td>" +
						"<td>" + orders[i].date +"</td>" +
						"<td>" + orders[i].IDCard +"</td>" +
						"<td>" + orders[i].phone +"</td>" +
						"<td>" + orders[i].enterDate +"</td>" +
						"<td>" + orders[i].outDate +"</td>" +
						"<td>" + orders[i].status +"</td>" +
						"<td>" + orders[i].roomId +"</td>" +
						"<td><a onclick=edit('<%=basePath%>order/edit?id=" + orders[i].id + "') >编辑</a><br />" + 
							"<a onclick=deleteM('<%=basePath%>order/delete?id=" + orders[i].id + "') >删除</a><br />" +
							"<a onclick=show('<%=basePath%>order/show?id=" + orders[i].id + "') >查看</a>" +
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