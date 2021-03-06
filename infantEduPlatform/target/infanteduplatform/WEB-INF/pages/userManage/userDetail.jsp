<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<base href="<%=basePath%>">
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
	<link rel="stylesheet" href="static/plugins/zTree3.5.18/css/metroStyle/metroStyle.css" type="text/css" />
	<script type="text/javascript" src="static/plugins/zTree3.5.18/js/jquery.ztree.all-3.5.min.js"></script>
	<script src="static/plugins/layer/layer.js"></script>
	<script type="text/javascript" src="static/js/unit.js"></script>
	<!-- <script src="static/js/handlebars/handlebars-1.0.0.beta.6.js"></script> -->
	<!--     <script src="static/plugins/dataTables/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="static/plugins/dataTables/dataTables.bootstrap.js" type="text/javascript"></script> -->
    <script src="static/plugins/layer/layer.js"></script>
    <script src="static/plugins/dataTables/dataTables.bootstrap.min.js" type="text/javascript"></script>
    <script src="static/plugins/dataTables/handlebars-1.0.0.beta.6.js" type="text/javascript"></script>
    <script src="static/plugins/iCheck/icheck.min.js"></script>
    	<div>
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        数据列表
                        <small>advanced tables</small>
                    </h1>
                </section>
                <!-- Main content -->
                <section class="content">
            <div class="col-xs-8 box box-primary ">
                <div class="box-header ">
					
                </div>
                <img src="${image}" href="headimage/uploadHeadImage">
                <div class="box-body box-profile">
                    <div class="col-sm-10" id="settings">
                        <form class="form-horizontal" id="userForm">
                            <div class="form-group">
                                <label for="username" class="col-sm-2 control-label">登录名</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" id="username" readonly="readonly"
                                           name="username" placeholder="登录名" value="${userinfo.username}">
                                           <input type="hidden"  id="userid" name="userid" value="${userinfo.userid}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="nickname" class="col-sm-2 control-label">用户昵称</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control required" id="nickname"
                                           name="nickname" placeholder="用户昵称" value="${userinfo.nickname}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="name" class="col-sm-2 control-label">真实姓名</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control required" id="name"
                                           name="name" placeholder="真实姓名" value="${userinfo.name}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="input-1" class="col-sm-2 control-label">性别</label>
                                <input id="gendercode" type="hidden" value="${userinfo.gendercode}">
                                <div class="col-sm-10">
                                    <div class="iradio_square-blue">
                                        <input class="required" type="radio" id="input-1"
                                               name="gendercode" value="1">
                                    </div>
                                    <label for="input-1" class="">男</label>

                                    <div class="iradio_square-blue">
                                        <input class="required" type="radio" id="input-2"
                                               name="gendercode" value="2">
                                    </div>
                                    <label for="input-2" class="">女</label>
                                    <div class="iradio_square-blue">
                                        <input class="required" type="radio" id="input-3"
                                               name="gendercode" value="0">
                                    </div>
                                    <label for="input-3" class="">保密</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="idno" class="col-sm-2 control-label">身份证号</label>

                                <div class="col-sm-6">
                                    <input type="text" class="form-control" id="idno"
                                           name="idno" value="${userinfo.idno}"
                                           placeholder="身份证号"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="mobile" class="col-sm-2 control-label">手机号码</label>

                                <div class="col-sm-6">
                                    <input type="text" class="form-control" id="mobile"
                                           name="mobile" placeholder="手机号码" value="${userinfo.mobile}">
                                </div>
                                <input type="hidden"  id="Mobile" name="Mobile" value="${userinfo.mobile}">
                            </div>
                            <div class="form-group">
                                <label for="email" class="col-sm-2 control-label">邮箱地址</label>

                                <div class="col-sm-6">
                                    <input type="text" class="form-control" id="email"
                                           name="email" placeholder="邮箱地址" value="${userinfo.email}">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-8">
                                    <button type="button" id="UserSave" class="btn btn-danger">保存
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /.box-body -->
            </div>
        </section>
            </div>
            <script>
            $(function () {
    		    $('input').iCheck({
    		        labelHover: false,
    		        cursor: true,
    		        checkboxClass: 'icheckbox_square-blue',
    		        radioClass: 'iradio_square-blue',
    		        increaseArea: '20%'
    		    });
    	          $(":radio[name='gendercode'][value='" + $("#gendercode").val() + "']").iCheck('check');
    		});
            $("#UserSave").on("click", function () {
            	var userid = $("#userid").val();
            	var mobile = $("#mobile").val();
            	var Mobile = $("#Mobile").val();
            	if (formValidation($("#userForm"))) {
  					$.ajax({
      					async : false,
      					type : "POST",
      					data : {"mobile":mobile,"Mobile":Mobile,"userId":userid},
      					url : "register/userManageValidate",
      					success: function(data){
  				        	if(data==0){
  				        		 $.ajax({
  								        async:true,
  								        type:"POST",
  								        url:"user/saveUserDetail",
  								        data:$("#userForm").serialize()+"&userId="+userid,
  								        dataType:"JSON",
  								        success:function(){
  								        	layer.closeAll();
  								            layer.msg('保存成功', {icon: 1,time: 2000});
  								        }
  								    }); 
  				        	}else{
  				        		layer.msg('此用户已存在！', {icon: 10});
  				        	}
  				        }});
    			}
            });
            </script>
	</tiles:putAttribute>
</tiles:insertDefinition>
</html>
