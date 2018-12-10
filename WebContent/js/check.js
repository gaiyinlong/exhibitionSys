window.onload = function() {
	createCode();

}

function checkregister(form) {

	if (checkName() && checkPass()) {
		return true
	} else {
		return false;
	}
}

function checkName() {
	var uname = document.reg.uname.value;

	// alert(uname);
	var name = /^[^\s]{6,12}$/;
	if (!name.test(uname)) {
		document.getElementById('errorMessage2').innerHTML = "账号格式不正确6-12位";
		$("#zhanghao").focus();
		$("#zhanghao").val("");

		return false;
	}
	return true;
}
function checkPass() {
	var upass = document.reg.upass.value;
	var passcheck = document.reg.queren.value;
	var pass = /^[^\s]{6,16}$/;
	if (!pass.test(upass)) {

		// alert("密码格式不正确!需要6到16位");
		document.getElementById('errorMessage2').innerHTML = "密码格式不正确!需要6到16位";
		$("#mima").val("");

		return false;
	}
	document.getElementById('errorMessage2').innerHTML = "";
	if (upass != passcheck) {

		document.getElementById('errorMessage2').innerHTML = "两次输入的密码不一致！";
		$("#queren").val("");

		return false;
	}
	return true;
}

function quchutichi() {
	alert("111");
	$("#erroMessage").hide();

}

function checkForm(form) {

	if (form.username.value == "") {

		document.getElementById('erroMessage').innerHTML = "用户名不能为空！";

		form.username.focus();

		return false;
	}

	if (form.userpass.value == "") {

		document.getElementById('erroMessage').innerHTML = "密码不能为空！";
		form.userpass.focus();
		return false;
	}
	if (form.usercode.value == "") {
		document.getElementById('erroMessage').innerHTML = "注册码不能为空！";

		form.usercode.focus();
		return false;
	}

	checkCode();

	return true;

}

var code;
// 生成验证码
function createCode() {
	code = "";
	var codelength = 4;// 验证码长度为4
	var checkcode = document.getElementById("codepicture");
	var random = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D',
			'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
	for (var i = 0; i < codelength; i++) {// 循环操作
		var index = Math.floor(Math.random() * 36);// 取得随机数的索引（0~35）
		code += random[index];// 根据索引取得随机数加到code上

	}
	checkcode.value = code;// 把code值赋给验证码

}
// 获取输入的验证码

function checkCode() {
	var inputCode = document.getElementById("usercode").value.toUpperCase();

	if (inputCode.length <= 0) {

		document.getElementById('erroMessage').innerHTML = "请输入验证码！";
		$("#usercode").focus();
		document.getElementById('erroMessage').innerHTML = "";
		$("#usercode").focus();
		return false;
	} else if (inputCode != code) {

		document.getElementById('erroMessage').innerHTML = "验证码输入错误！";
		createCode();
		$("#usercode").val("");
		document.getElementById('erroMessage').innerHTML = "";
		$("#usercode").focus();
		return false;

	} else {

		$("#usercode").blur;
		return true;
	}
}
