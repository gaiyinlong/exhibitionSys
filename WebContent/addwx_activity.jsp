<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加活动</title>
<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap-wysiwyg.js" type="text/javascript"></script>

<script type="text/javascript">
	function  toOut() {
		location.href="wx_activity_manage.jsp";
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
.textarea{height: 400px;width: 1000px}

.ifsize{height: 400px;width: 1000px}

</style>
</head>
<body>
		<ol style="font-family: 幼圆; font-size: 1.5em;"
		class="breadcrumb">
		<li><a style="color: black" href="">首页</a></li>
		<li><a style="color: black" href="">活动管理</a></li>
		<li class="active">新增活动</li>
		<button onclick="toOut(); "
			style="font-size: 10px; margin-left: 800px">返回</button>
	</ol>
	
	<form>
		<table padding="10px" ;style="boder: 1px solid red;"
			class="table table-condensed table-hover table-striped table-bordered">



			<tr class="warning">


				<th><lable>*</lable>活动标题：</th>
				<td><input required type="text" /></td>
			</tr>


				<tr class="warning">


				<th><lable>*</lable>封面：</th>
				<td><input required type="file" /></td>
			</tr>
			
			<tr class="warning">


			<th><lable>*</lable>图片预览：</th>

				<td><textarea rows="10" cols="30"></textarea></td>
			</tr>

			<tr class="warning">


				<th><lable>*</lable>摘要：</th>
				<td><textarea rows="10" cols="30"></textarea>  </td>
			</tr>

			<tr class="warning">


				<th>活动简介：</th>
				<td>
			 <iframe class="ifsize" src="wordedit/word.html"> <textarea  class="textarea" > </textarea></iframe>	
				</td>
			</tr>
			

		</table>



		<input style="width: 60px; height: 30px" type="submit" value="保存" />

	</form>
	
	
</body>
</html>