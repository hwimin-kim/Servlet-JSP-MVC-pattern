package com.hwimin.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Khm extends HttpServlet {
	@Override
	protected void service(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {

		// �����͸� UTF-8�� ������.
		response.setCharacterEncoding("UTF-8");

		// ���������� html Ÿ�� ���Ϸ� ������ UTF-8�� �ؼ��ض�
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String cnt_ = requset.getParameter("cnt");
		int cnt = 10;
		if (cnt_ != null && !cnt_.equals(""))
			cnt = Integer.parseInt(cnt_);

		for (int i = 0; i < cnt; i++) {
			out.println((i + 1) + ": �ȳ� Servlet!!<br >");
		}
	}
}
