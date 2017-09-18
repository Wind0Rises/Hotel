<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/context/common/common_meta.jsp"%>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/WEB-INF/context/common/common_js.jsp"%>	
		<%@ include file="/WEB-INF/context/common/common_css.jsp"%>
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
       			<span class="glyphicon glyphicon-menu-right"></span>&nbsp;&nbsp;&nbsp;<b>人员分布</b>
       		</div>
       		<div style="width: 1600px;height: 400px;background: #8f8f8f">
       			<div id="echart" style="width: 800px;height: 400px;"></div>
       		</div>
        	
        	
        		
        </div>
		<script type="text/javascript" src="<%=basePath %>resource/js/common/echarts.min.js"></script>
        <script type="text/javascript">
	       	$(document).ready(function(){
				menu(1,1);
				distributed();
			});
			
			/*  显示菜单    */
		   	var menu = function(first,second){
			   var first_number = "li:eq("+ first +")";
			   var second_number = "li:eq("+ second +")";
			   $(".first").children(first_number).children("ul").css("display","block");
			   $(".first").children(first_number).children("ul").children(second_number).css("background","red");
		   	};
		   	
		   	var distributed = function(){
		   		var myChart = echarts.init(document.getElementById("echart"));
		   		$.ajax({
		   			url: "<%=basePath %>employee/distributeInit",
		   			type: "post",
		   			async: true,
		   			//dataType: "josn",
		   			success: function(data){
		   				var number = new Array;
		   				var department = new Array;
		   				var list = data.data;
		   				for(var i in list){
		   					number[i] = list[i].peopleNumber;
		   					department[i] = list[i].departmentNo;
		   				}
		   				
		   				option = {
	   			   		    tooltip: {
	   			   		        trigger: 'item',
	   			   		        formatter: "{a} <br/>{b}: {c} ({d}%)"
	   			   		    },
	   			   		    legend: {
	   			   		        orient: 'vertical',
	   			   		        x: 'left',
	   			   		        data: department
	   			   		    },
	   			   		    series: [
	   			   		        {
	   			   		            name:'访问来源',
	   			   		            type:'pie',
	   			   		            radius: ['50%', '70%'],
	   			   		            avoidLabelOverlap: false,
	   			   		            label: {
	   			   		                normal: {
	   			   		                    show: false,
	   			   		                    position: 'center'
	   			   		                },
	   			   		                emphasis: {
	   			   		                    show: true,
	   			   		                    textStyle: {
	   			   		                        fontSize: '10',
	   			   		                        fontWeight: 'bold'
	   			   		                    }
	   			   		                }
	   			   		            },
	   			   		            labelLine: {
	   			   		                normal: {
	   			   		                    show: false
	   			   		                }
	   			   		            },
	   			   		            data: number
	   			   		        }
	   			   		    ]
	   			   		};
		   				
		   				myChart.setOption(option);
		   			},
		   			error: function(){
		   				console.log("失败");
		   			}
		   		});
		   	};
		   	<%--
		   	

		   	
		   	option = {
		   			title: {
		   				text: "入门程序"
		   			},
		   		    tooltip: {
		   		        trigger: 'item',
		   		        formatter: "{a} <br/>{b}: {c} ({d}%)"
		   		    },
		   		    legend: {
		   		        orient: 'vertical',
		   		        x: 'left',
		   		        data:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
		   		    },
		   		    series: [
		   		        {
		   		            name:'访问来源',
		   		            type:'pie',
		   		            radius: ['50%', '70%'],
		   		            avoidLabelOverlap: false,
		   		            label: {
		   		                normal: {
		   		                    show: false,
		   		                    position: 'center'
		   		                },
		   		                emphasis: {
		   		                    show: true,
		   		                    textStyle: {
		   		                        fontSize: '10',
		   		                        fontWeight: 'bold'
		   		                    }
		   		                }
		   		            },
		   		            labelLine: {
		   		                normal: {
		   		                    show: false
		   		                }
		   		            },
		   		            data:[
		   		                {value:335, name:'直接访问'},
		   		                {value:310, name:'邮件营销'},
		   		                {value:234, name:'联盟广告'},
		   		                {value:135, name:'视频广告'},
		   		                {value:1548, name:'搜索引擎'}
		   		            ]
		   		        }
		   		    ]
		   		};
		   		
		   	myChart.setOption(option);
		   	
		   	--%>
		</script>
	</body>
</html>