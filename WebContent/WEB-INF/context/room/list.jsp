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
        			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>房间详情</b>
        		</div>
        		<form  id="seach_from" class="form-inline">
				  	<div class="form-group">
				    	<label >房间号</label>
				    	<input type="text" id="roomNo" name="roomNo" class="form-control"  placeholder="B010001">
				  	</div>
				  	<div class="form-group" id="second">
				    	<label >状态</label>
				    	<input type="text" id="status" name="status" class="form-control"  placeholder="入住">
				  	</div>
				  	<button onclick="search()" type="submit" class="btn btn-default">搜索</button>
				</form>
				<div class="table-responsive" id="mainBoby">
				  	<table class="table">
				   		<thead>
				   			<tr>
				   				<td>id</td>
					   			<td>房间号</td>
					   			<td>楼层</td>
					   			<td>原价</td>
					   			<td>现价</td>
					   			<td>状态</td>
					   			<td>描述</td>
				   			</tr>
				   		</thead>
				   		<tbody>
				   			<c:forEach items="${rooms }" var="roomlist" varStatus="xh">
								<tr>
					   				<td>${xh.index +1 }</td>
						   			<td>${roomlist.roomNo }</td>
						   			<td>${roomlist.level }楼</td>
						   			<td>${roomlist.original_price }</td>
						   			<td>${roomlist.now_price }</td>
						   			<c:choose>
						   				<c:when test="${roomlist.status == 0 }">
						   					<td style="color: green">空闲</td>
						   				</c:when>
						   				<c:when test="${roomlist.status == 1 }">
						   					<td style="color: red">入住</td>
						   				</c:when>
						   				<c:otherwise>
						   					<td style="color: black">清理中</td>
						   				</c:otherwise>
						   			</c:choose>
						   			<td>${roomlist.description }</td>
					   			</tr>
							</c:forEach>
				   		</tbody>
				  	</table>
				</div>
				<nav aria-label="Page navigation">
				  	<ul class="pagination" id="page">
				    	<li onclick="previous()">
				      		<a href="#" aria-label="Previous">
				        		<span aria-hidden="true">&laquo;</span>
				      		</a>
				    	</li>
					    <li  id="1" onclick="cli(1)"><a href="#">1</a></li>
					    <li  id="2" onclick="cli(2)"><a href="#">2</a></li>
					    <li  id="3" onclick="cli(3)"><a href="#">3</a></li>
					    <li  id="4" onclick="cli(4)"><a href="#">4</a></li>
					    <li  id="5" onclick="cli(5)"><a href="#">5</a></li>
					    <li onclick="next()">
					     	<a href="#" aria-label="Next">
					        	<span aria-hidden="true">&raquo;</span>
					      	</a>
					    </li>
				  	</ul>
				</nav>
        	</div>
		<script type="text/javascript" src="<%=basePath %>resource/js/common/common.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				menu(4,0);
			});
			var total = ${totalPage};
			var now_nu = 1;
			//访问地址
			var urlPath="<%=basePath %>room/pageData";
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	}
			
			/* 替换中间数据的  */
			var replace = function(pageNo,urlPath){
				$.ajax({
					url: urlPath,
					type: "post",
					data: {"pageNo":pageNo},
					success: function(data){
						console.log(data);
						console.log(data.rooms);
						dataStr(data.rooms);
					},
					error: function(){
						alert("error");
					}
				});
			}
			
			/* 搜索   */
			
			var search = function(){
				urlPath = "<%=basePath%>room/search";
				var roomNo = $("#roomNo").val();
				var status = $("#status").val();
				$.ajax({
					url: urlPath,
					type: 'post',
					//async: false,
					data: {"roomNo":roomNo,"status":status,},
					success: function(data){
						var dataRooms = data.rooms;
						$("tbody").empty();
						var data_str = "";
						for(var i in dataRooms){
							var statuts_str = "";
							if(dataRooms[i].status == 0){
								statuts_str = "<td style='color: green'>空闲</td>";
							}else if(dataRooms[i].status == 1){
								statuts_str = "<td style='color: red'>入住</td>";
							}else{
								statuts_str = "<td style='color: black'>清理中</td>";
							}
							data_str = data_str +
							"<tr>" +
								"<td>"+ (i - -1) +"</td>" +
								"<td>"+ dataRooms[i].roomNo +"</td>" +
								"<td>"+ dataRooms[i].level +"楼</td>" +
								"<td>"+ dataRooms[i].original_price +"</td>" +
								"<td>"+ dataRooms[i].now_price +"</td>" +
								statuts_str +
								"<td>"+ dataRooms[i].description +"</td>" +
							"</tr>";
						}
						alert(data_str);
						$("tbody").append(data_str);
					},
					error: function(){
						alert("error");	
					}
				});
			};
			
			
			var dataStr = function(dataRooms){
				$("tbody").empty();
				var data_str = "";
				for(var i in dataRooms){
					var statuts_str = "";
					if(dataRooms[i].status == 0){
						statuts_str = "<td style='color: green'>空闲</td>";
					}else if(dataRooms[i].status == 1){
						statuts_str = "<td style='color: red'>入住</td>";
					}else{
						statuts_str = "<td style='color: black'>清理中</td>";
					}
					data_str = data_str +
					"<tr>" +
						"<td>"+ (i - -1) +"</td>" +
						"<td>"+ dataRooms[i].roomNo +"</td>" +
						"<td>"+ dataRooms[i].level +"楼</td>" +
						"<td>"+ dataRooms[i].original_price +"</td>" +
						"<td>"+ dataRooms[i].now_price +"</td>" +
						statuts_str +
						"<td>"+ dataRooms[i].description +"</td>" +
					"</tr>";
				}
				alert(data_str);
				$("tbody").append(data_str);
			};
			
		</script>
	</body>
</html>
