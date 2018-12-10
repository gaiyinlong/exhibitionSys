<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微信群发</title>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" />
<script src="bootstrap/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
select {
	height: 23px;
	border-radius: 4px
}
</style>
<script type="text/javascript">
	$(function() {
		$("#message").hide();
		$("input[name='fans']").click(function() {

			if ($(this).val() != "all") {
				$("#message").show();
			} else {
				$("#message").hide();

			}

		});
	})
</script>

</head>
<body>

	<ol style="font-family: 幼圆; font-size: 1.5em;" class="breadcrumb">
		<li><a style="color: black" href="">首页</a></li>
		<li><a style="color: black" href="">微信管理</a></li>
		<li class="active">群发</li>
	</ol>

	<div class="table-responsive">
		<div>
			<form action="" method="get">

				分组：<input name="fans" type="radio" value="all" /> 所有粉丝 &nbsp; <input
					name="fans" type="radio" value="group" /> 选择分组 <select
					id="message">
					<option>星标组</option>
					<option>黑名单</option>
					<option>未分组</option>

				</select>

				<div style="margin-top: 20px" class="container-fluid">
					<div class="row-fluid">
						<div class="span12">
							<div class="tabbable" id="tabs-970390">
								<ul class="nav nav-tabs">
									<li class="active"><a href="#panel-01" data-toggle="tab">文字</a>
									</li>
									<li><a href="#panel-02" data-toggle="tab">图文</a></li>

									<li><a href="#panel-03" data-toggle="tab">图片</a></li>
									<li><a href="#panel-04" data-toggle="tab">音频</a></li>
									<li><a href="#panel-05" data-toggle="tab">视频</a></li>

								</ul>
								<div class="tab-content">
									<div class="tab-pane active" id="panel-01">

										<textarea rows=10 cols=100></textarea>
									</div>
									<div class="tab-pane " id="panel-02">
										<p>第二部分内容.</p>
									</div>
									<div class="tab-pane " id="panel-03">
										<p>第三部分内容.</p>
									</div>
									<div class="tab-pane " id="panel-04">
										<p>第四部分内容.</p>
									</div>
										<div class="tab-pane " id="panel-05">
										<p>第五部分内容.</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>




			</form>
</body>
</html>