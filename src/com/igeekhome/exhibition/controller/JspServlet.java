package com.igeekhome.exhibition.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/jsp" })
public class JspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JspServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String jspName = request.getParameter("name");
		if ((jspName != null) && (!"".equals(jspName))) {
			request.getRequestDispatcher("WEB-INF/jsp/" + jspName + ".jsp").forward(request, response);
		} else {
			response.sendRedirect("404.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
