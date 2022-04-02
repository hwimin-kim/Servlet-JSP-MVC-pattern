package com.hwimin.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// �����͸� UTF-8�� ������.
		response.setCharacterEncoding("UTF-8");

		// ���������� html Ÿ�� ���Ϸ� ������ UTF-8�� �ؼ��ض�
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String first_ = request.getParameter("first");
		String second_ = request.getParameter("second");
		String op = request.getParameter("operator");
		
		 int first = 0;
		 int second = 0;
		 
		if(!first_.equals("")) first = Integer.parseInt(first_);			
		if(!second_.equals("")) second = Integer.parseInt(second_);
		int result = 0;
		
		if(op.equals("����")) result = first + second;
		if(op.equals("����")) result = first - second;
		
		out.print("�����: "+result+"�Դϴ�!!");
		
	}
}
