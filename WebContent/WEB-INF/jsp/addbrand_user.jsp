<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加品牌用户</title>

<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/PCASClass.js"></script>
<script type="text/javascript" src="js/getcity.js"></script>

<style>
select {
	height: 25px;
	mairgin-top: 10px;
	border-radius: 4px
}

input {
	border-radius: 4px;
	width: 100px
}

lable {
	color: red
}
</style>

<script type="text/javascript">
	function toOut() {

		location.href = "Activity?op=brandList";
	}
</script>
</head>
<body>
	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li href=""><a style="color: black" href=" ">首页 </a></li>
		<li href=""><a style="color: black" href="">品牌活动 </a></li>
		<li class="active" href="">新增品牌用户</li>
		<button onclick="toOut();" style="font-size: 10px; margin-left: 800px">返回</button>
	</ol>
	<div style="color: red; font-size: 1.8em; text-align: center"
		id="erroMessage">&nbsp;${erroMessage }</div>
	<form action="Activity" method="post" onsubmit="return test()">
		<input type="hidden" name="op" value="addBrandUser" />
			<input type="hidden" id="getprovince" name="getprovince" value=" " /> 
			<input type="hidden" id="getcity" name="getcity" value=" " />
		<table padding="10px" ;style="boder: 1px solid red;"
			class="table table-condensed table-hover table-striped table-bordered">



			<tr class="warning">


				<th><lable>*</lable>用户名：</th>
				<td><input name="uname" type="text" required /></td>
			</tr>
			<tr class="warning">


				<th><lable>*</lable>密码：</th>
				<td><input name="upass" type="text" required /></td>
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
				<td><input name="brandCode" type="text" /></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>品牌名称：</th>
				<td><input name="brandName" required type="text" /></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>品牌LOGO：320*320</th>
				<td><input type="file" /></td>
			</tr>


			<tr class="warning">

				<th>品类：</th>
				<td><select>
						<option>无</option>
						<option>1</option>
						<option>2</option>



				</select></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>品牌負責人：</th>
				<td><input name="brandLeader" required type="text" /></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>联系方式：</th>
				<td><input name="brandLeaderTel" required type="text" /></td>
			</tr>
			<tr class="warning">
		</table>



		<input style="width: 60px; height: 30px" type="submit" value="保存" />
	</form>


</body>
</html>