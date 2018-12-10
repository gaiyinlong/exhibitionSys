<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理登陆</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- 引入基本的CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<!-- 引入bootstrap主题(可选的) -->
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<!-- 引入jquery 1.11.1） -->
<script src="bootstrap/js/jquery.min.js"></script>
<!-- 引入bootstrap.min.js文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>


<script type="text/javascript" src="js/check.js"></script>
<style>
body {
	background: #fff url('images/23451.jpg') no-repeat left top;
	background-size: 100%;
}
</style>

</head>

<body>
	<canvas id="canvas" width="1400px" height="80%"></canvas>
	<div class="login" style="margin-top: -650px">
		<div class="top"></div>
		<div id="erroMessage">&nbsp;${erroMessage }</div>


		<div style="margin-top: -23px">
			<form action="loginServlet" method="post"
				onsubmit="return checkForm(this)">

				<div class="top_1" style="margin-top: 30px">


					<div id="icon_user_position" class="input-group">

						<div id="icon_user" class="glyphicon glyphicon-user"></div>



						<input id="username" name="username" type="text"
							class="form-control" placeholder="用户名" />

					</div>

					<div id="icon_pass_position" class="input-group">


						<div id="icon_pass" class="glyphicon glyphicon-lock"></div>

						<input id="userpass" name="userpass" type="password"
							class="form-control" placeholder="密码" />


					</div>
					<div id="usercode_position" class="input-group">
						<input id="usercode" name="usercode" class="form-control"
							placeholder="验证码">

						<!-- 验证码 -->
						<input class="codepicture"
							style="border: none; outline: medium; font-size: 1.8em; text-align: center; font-family: 黑体;"
							type="text" id="codepicture" onclick="createCode();" /></br>




					</div>

				</div>

				<div id="login_sys" style="margin-top: -14px" class="input-group">

					<button type="submit" id="btnlogin" class="btnlogin">登录</button>



				</div>
		</div>

	</div>

	</div>
	</form>


	</div>

	<div id="register" class="input-group">
		<a style="cursor: pointer" type="button" data-toggle="modal"
			data-target="#myModal">注册点这里</a>

		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h3 class="modal-title" id="myModalLabel">用戶註冊</h3>

					</div>
					<div style="color: red" id="errorMessage2">&nbsp;</div>
					<form name="reg" action="addUserServlet" method="post"
						onsubmit="return checkregister(this)">
						<div class="modal-body">

							<div class="input-group input-group-lg">
								<span class="input-group-addon">账号</span> <input
									onblur="checkName();" id="zhanghao" name="uname" type="text"
									class="form-control" placeholder="*6-12位数字、字母、或下划线等符号组成"
									required aria-describedby="sizing-addon1" />


							</div>
							</br>

							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1">密碼</span> <input
									onblur="checkPass();" id="mima" name="upass" type="password"
									class="form-control" placeholder="*6~16位由数字、字母、或下划线等符号组成"
									required aria-describedby="sizing-addon1" />
							</div>
							</br>

							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1">确认密码</span> <input
									onblur="checkPass();" id="queren" name="queren" type="password"
									class="form-control" placeholder=""
									aria-describedby="sizing-addon1" required />
							</div>

							</br>
							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1"> 角色类型</span>
								<select class="form-control" placeholder=""
									aria-describedby="sizing-addon1">
									<option value="1">超级管理员</option>
									<option value="2">后台品牌商</option>
									<option value="3">后台业务员</option>
									<option value="4">后台活动负责人</option>

								</select>

							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">取消</button>
							<button type="submit" class="btn btn-primary">确认</button>
						</div>
					</form>
				</div>
			</div>

			<script>
				//粒子动画效果
				var canvas = document.getElementById("canvas");
				var ctx = canvas.getContext("2d");

				resize();
				window.onresize = resize;

				function resize() {
					canvas.width = window.innerWidth
							|| document.documentElement.clientWidth
							|| document.body.clientWidth;
					canvas.height = window.innerHeight
							|| document.documentElement.clientHeight
							|| document.body.clientHeight;
				}

				var RAF = (function() {
					return window.requestAnimationFrame
							|| window.webkitRequestAnimationFrame
							|| window.mozRequestAnimationFrame
							|| window.oRequestAnimationFrame
							|| window.msRequestAnimationFrame
							|| function(callback) {
								window.setTimeout(callback, 1000 / 6);
							};
				})();

				// 鼠标活动时，获取鼠标坐标
				var warea = {
					x : null,
					y : null,
					max : 20000
				};
				window.onmousemove = function(e) {
					e = e || window.event;

					warea.x = e.clientX;
					warea.y = e.clientY;
				};
				window.onmouseout = function(e) {
					warea.x = null;
					warea.y = null;
				};

				// 添加粒子
				// x，y为粒子坐标，xa, ya为粒子xy轴加速度，max为连线的最大距离
				var dots = [];
				for (var i = 0; i < 80; i++) {
					var x = Math.random() * canvas.width;
					var y = Math.random() * canvas.height;
					var xa = Math.random() * 2 - 1;
					var ya = Math.random() * 2 - 1;

					dots.push({
						x : x,
						y : y,
						xa : xa,
						ya : ya,
						max : 3000
					})
				}

				// 延迟0.1秒开始执行动画，如果立即执行有时位置计算会出错
				setTimeout(function() {
					animate();
				}, 100);

				// 每一帧循环的逻辑
				function animate() {
					ctx.clearRect(0, 0, canvas.width, canvas.height);

					// 将鼠标坐标添加进去，产生一个用于比对距离的点数组
					var ndots = [ warea ].concat(dots);

					dots
							.forEach(function(dot) {

								// 粒子位移
								dot.x += dot.xa;
								dot.y += dot.ya;

								// 遇到边界将加速度反向
								dot.xa *= (dot.x > canvas.width || dot.x < 0) ? -1
										: 1;
								dot.ya *= (dot.y > canvas.height || dot.y < 0) ? -1
										: 1;

								// 绘制点
								ctx.fillRect(dot.x - 0.5, dot.y - 0.5, 1, 1);
								ctx.fillStyle = '#aaa';

								// 循环比对粒子间的距离
								for (var i = 0; i < ndots.length; i++) {
									var d2 = ndots[i];

									if (dot === d2 || d2.x === null
											|| d2.y === null)
										continue;

									var xc = dot.x - d2.x;
									var yc = dot.y - d2.y;

									// 两个粒子之间的距离
									var dis = xc * xc + yc * yc;

									// 距离比
									var ratio;

									// 如果两个粒子之间的距离小于粒子对象的max值，则在两个粒子间画线
									if (dis < d2.max) {

										// 如果是鼠标，则让粒子向鼠标的位置移动
										if (d2 === warea && dis > (d2.max / 2)) {
											dot.x -= xc * 0.03;
											dot.y -= yc * 0.03;
										}

										// 计算距离比
										ratio = (d2.max - dis) / d2.max;

										// 画线
										ctx.beginPath();
										ctx.lineWidth = ratio / 2;
										ctx.strokeStyle = 'rgb(255,0,0)';
										ctx.moveTo(dot.x, dot.y);
										ctx.lineTo(d2.x, d2.y);
										ctx.stroke();

									}
								}

								// 将已经计算过的粒子从数组中删除
								ndots.splice(ndots.indexOf(dot), 1);
							});

					RAF(animate);
				}
			</script>
		</div>
</body>
</html>