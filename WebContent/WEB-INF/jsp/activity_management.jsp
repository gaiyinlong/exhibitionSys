<%@page import="com.igeekhome.exhibition.util.Pager"%>
<%@ page language="java"
	import="java.util.List,com.igeekhome.exhibition.pojo.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>活动管理</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="easyui/demo/demo.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script src="easyui/locale/easyui-lang-zh_CN.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<script src="bootstrap/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/PCASClass.js"></script>
<script type="text/javascript" src="js/getcity.js"></script>

<style type="text/css">
input {
	width: 120px;
	border-radius: 4px
}

select {
	height: 23px;
	border-radius: 4px;
	width: 100px;
}
</style>
<script type="text/javascript">
	function toAdd() {

		location.href = "jsp?name=add_activity";
	}
	//删除活动通过id
	function deleteAct(name) {

		if (confirm("您确定要删除活动[" + name + "]吗？")) {
			//开始删除
			//请求删除的servlet
			//location.href="deleteActivity?id="+id;

		}
	}

	function getActName(name) {
		var a = document.getElementById('actNameTitle').innerHTML = name;

	}

	//提交查询表单
	//function subSearchForm() {
		//var searchForm = document.getElementById("searchForm");
		//searchForm.submit();
		//location.href="Activity?op=list";
		//ajax提交表单
		//序列化表单
		//var data = $(searchForm).serialize();
		//alert(data);
		//$("#innerDiv").load("user?op=list", data);
	}
</script>


</head>
<body>

	<ol style="font-family: 幼圆; font-size: 1.5em; margin-top: -20px;"
		class="breadcrumb">
		<li><a style="color: black" href="">首页</a></li>
		<li><a style="color: black" href="">品牌活动</a></li>
		<li class="active">活动管理</li>
		<button onclick="toAdd(); "
			style="font-size: 10px; margin-left: 800px">新增活动</button>
	</ol>




	<div style="margin-top: 20px" class="table-responsive">
		<div>
			<form id="searchForm " action="Activity" method="post">
				<input type="hidden" name="op" value="search" /> 
				 省/直辖市：<select
					id="province" name="province"></select> 城市：<select id="city"
					name="city"></select>


				<script language="javascript">
					new PCAS("province", "city");
				</script>


				&nbsp; &nbsp;活动名称：<input name="activity_name" type="text" />
				&nbsp;&nbsp; 活动负责人：<input name="leaderName" type="text" /> &nbsp;
				&nbsp; 活动日期：<input name=starttime type="text" id="datetime1"
					class="easyui-datetimebox"> ~ <input name="endtime"
					type="text" id="datetime2" class="easyui-datetimebox">

				&nbsp;&nbsp;<input style="width: 60px" type="submit" value="查询" />


			</form>


		</div>


		<!-- 客户列表 -->
		<div></div>
		<form action="Activity" method="get">
			<table id="t_list" style="margin-top: 20px"
				class="table table-condensed table-hover table-striped table-bordered">
				<tr class="warning">
					<input type="hidden" name="op" value="list" />
					<input type="hidden" name="getId" id="getnewid" value="" />

					<th>编号</th>
					<th>省市</th>
					<th>活动名称</th>
					<th>活动时间</th>
					<th>活动地址</th>
					<th>活动负责人</th>
					<th>负责人联系方式</th>
					<th>操作</th>



				</tr>


				<c:forEach items="${lists }" var="u" varStatus="status">

					<td>${u.id}</td>
					<td>${u.province}-${u.city}</td>
					<td>${u.activity_name }</td>

					<td><fmt:parseDate value="${u.start_time}"
							pattern="yyyy-MM-dd HH:mm" var="startTime" /> <fmt:formatDate
							value="${startTime}" pattern="yyyy-MM-dd HH:mm" /> 至<fmt:parseDate
							value="${u.end_time}" pattern="yyyy-MM-dd HH:mm" var="endTime" />
						<fmt:formatDate value="${endTime}" pattern="yyyy-MM-dd HH:mm" /></td>


					<td>${u.activity_address}</td>
					<td>${u.leader_name}</td>
					<td>${u.leader_tel}</td>




					<td>
						<button>
							<a href="Activity?op=editActivity&editId=${u.id}"
								style="cursor: pointer">编辑</a>
						</button>

						<button>
							<a onclick="deleteAct('${u.activity_name}') "
								href="Activity?op=deleteActivity&id=${u.id }"
								style="cursor: pointer">删除</a>

						</button>

						<button>

							<a onclick="getActName('${u.activity_name}')" data-toggle="modal"
								data-target="#myModal" href="Activity?op=brandListMotal"
								style="cursor: pointer" type="button">品牌</a>

						</button>
						<button>

							<a href="Activity?op=egeList&actId=${u.id}" type="button"
								style="cursor: pointer">金蛋</a>


						</button>
						<button>
							<a href="Activity?op=redList&actId=${u.id}"
								style="cursor: pointer" type="button">红包</a>
						</button>
						<button>
							<a href="Activity?op=prizeList&actId=${u.id}"
								style="cursor: pointer" type="button">抽奖</a>
						</button>
						<button>联单</button>
						<button>签售证</button>
						<button>客户</button>
						<button>宣传</button>
						<button>参展商</button>

					</td>

					</tr>

				</c:forEach>
			</table>
		</form>

		</form>





		<!-- 模态窗品牌列表 -->


		<form action="Activity" method="get">
			<input type="hidden" name="op" value="brandListMotal" />
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<span style="font-size: 1.5em;" id="actNameTitle"> &nbsp;</span>
							<button>
								<a style="cursor: pointer" type="button" data-toggle="modal"
									data-target="#addbrand">添加品牌</a>
							</button>

						</div>


						<div class="modal-body">
							<table style="margin-top: 20px"
								class="table table-condensed table-hover table-striped table-bordered">
								<tr class="warning">



									<th>序号</th>

									<th>省/市</th>
									<th>品牌名称</th>

									<th>品牌负责人</th>
									<th>品牌负责人电话</th>
									<th>操作</th>



								</tr>

								<c:forEach items="${brandListMotal}" var="bu">

									<td>${bu.id }</td>
									<td>${bu.province}-${bu.city}</td>
									<td>${bu.brand_name}</td>
									<td>${bu.brand_leader}</td>
									<td>${bu.brand_leaderTel}</td>





									<td>


										<button>删除</button>
										<button>取消负责</button>
									</td>
									</tr>
								</c:forEach>
							</table>
		</form>
	</div>

	<div class="modal-footer">
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>



	</div>


	<!-- 添加品牌 -->


	<div style="height: 600px; width: 600px" class="modal fade"
		id="addbrand" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">

					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h3 class="modal-title" id="myModalLabel">添加品牌</h3>


				</div>
				<div style="color: red" id="errorMessage3">&nbsp111;</div>
				<form action="Activity" method="post">
					<input type="hidden" name="op" value="addBrand">
					<div class="modal-body">

						<div class="input-group input-group-lg">
							<span class="input-group-addon">品牌名称</span> <input id="brandName"
								name="brandName" type="text" class="form-control"
								placeholder="品牌名称" required aria-describedby="sizing-addon1" />


						</div>
						</br>

						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">品牌负责人</span> <input
								id="brandLeader" name="brandLeader" type="text"
								class="form-control" placeholder="品牌负责人" required
								aria-describedby="sizing-addon1" />
						</div>
						</br>

						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">负责人电话</span> <input
								id="brandLeaderTel" name="brandLeaderTel" type="text"
								class="form-control" placeholder="负责人电话" required
								aria-describedby="sizing-addon1" />
						</div>


						</br>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="submit" class="btn btn-primary">确认</button>
					</div>
				</form>
			</div>
</body>
</html>