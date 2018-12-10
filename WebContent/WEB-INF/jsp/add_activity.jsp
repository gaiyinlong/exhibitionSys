<%@ page language="java" import="com.igeekhome.exhibition.pojo.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增活动</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/demo/demo.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script language="javascript" src="js/PCASClass.js"></script>
<script language="javascript" src="js/getcity.js"></script>
<style>
select {
	height: 25px;
	mairgin-top: 10px;
	border-radius: 4px
}

input {
	border-radius: 4px;
}

lable {
	color: red
}
</style>




</head>
<body>

	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href="#">首页 </a></li>
		<li href=""><a style="color: black" href="#">品牌活动 </a></li>
		<li class="active">新增活动</li>
		<button onclick="toOut();" style="font-size: 10px; margin-left: 800px">返回</button>
	</ol>



	<div style="color: red; font-size: 1.8em; text-align: center"
		id="erroMessage">&nbsp;${erroMessage }</div>
	<form action="Activity" method="post" onsubmit="return test()">
		<input type="hidden" name="op" value="add" /> 
		<input type="hidden" id="getprovince" name="getprovince" value=" " /> 
		<input type="hidden" id="getcity" name="getcity" value=" " />

		<table padding="10px" ;style="boder: 1px solid red;"
			class="table table-condensed table-hover table-striped table-bordered">

			<tr class="warning">


				<th><lable>*</lable>省/直辖市：</th>
				<td><select name="province" id="province">
					<!--  	<script type="text/javascript">
							$("select[name='province']").change(function() {

								var sheng = $("#province").val();

								alert(sheng);

							});
						</script>-->

				</select></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>城市</th>
				<td><select id="city" name="city">

						<!--  <script type="text/javascript">
							$("select[name='city']").change(function() {

								var shi = $("#city").val();

								alert(shi);

							});
						</script>-->


				</select></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>活动名称：</th>
				<td><input required type="text" name="actName" /></td>
			</tr>


			<tr class="warning">


				<th><lable>*</lable>活动时间：</th>
				<td><input type="text" required id="start_time"
					name="start_time" class="easyui-datetimebox"> ~ <input
					type="text" id="end_time" required name="end_time"
					class="easyui-datetimebox"></td>

			</tr>


			<tr class="warning">


				<th><lable>*</lable>活动負責人：</th>
				<td><input required="required" type="text" name="leaderName" /></td>
			</tr>

			<tr class="warning">


				<th>联系方式：</th>
				<td><input type="text" name="leaderTel" /></td>
			</tr>
			<tr class="warning">


				<th><lable>*</lable>活动地址：</th>
				<td><input type="text" required="required" name="actAddress" /></td>
			</tr>
			<tr class="warning">


				<th style="text-align: left"></lable>短信签名：</th>
				<td><input type="text" /></td>
			</tr>
		</table>



		<input style="width: 60px; height: 30px" type="submit" value="保存" />

	</form>
	<script language="javascript">
		new PCAS("province", "city");
	</script>

</body>
</html>