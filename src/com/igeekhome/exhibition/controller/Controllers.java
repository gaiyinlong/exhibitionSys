package com.igeekhome.exhibition.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igeekhome.exhibition.pojo.Activity;
import com.igeekhome.exhibition.pojo.BrandUser;
import com.igeekhome.exhibition.pojo.GoldenEge;
import com.igeekhome.exhibition.pojo.Prize;
import com.igeekhome.exhibition.pojo.RedPackage;
import com.igeekhome.exhibition.service.IActivityService;
import com.igeekhome.exhibition.service.IBrandUserService;
import com.igeekhome.exhibition.service.IFunctionsService;
import com.igeekhome.exhibition.service.imp.ActivityServiceImp;
import com.igeekhome.exhibition.service.imp.BrandUserServiceImp;
import com.igeekhome.exhibition.service.imp.FunctionsServiceImp;

/**
 * Servlet implementation class ActivityServlet
 */
@WebServlet("/Activity")
public class Controllers extends HttpServlet {

	private IActivityService service = new ActivityServiceImp();
	private IBrandUserService serviceBrand = new BrandUserServiceImp();
	private IFunctionsService serviceFunction = new FunctionsServiceImp();

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controllers() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("op");

		if (op == null) {
			response.sendRedirect("jsp?name=404");
		} else if ("add".equals(op)) {
			add(request, response);
		} else if ("list".equals(op)) {
			list(request, response);
		} else if ("addBrandUser".equals(op)) {
			addBrandUser(request, response);
		} else if ("brandList".equals(op)) {
			brandList(request, response);
		} else if ("addBrand".equals(op)) {
			addBrand(request, response);
		} else if ("deleteActivity".equals(op)) {
			deleteActivity(request, response);
		} else if ("editActivity".equals(op)) {
			editActivity(request, response);
		} else if ("deleteBrandUser".equals(op)) {
			deleteBrandUser(request, response);
		} else if ("editActivitySubmit".equals(op)) {
			editActivitySubmit(request, response);
		} else if ("editBrandUser".equals(op)) {
			editBrandUser(request, response);
		} else if ("editBrandUserDetail".equals(op)) {
			editBrandUserDetail(request, response);
		} else if ("brandListMotal".equals(op)) {
			brandListMotal(request, response);
		} else if ("egeList".equals(op)) {
			egeList(request, response);
		} else if ("addEge".equals(op)) {
			addEge(request, response);
		} else if ("deleteEge".equals(op)) {
			deleteEge(request, response);
		} else if ("redList".equals(op)) {
			redList(request, response);
		} else if ("addRedBag".equals(op)) {
			addRedBag(request, response);
		} else if ("deleteRed".equals(op)) {
			deleteRed(request, response);
		} else if ("prizeList".equals(op)) {
			prizeList(request, response);
		} else if ("addPrize".equals(op)) {
			addPrize(request, response);
		} else if ("deletePrize".equals(op)) {
			deletePrize(request, response);
		} else if ("search".equals(op)) {
			search(request, response);
		}

	}

	/**
	 * 条件查询
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("进入查询");
		String province = request.getParameter("province");
		System.out.println(province);
		String city = request.getParameter("city");
		System.out.println(city);
		String aname = request.getParameter("activity_name");
		System.out.println(aname);

		String lname = request.getParameter("leaderName");
		String stime = request.getParameter("startime");
		String etime = request.getParameter("endtime");
		Map<String, String> timeMap = new HashMap<String, String>();
		timeMap.put("startTime", stime);
		timeMap.put("endTime", etime);
		request.setAttribute("timeMap", timeMap);
		// 将查询条件封装为对象
		Activity asearch = new Activity();
		asearch.setProvince(province);
		asearch.setCity(city);
		asearch.setActivity_name(aname);
		asearch.setLeader_name(lname);
		asearch.setStart_time(stime);
		asearch.setEnd_time(etime);

		service.query(asearch, timeMap);
		// 查询条件储存
		request.setAttribute("asearch", asearch);

		// 转发到一个JSP就可以了
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp?name=activity_management");
		dispatcher.forward(request, response);

	}

	/**
	 * 删除奖品
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void deletePrize(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String deleteId = request.getParameter("deleteId");
		String actId = request.getParameter("actId");
		int actids = Integer.parseInt(actId);

		int ids = Integer.parseInt(deleteId);
		serviceFunction.deletePrize(ids);

		serviceFunction.queryAllPrize(actids);
		request.getRequestDispatcher("Activity?op=prizeList").forward(request, response);

	}

	/**
	 * 添加奖品
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void addPrize(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("getId");
		if (id != null) {

			String pname = request.getParameter("prizeName");
			int ids = Integer.parseInt(id);
			// System.out.println("对应的id" + id);

			Prize p = new Prize(pname, ids);
			serviceFunction.savaPrize(p);
			// 转发到新的列表页面！
			request.getRequestDispatcher("Activity?op=prizeList&actId=" + id).forward(request, response);
		} else {

			int idnew = Integer.parseInt(request.getParameter("getNull"));

			String name1 = request.getParameter("prizeName");

			Prize p1 = new Prize(name1, idnew);
			serviceFunction.savaPrize(p1);
			// 转发到新的列表页面！
			request.getRequestDispatcher("Activity?op=prizeList&actId=" + idnew).forward(request, response);
		}

	}

	/**
	 * 奖品列表
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 * @throws NumberFormatException
	 */
	private void prizeList(HttpServletRequest request, HttpServletResponse response)
			throws NumberFormatException, ServletException, IOException {

		System.out.println("奖品列表");
		String id = request.getParameter("actId");
		Integer ids = Integer.parseInt(id);
		HttpSession session = request.getSession();
		session.setAttribute("getIds", id);
		System.out.println("获取的id是" + id);
		List<Prize> list = serviceFunction.queryAllPrize(ids);

		request.setAttribute("prizeList", list);

		request.getRequestDispatcher("jsp?name=prize").forward(request, response);

	}

	/**
	 * 删除红包
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void deleteRed(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String deleteId = request.getParameter("deleteId");
		String actId = request.getParameter("actId");
		int actids = Integer.parseInt(actId);
		System.out.println("活动编号是" + actId);
		System.out.println("删除的ID是" + deleteId);
		int ids = Integer.parseInt(deleteId);
		serviceFunction.deleteRedPackege(ids);

		serviceFunction.queryAllRedPackage(actids);
		request.getRequestDispatcher("Activity?op=redList").forward(request, response);

	}

	/**
	 * 添加新的红包
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void addRedBag(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("添加红包");
		String id = request.getParameter("getId");
		if (id != null) {
			String money = request.getParameter("getMoney");
			int ids = Integer.parseInt(id);
			int moneyToInt = Integer.parseInt(money);

			RedPackage r = new RedPackage(moneyToInt, ids);

			serviceFunction.saveRedPackege(r);
			// 转发到新的列表页面！
			request.getRequestDispatcher("Activity?op=redList&actId=" + id).forward(request, response);
		} else {

			int idnew = Integer.parseInt(request.getParameter("getNull"));

			System.out.println("列表为空获取的id" + idnew);
			String money1 = request.getParameter("getMoney");
			int moneyToInt1 = Integer.parseInt(money1);
			RedPackage r = new RedPackage(moneyToInt1, idnew);
			serviceFunction.saveRedPackege(r);
			// 转发到新的列表页面！
			request.getRequestDispatcher("Activity?op=redList&actId=" + idnew).forward(request, response);
		}

	}

	/**
	 * 红包列表
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void redList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("红包列表");

		String id = request.getParameter("actId");
		Integer ids = Integer.parseInt(id);
		HttpSession session = request.getSession();
		session.setAttribute("getIds", id);
		System.out.println("获取的id是" + id);
		List<RedPackage> list = serviceFunction.queryAllRedPackage(ids);

		request.setAttribute("redList", list);

		request.getRequestDispatcher("jsp?name=hongbao").forward(request, response);
	}

	/*
	 * 删除金蛋
	 */
	private void deleteEge(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String deleteId = request.getParameter("deleteId");
		String actId = request.getParameter("actId");
		int actids = Integer.parseInt(actId);
		// System.out.println("活动编号是" + actId);
		// System.out.println("删除的ID是" + deleteId);
		int ids = Integer.parseInt(deleteId);
		serviceFunction.deleteGoldenEge(ids);

		serviceFunction.queryAllEgeByActivityId(actids);
		request.getRequestDispatcher("Activity?op=egeList").forward(request, response);

	}

	/**
	 * 添加金蛋
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void addEge(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("添加请求");

		String id = request.getParameter("getId");
		if (id != null) {

			String name = request.getParameter("egeName");
			int ids = Integer.parseInt(id);
			System.out.println("对应的id" + id);

			System.out.println(name);
			GoldenEge g = new GoldenEge(name, ids);
			serviceFunction.saveGoldenEge(g);
			// 转发到新的列表页面！
			request.getRequestDispatcher("Activity?op=egeList&actId=" + id).forward(request, response);
		} else {

			int idnew = Integer.parseInt(request.getParameter("getNull"));

			System.out.println("列表为空获取的id" + idnew);
			String name1 = request.getParameter("egeName");
			System.out.println("金蛋名字为" + name1);
			GoldenEge g2 = new GoldenEge(name1, idnew);
			serviceFunction.saveGoldenEge(g2);
			// 转发到新的列表页面！
			request.getRequestDispatcher("Activity?op=egeList&actId=" + idnew).forward(request, response);
		}
	}

	/**
	 * 金蛋列表
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void egeList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("金蛋列表");

		String id = request.getParameter("actId");
		Integer ids = Integer.parseInt(id);
		HttpSession session = request.getSession();
		session.setAttribute("getIds", id);
		System.out.println("获取的id是" + id);
		List<GoldenEge> list = serviceFunction.queryAllEgeByActivityId(ids);

		request.setAttribute("egeList", list);

		request.getRequestDispatcher("jsp?name=golden_ege").forward(request, response);

	}

	/**
	 * 模态框中显示品牌用户列表
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void brandListMotal(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("模态品牌用户类表");

		List<BrandUser> brandlistMotal = serviceBrand.queryAll();

		for (int i = 0; i < brandlistMotal.size(); i++) {
			System.out.println(brandlistMotal.get(i));
		}
		request.setAttribute("brandListMotal", brandlistMotal);

		response.sendRedirect("Activity?op=brandListMotal");

	}

	/**
	 * 修改品牌用户信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void editBrandUserDetail(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String id = request.getParameter("brandId");
		System.out.println("编辑" + id);

		int ids = Integer.parseInt(id);
		String loginName = request.getParameter("uname");
		String province = request.getParameter("getprovince");
		System.out.println(province);
		String city = request.getParameter("getcity");
		System.out.println(city);
		String code = request.getParameter("brandCode");
		String bname = request.getParameter("brandName");
		String blead = request.getParameter("brandLeader");
		String tel = request.getParameter("brandLeaderTel");

		BrandUser b = new BrandUser();
		b.setId(ids);
		b.setLoginName(loginName);
		b.setProvince(province);
		b.setCity(city);
		b.setBrand_code(code);
		b.setBrand_name(bname);
		b.setBrand_leader(blead);
		b.setBrand_leaderTel(tel);
		serviceBrand.updateBrandUser(b);
		response.sendRedirect("Activity?op=brandList");

	}

	/**
	 * 根据id获取相应品牌用户信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void editBrandUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("11111");.
		String brandid = request.getParameter("bId");
		// System.out.println("传递过来的id"+brandid);
		int bid = Integer.parseInt(brandid);
		BrandUser bu = serviceBrand.queryById(bid);
		request.setAttribute("editBrandUser", bu);
		request.getRequestDispatcher("jsp?name=editBrandUser").forward(request, response);

	}

	/**
	 * 修改活动基本信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void editActivitySubmit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("actId");

		int ids = Integer.parseInt(id);

		String province = request.getParameter("getprovince");

		// System.out.println("编辑活动提交修改后的省市" + province);
		String city = request.getParameter("getcity");
		String name = request.getParameter("actName");
		// System.out.println("新的活动名称为" + name);

		String startTime = request.getParameter("start_time");
		String endTime = request.getParameter("end_time");
		String lname = request.getParameter("leaderName");
		String tel = request.getParameter("leaderTel");
		String address = request.getParameter("actAddress");

		Activity a = new Activity();
		a.setId(ids);
		a.setProvince(province);
		a.setCity(city);
		a.setActivity_name(name);
		a.setStart_time(startTime);
		a.setEnd_time(endTime);
		a.setActivity_address(address);
		a.setLeader_name(lname);
		a.setLeader_tel(tel);

		service.updateActivity(a);

		response.sendRedirect("Activity?op=list");
	}

	/**
	 * 删除品牌用户
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void deleteBrandUser(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("brandId"));

		// System.out.println("获取要删除的品牌用户id是" + id);

		serviceBrand.deleteBrandUserById(id);

		response.sendRedirect("Activity?op=brandList");

	}

	/**
	 * 通过id从数据库获取需要编辑的活动详情
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void editActivity(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ids = request.getParameter("editId");

		Integer id = Integer.parseInt(ids);

		System.out.println("id是" + id);
		Activity a = service.queryById(id);
		// 到这边的时候Id为0；
		request.setAttribute("editActivity", a);
		request.getRequestDispatcher("jsp?name=editActivity").forward(request, response);

	}

	/**
	 * 删除活动
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void deleteActivity(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("id"));

		service.deleteActivity(id);

		response.sendRedirect("Activity?op=list");

	}

	/**
	 * 添加品牌
	 * 
	 * @param request
	 * @param response
	 */
	private void addBrand(HttpServletRequest request, HttpServletResponse response) {
		// System.out.println("添加品牌！");
		String bname = request.getParameter("brandName");
		String leaderName = request.getParameter("brandLeader");
		String tel = request.getParameter("brandLeaderTel");
		// System.out.println(bname);

	}

	/**
	 * 品牌用户列表
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void brandList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// System.out.println("进入品牌用户列表！！！！");
		List<BrandUser> brandlist = serviceBrand.queryAll();
		// 不再使用输出流输出字符串到浏览器
		// 将集合设置为request对象的一个属性
		request.setAttribute("brandlists", brandlist);
		// 转发到一个JSP就可以了
		// ----------------------- 会自动进入listUser.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp?name=brand_user");
		// RequestDispatcher dispatcher =
		// request.getRequestDispatcher("WEB-INF/jsp/listUser.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * 添加品牌用户
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void addBrandUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// System.out.println("添加品牌用户了！");

		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String pro = request.getParameter("getprovince");
		String city = request.getParameter("getcity");
		String brandCode = request.getParameter("brandCode");
		String brandName = request.getParameter("brandName");
		String leader = request.getParameter("brandLeader");
		String tel = request.getParameter("brandLeaderTel");

		BrandUser bu = new BrandUser(name, pass, pro, city, brandCode, brandName, leader, tel);

		BrandUser i = serviceBrand.queryByBrandName(brandName);
		if (i == null) {
			serviceBrand.addBrandUser(bu);
			request.getRequestDispatcher("Activity?op=brandList").forward(request, response);
		} else {

			request.setAttribute("erroMessage", "该品牌已经存在了！");
			request.getRequestDispatcher("jsp?name=addbrand_user").forward(request, response);
		}

	}

	/**
	 * 
	 * @param request
	 * @param createTime1
	 * @param createTime2
	 * @return
	 */

	public String showList(HttpServletRequest request, String createTime1, String createTime2) {

		Map<String, String> map = new HashMap<String, String>();

		return null;

	}

	/**
	 * 活动列表
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("进入列表！！！！");

		List<Activity> list = service.queryAll();

		request.setAttribute("lists", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp?name=activity_management");

		dispatcher.forward(request, response);

	}

	/**
	 * 添加活动
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 获取活动页面数据

		String province = request.getParameter("getprovince");
		String city = request.getParameter("getcity");
		// System.out.println(province);
		// System.out.println(city);
		String aname = request.getParameter("actName");
		String startTime = request.getParameter("start_time");
		// System.out.println("开始时间"+startTime);
		String endTime = request.getParameter("end_time");
		String address = request.getParameter("actAddress");

		String leadName = request.getParameter("leaderName");
		String leadtel = request.getParameter("leaderTel");

		Activity a = new Activity(province, city, aname, startTime, endTime, address, leadName, leadtel);
		// 先去查询该活动名称是否已经存在
		Activity act = (Activity) service.queryByActivity_Name(aname);
		if (act == null) {
			service.saveActivity(a);
			request.getRequestDispatcher("Activity?op=list").forward(request, response);
		} else {
			request.setAttribute("erroMessage", "该活动已经存在了！");
			request.getRequestDispatcher("jsp?name=add_activity").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
