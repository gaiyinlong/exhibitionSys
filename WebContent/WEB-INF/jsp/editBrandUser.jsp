<%@page import="com.igeekhome.exhibition.pojo.BrandUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改品牌用户信息</title>
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

<script type="text/javascript">
	function toOutBrandUser() {
		location.href = "Activity?op=brandList";
	}
</script>
</head>
<body>
	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href="#">首页 </a></li>
		<li href=""><a style="color: black" href="#">品牌用户</a></li>
		<li class="active">编辑</li>
		<button onclick="toOutBrandUser();"
			style="font-size: 10px; margin-left: 800px">返回</button>
	</ol>

	<%
		//获取品牌用户对象

		BrandUser bu = (BrandUser) request.getAttribute("editBrandUser");
	%>

	<div style="color: red; font-size: 1.8em; text-align: center"
		id="erroMessage">&nbsp;${erroMessage }</div>
	<form action="Activity" method="post" onsubmit="return test()">
		<input type="hidden" name="op" value="editBrandUserDetail" />

		<table padding="10px" ;style="boder: 1px solid red;"
			class="table table-condensed table-hover table-striped table-bordered">


			<input type="hidden" id="getprovince" name="getprovince"
				value="<%=bu.getProvince()%>" />

			<input type="hidden" id="getcity" name="getcity"
				value="<%=bu.getCity()%>" />

			<tr class="warning">




				<input required type="hidden" id="brandId" name="brandId"
					value="<%=bu.getId()%>" />
			</tr>

			<tr class="warning">


				<th><lable>*</lable>用户名：</th>
				<td><input name="uname" type="text"
					value="<%=bu.getLoginName()%>" required /></td>
			</tr>


			<tr class="warning">

				<th><lable>*</lable>角色：</th>
				<td><select>
						<option>请选择</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>


				</select></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>权限：</th>
				<td><select>
						<option>品牌用户</option>
						<option>品牌管理员</option>



				</select></td>
			</tr>


			<tr class="warning">


				<th><lable>*</lable>省/直辖市：</th>
				<td><select name="province" id="province">

				</select></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>城市：</th>
				<td><select name="city" id="city">



				</select></td>
			</tr>

			<script type="text/javascript">
				new PCAS("province", "city");
			</script>
			<tr class="warning">


				<th>品牌编码：</th>
				<td><input value="<%=bu.getBrand_code()%>" name="brandCode"
					type="text" /></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>品牌名称：</th>
				<td><input name="brandName" required type="text"
					value="<%=bu.getBrand_name()%>" /></td>
			</tr>





			<tr class="warning">


				<th><lable>*</lable>品牌負責人：</th>
				<td><input name="brandLeader" required type="text"
					value="<%=bu.getBrand_leader()%>" /></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>联系方式：</th>
				<td><input name="brandLeaderTel" required type="text"
					value="<%=bu.getBrand_leaderTel()%>" /></td>
			</tr>
			<tr class="warning">
		</table>



		<input style="width: 60px; height: 30px" type="submit" value="保存" />
	</form>


</body>
</html>