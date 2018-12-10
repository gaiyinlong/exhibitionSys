<%@ page language="java" import="com.igeekhome.exhibition.pojo.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>XXXX后台管理系统</title>

<link rel="stylesheet" type="text/css" href="css/style.css">


<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>





<script type="text/javascript">
	function out() {

	}
</script>

</script>
</head>
<body>




	<div id="header" class="fixed">
		<a href="" class=""><img style="margin-top: 10px"
			src="images/logo.png" /></a>
		<ul class="user_leader fixed">

			<li><a style="width: 120px; cursor: pointer" class="update"
				type="button"><span style="margin-left: -20px"
					class="glyphicon glyphicon-user"> </span>${loginUser.loginName}</a></li>

			<li><a style="width: 120px; cursor: pointer" class="update"
				type="button" data-toggle="modal" data-target="#myModal"><span
					style="margin-left: -20px" class="glyphicon glyphicon-lock">
				</span>修改密码</a></li>



			<li><a style="width: 100px; cursor: pointer" href=""
				onclick="out();" class=""><span style="margin-left: -20px;"
					class="glyphicon glyphicon-off"></span>退出</a></li>

		</ul>




	</div>

	<!-- Modal top -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h3 class="modal-title" id="myModalLabel">修改密码</h3>
				</div>

				<form act="" method="post">
					<div class="modal-body">

						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">旧密码：</span> <input
								type="text" class="form-control" placeholder="旧密码"
								aria-describedby="sizing-addon1" required>
						</div>
						</br>

						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">新密碼:</span> <input
								type="password" class="form-control" placeholder="新密码"
								aria-describedby="sizing-addon1" required>
						</div>
						</br>

						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1">确认新密码:</span>
							<input type="password" class="form-control" placeholder="确认新密码"
								aria-describedby="sizing-addon1" required>
						</div>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="submit" class="btn btn-primary" onclick="">确认
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Modal bottorm -->
	<!-- left menu -->

	<div class="row">

		<div style="padding: 0px;" class="col-md-2 panel ">

			<div class="panel-body">
				<div class="accordion" id="accordion-101236">
					<div class="panel panel-default">

						<!-- 微信管理 -->
						<div
							style="font-size: 1.5em; font-family: 幼圆; background: #b60927; text-align: center"
							class="panel-heading" role="tab">
							<a style="color: white;" class="accordion-toggle collapsed"
								data-toggle="collapse" data-parent="#accordion-101236"
								href="#accordion-element-001">微信管理</a>
						</div>
						<div id="accordion-element-001" class="panel-collapse collapse ">
							<div style="text-align: left" class="panel-body">
								<p>
									<a
										href="jsp?name=wxquanfa"
										target="work">群发</a>
								</p>
								<p>
									<a href="" target=''>欢迎语</a>
								</p>
								<p>
									<a href="" target=''>智能回复</a>
								</p>
								<p>
									<a href="">关键字回复</a>
								</p>
								<p>
									<a href="">自定义菜单</a>
								</p>
								<p>
									<a href="">个性化自定义菜单</a>
								</p>
								<p>
									<a href="">素材管理</a>
								</p>
								<p>
									<a href="group_manage.jsp" target="work">分组管理</a>
								</p>
								<p>
									<a href="label_manage.jsp" target="work">标签管理</a>
								</p>
								<p>
									<a href="fans_manage.jsp" target="work">粉丝管理</a>
								</p>
								<p>
									<a href="wx_activity_manage.jsp" target="work">活动管理</a>
								</p>
							</div>
						</div>
					</div>
					<!-- 品牌活动 -->
					<div class="panel panel-default">
						<div
							style="font-size: 1.5em; font-family: 幼圆; background: #b60927; text-align: center"
							class="panel-heading" class="container-fluid" role="tab">
							<a style="color: white;" accordion-toggle" data-toggle="collapse"
								data-parent="#accordion-101236" href="#accordion-element-002">品牌活动</a>
						</div>
						<div id="accordion-element-002" class="panel-collapse collapse ">
							<div style="text-align: left" class="panel-body">
								<p>
									<a href="Activity?op=list" target="work">活动管理</a>
								</p>
								<p>
									<a href="Activity?op=brandList" target="work">品牌用户</a>
								</p>



							</div>
						</div>
					</div>
					<!-- 导购客户-->
					<div class="panel panel-default">
						<div
							style="font-size: 1.5em; font-family: 幼圆; background: #b60927; text-align: center"
							class="panel-heading" role="tab">
							<a style="color: white;" accordion-toggle" data-toggle="collapse"
								data-parent="#accordion-101236" href="#accordion-element-003">导购客户</a>
						</div>
						<div id="accordion-element-003" class="accordion-body collapse ">
							<div style="text-align: left" class="panel-body">
								<p>
									<a href="salesman.jsp" target='work'>业务员</a>
								</p>
								<p>
									<a href="customer_management.jsp" target="work">客户管理</a>
								</p>

							</div>

						</div>
					</div>
					<!-- 综合查询 -->
					<div class="panel panel-default">
						<div
							style="font-size: 1.5em; font-family: 幼圆; background: #b60927; text-align: center"
							class="panel-heading" role="tab">
							<a style="color: white;" accordion-toggle" data-toggle="collapse"
								data-parent="#accordion-101236" href="#accordion-element-004">综合查询</a>
						</div>
						<div id="accordion-element-004" class="accordion-body collapse ">
							<div style="text-align: left" class="panel-body">
								<p>
									<a href="sign_rating.jsp" target="work">签到率</a>
								</p>
								<p>
									<a href="sign_detail.jsp" target="work">签单明细</a>
								</p>
								<p>
									<a href="signed_custorm.jsp" target="work">已签到客户</a>
								</p>
								<p>
									<a href="unsigned_custorm.jsp" target="work">未签到客户</a>
								</p>

								<p>
									<a href="send_card_count.jsp" target="work">发证人签单数</a>
								</p>
								<p>
									<a href="brand_card_count.jsp" target="work">各品牌签单数</a>
								</p>


								<p>
									<a href="brand_send_card_count.jsp" target="work">品牌发证单数</a>
								</p>
								<p>
									<a href="take_sheet_detail.jsp" target="work">带单明细</a>
								</p>

								<p>
									<a href="red_packet_query.jsp" target="work">红包查询</a>
								</p>
								<p>
									<a href="daijinquan_query.jsp" target="work">代金券查询</a>
								</p>

								<p>
									<a href="liandan_query.jsp" target="work">联单领奖查询</a>
								</p>
								<p>
									<a href="brand_liandan_count.jsp" target="work">品牌联单数量统计</a>
								</p>
								<p>
									<a href="zajindan_query.jsp" target="work">砸金蛋查询</a>
								</p>
								<p>
									<a href="zajindan_count.jsp" target="work">砸金蛋数量统计</a>
								</p>
								<p>
									<a href="brandzajindan_query.jsp" target="work">品牌砸金蛋统计</a>
								</p>
								<p>
									<a href="yugouquan_query.jsp" target="work">预购券查询</a>
								</p>
								<p>
									<a href="customer_sheet_detail.jsp" target="work">客户签单明细</a>
								</p>
								<p>
									<a href="lotterydraw_query.jsp" target="work">抽奖查询</a>
								</p>

								<p>
									<a href="daysellcard_query.jsp" target="work"> 每日售卡查询</a>
								</p>







							</div>
						</div>
					</div>
					<!-- 权限管理-->

					<div class="panel panel-default">
						<div
							style="font-size: 1.5em; font-family: 幼圆; background: #b60927; text-align: center"
							class="panel-heading" role="tab">
							<a style="color: white;" accordion-toggle" data-toggle="collapse"
								data-parent="#accordion-101236" href="#accordion-element-005">权限管理</a>
						</div>
						<div id="accordion-element-005" class="accordion-body collapse ">
							<div style="text-align: left" class="panel-body">
								<p>
									<a href=" menu_manage.jsp" target="work">菜单管理</a>
								</p>
								<p>
									<a href="roles_manage.jsp" target="work">角色管理</a>
								</p>
								<p>
									<a href="" target="">系统参数</a>
								</p>
							</div>
						</div>
					</div>
					<!-- 活动引流 -->

					<div class="panel panel-default">
						<div
							style="font-size: 1.5em; font-family: 幼圆; background: #b60927; text-align: center"
							class="panel-heading" role="tab">
							<a style="color: white;" accordion-toggle" data-toggle="collapse"
								data-parent="#accordion-101236" href="#accordion-element-006">活动引流</a>
						</div>
						<div id="accordion-element-006" class="accordion-body collapse ">
							<div style="text-align: left center; text-decoration: none"
								class="panel-body">
								<p>
									<a href="business_maintenance.jsp" target="work">商家维护</a>
								</p>
								<p>
									<a href="staff_management.jsp" target="work">店员维护</a>
								</p>
								<p>
									<a href="" target="">邀请返现</a>
								</p>
								<p>
									<a href="user_card.jsp" target="work">用户卡券</a>
								</p>
								<p>
									<a href="lottery_record.jsp" target="work">中奖纪录</a>
								</p>
								<p>
									<a href="card_count.jsp" target="work">卡券统计</a>
								</p>
								<p>
									<a href="invitation_query.jsp" target="work">邀约查询</a>
								</p>


							</div>
						</div>
					</div>


				</div>
			</div>
		</div>

		<!-- 右边显示栏 -->
		<div class="col-md-10 "
			style="min-height: 500px; border: 1px solid red; margin-top: 20px">


			<iframe name="work" src="main.html"
				style="width: 100%; min-height: 600px; border: 1px;"> </iframe>


		</div>


	</div>


	</div>



	</div>
</body>
</html>