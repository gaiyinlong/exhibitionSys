<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增奖品</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<script src="bootstrap/js/jquery.min.js"></script>
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
		<li href=""><a style="color: black" href="#">活动管理 </a></li>
		<li class="active">抽獎</li>
		<button onclick="toOut();" style="font-size: 10px; margin-left: 800px">返回</button>
	</ol>





<form action="Activity" method="post">
	<input type="hidden" name="op" value="addPrize"/>
	<input type="hidden" name="getNull" value="${getIds}" />
	
	<tr class="warning">
		<th><lable>*</lable>奖品名称：</th>
		<td><input type="text" required id="prizeName" name="prizeName"></td>
		<input style="width: 60px; height: 30px" type="submit" value="保存" />


	</tr>

	<table id="t_list" style="margin-top: 20px"
		class="table table-condensed table-hover table-striped table-bordered">
		<tr class="warning">




			<th>序号</th>
			<th>奖品名称</th>
			<th>操作</th>



		</tr>




		<c:forEach items="${prizeList}" var="p">
			<td>${p.id }</td>
			<input type="hidden" id="getId" name="getId" value="${p.activityid }" />
			<td>${p.prize_name }</td>

<td>
				<button onclick="deleteRed('${p.prize_name}') ">
					<a href="Activity?op=deletePrize&deleteId=${p.id }&actId=${p.activityid}" style="cursor: pointer">删除</a>

				</button>
			<td>
			</tr>


		</c:forEach>
	</table>
</form>

</body>
</html>