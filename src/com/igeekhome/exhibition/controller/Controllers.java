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
	 * ������ѯ
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("�����ѯ");
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
		// ����ѯ������װΪ����
		Activity asearch = new Activity();
		asearch.setProvince(province);
		asearch.setCity(city);
		asearch.setActivity_name(aname);
		asearch.setLeader_name(lname);
		asearch.setStart_time(stime);
		asearch.setEnd_time(etime);

		service.query(asearch, timeMap);
		// ��ѯ��������
		request.setAttribute("asearch", asearch);

		// ת����һ��JSP�Ϳ�����
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp?name=activity_management");
		dispatcher.forward(request, response);

	}

	/**
	 * ɾ����Ʒ
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
	 * ��ӽ�Ʒ
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
			// System.out.println("��Ӧ��id" + id);

			Prize p = new Prize(pname, ids);
			serviceFunction.savaPrize(p);
			// ת�����µ��б�ҳ�棡
			request.getRequestDispatcher("Activity?op=prizeList&actId=" + id).forward(request, response);
		} else {

			int idnew = Integer.parseInt(request.getParameter("getNull"));

			String name1 = request.getParameter("prizeName");

			Prize p1 = new Prize(name1, idnew);
			serviceFunction.savaPrize(p1);
			// ת�����µ��б�ҳ�棡
			request.getRequestDispatcher("Activity?op=prizeList&actId=" + idnew).forward(request, response);
		}

	}

	/**
	 * ��Ʒ�б�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 * @throws NumberFormatException
	 */
	private void prizeList(HttpServletRequest request, HttpServletResponse response)
			throws NumberFormatException, ServletException, IOException {

		System.out.println("��Ʒ�б�");
		String id = request.getParameter("actId");
		Integer ids = Integer.parseInt(id);
		HttpSession session = request.getSession();
		session.setAttribute("getIds", id);
		System.out.println("��ȡ��id��" + id);
		List<Prize> list = serviceFunction.queryAllPrize(ids);

		request.setAttribute("prizeList", list);

		request.getRequestDispatcher("jsp?name=prize").forward(request, response);

	}

	/**
	 * ɾ�����
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
		System.out.println("������" + actId);
		System.out.println("ɾ����ID��" + deleteId);
		int ids = Integer.parseInt(deleteId);
		serviceFunction.deleteRedPackege(ids);

		serviceFunction.queryAllRedPackage(actids);
		request.getRequestDispatcher("Activity?op=redList").forward(request, response);

	}

	/**
	 * ����µĺ��
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void addRedBag(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("��Ӻ��");
		String id = request.getParameter("getId");
		if (id != null) {
			String money = request.getParameter("getMoney");
			int ids = Integer.parseInt(id);
			int moneyToInt = Integer.parseInt(money);

			RedPackage r = new RedPackage(moneyToInt, ids);

			serviceFunction.saveRedPackege(r);
			// ת�����µ��б�ҳ�棡
			request.getRequestDispatcher("Activity?op=redList&actId=" + id).forward(request, response);
		} else {

			int idnew = Integer.parseInt(request.getParameter("getNull"));

			System.out.println("�б�Ϊ�ջ�ȡ��id" + idnew);
			String money1 = request.getParameter("getMoney");
			int moneyToInt1 = Integer.parseInt(money1);
			RedPackage r = new RedPackage(moneyToInt1, idnew);
			serviceFunction.saveRedPackege(r);
			// ת�����µ��б�ҳ�棡
			request.getRequestDispatcher("Activity?op=redList&actId=" + idnew).forward(request, response);
		}

	}

	/**
	 * ����б�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void redList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("����б�");

		String id = request.getParameter("actId");
		Integer ids = Integer.parseInt(id);
		HttpSession session = request.getSession();
		session.setAttribute("getIds", id);
		System.out.println("��ȡ��id��" + id);
		List<RedPackage> list = serviceFunction.queryAllRedPackage(ids);

		request.setAttribute("redList", list);

		request.getRequestDispatcher("jsp?name=hongbao").forward(request, response);
	}

	/*
	 * ɾ����
	 */
	private void deleteEge(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String deleteId = request.getParameter("deleteId");
		String actId = request.getParameter("actId");
		int actids = Integer.parseInt(actId);
		// System.out.println("������" + actId);
		// System.out.println("ɾ����ID��" + deleteId);
		int ids = Integer.parseInt(deleteId);
		serviceFunction.deleteGoldenEge(ids);

		serviceFunction.queryAllEgeByActivityId(actids);
		request.getRequestDispatcher("Activity?op=egeList").forward(request, response);

	}

	/**
	 * ��ӽ�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void addEge(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("�������");

		String id = request.getParameter("getId");
		if (id != null) {

			String name = request.getParameter("egeName");
			int ids = Integer.parseInt(id);
			System.out.println("��Ӧ��id" + id);

			System.out.println(name);
			GoldenEge g = new GoldenEge(name, ids);
			serviceFunction.saveGoldenEge(g);
			// ת�����µ��б�ҳ�棡
			request.getRequestDispatcher("Activity?op=egeList&actId=" + id).forward(request, response);
		} else {

			int idnew = Integer.parseInt(request.getParameter("getNull"));

			System.out.println("�б�Ϊ�ջ�ȡ��id" + idnew);
			String name1 = request.getParameter("egeName");
			System.out.println("������Ϊ" + name1);
			GoldenEge g2 = new GoldenEge(name1, idnew);
			serviceFunction.saveGoldenEge(g2);
			// ת�����µ��б�ҳ�棡
			request.getRequestDispatcher("Activity?op=egeList&actId=" + idnew).forward(request, response);
		}
	}

	/**
	 * ���б�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void egeList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("���б�");

		String id = request.getParameter("actId");
		Integer ids = Integer.parseInt(id);
		HttpSession session = request.getSession();
		session.setAttribute("getIds", id);
		System.out.println("��ȡ��id��" + id);
		List<GoldenEge> list = serviceFunction.queryAllEgeByActivityId(ids);

		request.setAttribute("egeList", list);

		request.getRequestDispatcher("jsp?name=golden_ege").forward(request, response);

	}

	/**
	 * ģ̬������ʾƷ���û��б�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void brandListMotal(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("ģ̬Ʒ���û����");

		List<BrandUser> brandlistMotal = serviceBrand.queryAll();

		for (int i = 0; i < brandlistMotal.size(); i++) {
			System.out.println(brandlistMotal.get(i));
		}
		request.setAttribute("brandListMotal", brandlistMotal);

		response.sendRedirect("Activity?op=brandListMotal");

	}

	/**
	 * �޸�Ʒ���û���Ϣ
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void editBrandUserDetail(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String id = request.getParameter("brandId");
		System.out.println("�༭" + id);

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
	 * ����id��ȡ��ӦƷ���û���Ϣ
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
		// System.out.println("���ݹ�����id"+brandid);
		int bid = Integer.parseInt(brandid);
		BrandUser bu = serviceBrand.queryById(bid);
		request.setAttribute("editBrandUser", bu);
		request.getRequestDispatcher("jsp?name=editBrandUser").forward(request, response);

	}

	/**
	 * �޸Ļ������Ϣ
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void editActivitySubmit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("actId");

		int ids = Integer.parseInt(id);

		String province = request.getParameter("getprovince");

		// System.out.println("�༭��ύ�޸ĺ��ʡ��" + province);
		String city = request.getParameter("getcity");
		String name = request.getParameter("actName");
		// System.out.println("�µĻ����Ϊ" + name);

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
	 * ɾ��Ʒ���û�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void deleteBrandUser(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("brandId"));

		// System.out.println("��ȡҪɾ����Ʒ���û�id��" + id);

		serviceBrand.deleteBrandUserById(id);

		response.sendRedirect("Activity?op=brandList");

	}

	/**
	 * ͨ��id�����ݿ��ȡ��Ҫ�༭�Ļ����
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

		System.out.println("id��" + id);
		Activity a = service.queryById(id);
		// ����ߵ�ʱ��IdΪ0��
		request.setAttribute("editActivity", a);
		request.getRequestDispatcher("jsp?name=editActivity").forward(request, response);

	}

	/**
	 * ɾ���
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
	 * ���Ʒ��
	 * 
	 * @param request
	 * @param response
	 */
	private void addBrand(HttpServletRequest request, HttpServletResponse response) {
		// System.out.println("���Ʒ�ƣ�");
		String bname = request.getParameter("brandName");
		String leaderName = request.getParameter("brandLeader");
		String tel = request.getParameter("brandLeaderTel");
		// System.out.println(bname);

	}

	/**
	 * Ʒ���û��б�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void brandList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// System.out.println("����Ʒ���û��б�������");
		List<BrandUser> brandlist = serviceBrand.queryAll();
		// ����ʹ�����������ַ����������
		// ����������Ϊrequest�����һ������
		request.setAttribute("brandlists", brandlist);
		// ת����һ��JSP�Ϳ�����
		// ----------------------- ���Զ�����listUser.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp?name=brand_user");
		// RequestDispatcher dispatcher =
		// request.getRequestDispatcher("WEB-INF/jsp/listUser.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * ���Ʒ���û�
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void addBrandUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// System.out.println("���Ʒ���û��ˣ�");

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

			request.setAttribute("erroMessage", "��Ʒ���Ѿ������ˣ�");
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
	 * ��б�
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("�����б�������");

		List<Activity> list = service.queryAll();

		request.setAttribute("lists", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp?name=activity_management");

		dispatcher.forward(request, response);

	}

	/**
	 * ��ӻ
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// ��ȡ�ҳ������

		String province = request.getParameter("getprovince");
		String city = request.getParameter("getcity");
		// System.out.println(province);
		// System.out.println(city);
		String aname = request.getParameter("actName");
		String startTime = request.getParameter("start_time");
		// System.out.println("��ʼʱ��"+startTime);
		String endTime = request.getParameter("end_time");
		String address = request.getParameter("actAddress");

		String leadName = request.getParameter("leaderName");
		String leadtel = request.getParameter("leaderTel");

		Activity a = new Activity(province, city, aname, startTime, endTime, address, leadName, leadtel);
		// ��ȥ��ѯ�û�����Ƿ��Ѿ�����
		Activity act = (Activity) service.queryByActivity_Name(aname);
		if (act == null) {
			service.saveActivity(a);
			request.getRequestDispatcher("Activity?op=list").forward(request, response);
		} else {
			request.setAttribute("erroMessage", "�û�Ѿ������ˣ�");
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
