<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--
	作者：offline
	时间：2017-06-18
	描述：导航
-->
<div class="list">  
    <ul class="first">  
       <li>
        	<a href="#" class="inactive active">系统管理</a>
        	<ul>  
                <li><a class="content" href="<%=basePath %>student/list" >人员管理</a></li>  
                <li><a class="content" href="#">角色管理</a></li>  
                <li><a class="content" href="#">权限管理</a></li>  
            </ul>  
       </li>  
        
        <li>
        	<a href="#" class="inactive active">公司管理</a>  
            <ul>  
                <li><a class="content" href="<%=basePath %>department/list">部门管理</a></li>  
                <li><a class="content" href="<%=basePath %>employee/list">人员管理</a></li>  
                <li><a class="content" href="<%=basePath %>post/list">岗位管理</a></li>  
                <li><a class="content" href="#">艺委会工作部</a></li>  
                <li><a class="content" href="#">信息资源部</a></li>  
                <li><a class="content" href="#">双年展办公室</a></li>  
            </ul>  
        </li>  

        <li>
        	<a href="#" class="inactive">订单处理</a>  
            <ul>  
                <li><a class="content" href="#">办公室</a></li>  
                <li><a class="content" href="#">人事处</a></li>  
                <li><a class="content" href="#">组联部</a></li>  
                <li><a class="content" href="#">外联部</a></li>  
                <li><a class="content" href="#">研究部</a></li>  
                <li><a class="content" href="#">维权办</a></li>  
            </ul>  
        </li>  

        <li>
        	<a href="#" class="inactive">第三个</a>  
            <ul>  
                <li><a class="content" href="#">办公室</a></li>  
                <li><a class="content" href="#">人事处</a></li>  
                <li><a class="content" href="#">组联部</a></li>  
                <li><a class="content" href="#">外联部</a></li>  
                <li><a class="content" href="#">研究部</a></li>  
                <li><a class="content" href="#">维权办</a></li>  
            </ul>  
        </li> 
        
        <li>
        	<a href="#" class="inactive">客房管理</a>  
            <ul>  
                <li><a class="content" href="<%=basePath %>room/list">房间详情</a></li>  
                <li><a class="content" href="<%=basePath %>order/list">订单详情</a></li>  
            </ul>  
        </li> 
    </ul>  
</div>