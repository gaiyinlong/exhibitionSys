<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商家</title>
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
	function toOut() {
		location.href="business_maintenance.jsp";
	}

</script>

</head>
<body>

	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href="#">首页 </a></li>
		<li href=""><a style="color: black" href="#">商家维护 </a></li>
		<li class="active">新增商家</li>
		<button onclick="toOut();" style="font-size: 10px; margin-left: 800px">返回</button>
	</ol>

	<form>
		<table padding="10px" ;style="boder: 1px solid red;"
			class="table table-condensed table-hover table-striped table-bordered">

			<tr class="warning">


				<th><lable>*</lable>省/直辖市：</th>
				<td><select>
						<option>省/直辖市</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>


				</select></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>城市：</th>
				<td><select>
						<option>城市</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>


				</select></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>商家名称：</th>
				<td><input required type="text" /></td>
			</tr>





			<tr class="warning">


				<th><lable>*</lable>联系人：</th>
				<td><input required="required" type="text" /></td>
			</tr>

			<tr class="warning">


				<th>联系方式：</th>
				<td><input type="text" /></td>
			</tr>

		</table>



		<input style="width: 60px; height: 30px;" type="submit" value="保存" />
	</form>

</body>
</html>