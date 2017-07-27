<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--
	作者：offline
	时间：2017-05-18
	描述：头部
-->
<nav id="start" class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
        	<h2 id="title" class="navbar-text"><b>花园酒店管理系统</b></h2>
       	</div>
       	<div class="collapse navbar-collapse">
           <ul class="nav navbar-nav navbar-right">
               <li role="presentation" >
                   <a href="#" id="now_user"><b>当前用户：<span class="badge">TestUser</span></b></a>
               </li>
               <li class="message">
                   <a href="<%=basePath %>logout">
                        <b><span class="glyphicon glyphicon-lock"></span>退出登录</b>
                   </a>
                </li>
            </ul>
       </div>
    </div>      
</nav>