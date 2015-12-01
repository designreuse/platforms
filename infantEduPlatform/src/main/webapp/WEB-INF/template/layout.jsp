<%--
  Created by IntelliJ IDEA.
  User: PoohD
  Date: 2015/11/27
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() 
    				+ ":" + request.getServerPort() + request.getContextPath() + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>幼教平台|初始页面</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
          name="viewport">
    <link rel="stylesheet" href="static/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="static/plugins/dist/css/font-awesome-4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/plugins/dist/css/ionicons/ionicons.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="static/plugins/dataTables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="static/plugins/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" href="static/plugins/dist/css/skins/skin-blue-light.min.css">
    <!-- REQUIRED JS SCRIPTS -->
    <script src="static/plugins/jQuery/jQuery-2.1.4.min.js" type="text/javascript"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="static/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <!-- DataTables -->
    <script src="static/plugins/dataTables/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="static/plugins/dataTables/dataTables.bootstrap.min.js" type="text/javascript"></script>
    <!-- SlimScroll -->
    <script src="static/plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <!-- AdminLTE App -->
    <script src="static/plugins/dist/js/app.min.js" type="text/javascript"></script>
    <!--[if lt IE 9]>
    <script src="static/plugins/iePlugins/html5shiv.min.js"></script>
    <script src="static/plugins/iePlugins/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<div class="wrapper">
    <tiles:insertAttribute name="main-header"/>
    <tiles:insertAttribute name="main-sidebar"/>
    <div class="content-wrapper">
        <tiles:insertAttribute name="body"/>
    </div>
</div>
</body>
</html>