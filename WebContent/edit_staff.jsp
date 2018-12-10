<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改员工信息</title>
<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- easyUI -->
<link rel="stylesheet" type="text/css"href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/demo/demo.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

<script type="text/javascript">
	function toOut() {

		location.href = "staff_management.jsp"
	}
</script>
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
		<li><a style="color: black" href="">首页</a></li>
		<li><a style="color: black" href="">店员维护</a></li>
		<li class="active">修改员工信息</li>
		<button onclick="toOut(); "
			style="font-size: 10px; margin-left: 800px">返回</button>

	</ol>

<form>
		<table padding="10px" ;style="boder: 1px solid red;"
			class="table table-condensed table-hover table-striped table-bordered">

			<tr class="warning">


			
				<th><lable>*</lable>员工姓名：</th>
				<td><input required type="text" /></td>

			</tr>
			<tr class="warning">


				<th><lable>*</lable>性别：</th>
				<td><select>
						<option>男</option>
						<option>女</option>
					
				</select></td>
			</tr>
			
				<tr class="warning">


				<th><lable>*</lable>商家名称：</th>
				<td><select>
						<option>1111</option>
						<option>2222</option>
					
				</select></td>
			</tr>
			

			<tr class="warning">


				<th><lable>*</lable>联系方式：</th>
				<td><input required type="text" /></td>
			</tr>


				<tr class="warning">


				<th><lable>*</lable>级别：</th>
				<td><select>
						<option>店长</option>
						<option>店员</option>
					
				</select></td>
			</tr>

		</table>



		<input style="width: 60px; height: 30px" type="submit" value="保存" />

	</form>

</body>
</html>