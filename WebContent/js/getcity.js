/**
 * 
 */



function toOut() {

	location.href = "Activity?op=list";
}

function test() {

	var selectedProvince = document.getElementById("province").value;
	//alert("选择后的省"+selectedProvince);
	var selectedCity = document.getElementById("city").value;

	document.getElementById("getprovince").value = selectedProvince;
	document.getElementById("getcity").value = selectedCity;

	// var ac = document.getElementById("actName").value;
	// alert("修改后的活动名称为" + ac);
	return true;
}

/*
 * window.onload = function getcityByProvince() {
 * 
 * var pro = document.getElementById("getprovince").value; // alert(pro); //var
 * city = document.getElementById("getcity").value; // alert(city);
 * 
 * document.getElementById("province").value = pro;
 *  }
 */