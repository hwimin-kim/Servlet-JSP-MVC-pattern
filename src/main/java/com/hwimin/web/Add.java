package com.hwimin.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// �����͸� UTF-8�� ������.
		response.setCharacterEncoding("UTF-8");

		// ���������� html Ÿ�� ���Ϸ� ������ UTF-8�� �ؼ��ض�
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String first = request.getParameter("first");
		String second = request.getParameter("second");
		
		 int first_ = 0;
		 int second_ = 0;
		 int result = 0;

		if(first != null && !first.equals("")) {
			if(second != null && !second.equals("")) {
				first_ = Integer.parseInt(first);
				second_ = Integer.parseInt(second);
				result = first_ + second_;
			}
		}
		out.print("�����: "+first_+"�Դϴ�!!");
		out.print("�����: "+second_+"�Դϴ�!!");
		out.print("�����: "+result+"�Դϴ�!!");
		
	}
}
