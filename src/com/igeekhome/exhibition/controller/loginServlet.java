package com.igeekhome.exhibition.controller;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
/**
 * ��½
 */
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igeekhome.exhibition.pojo.User;
import com.igeekhome.exhibition.service.IUserService;
import com.igeekhome.exhibition.service.imp.UserServiceImp;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private IUserService service = new UserServiceImp();

	/**
	 * 
	 */

	public loginServlet() {

	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("utf-8");
		this.doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// ��ȡ��������


		String uname = req.getParameter("username");
		String pass = req.getParameter("userpass");
		String code = req.getParameter("usercode");


		System.out.println("�û���" + uname);
		System.out.println("����" + pass);
		System.out.println("��֤��" + code);

		User loginUser = service.login(uname, pass);

    if(loginUser==null){
    	req.setAttribute("erroMessage", "��¼ʧ�ܣ��˺Ż��������");
    	req.getRequestDispatcher("jsp?name=login").forward(req, resp);
    } else{
    	HttpSession session = req.getSession();	
		session.setAttribute("loginUser", loginUser);
    	resp.sendRedirect("jsp?name=welcome");
    }

		}
	}

