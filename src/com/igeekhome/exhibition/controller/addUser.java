package com.igeekhome.exhibition.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeekhome.exhibition.pojo.User;
import com.igeekhome.exhibition.service.IUserService;
import com.igeekhome.exhibition.service.imp.UserServiceImp;
import com.igeekhome.exhibition.util.MD5Util;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUserServlet")
public class addUser extends HttpServlet {

	private IUserService service = new UserServiceImp();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 * 
	 * 
	 * 
	 */
	public addUser() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		String checkpass = request.getParameter("checkpass");
		String sysTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());

		User u = new User();

		u.setLoginName(uname);
		u.setLoginPass(MD5Util.getMD5(upass));

		u.setCreateTime(sysTime);

		// 调用service将封装好的用户对象传递到service
		int result = service.saveUser(u);
		// 回到登陆界面去进行登陆！
		request.getRequestDispatcher("jsp?name=login").forward(request, response);
		// list(request,response);

	}

}
