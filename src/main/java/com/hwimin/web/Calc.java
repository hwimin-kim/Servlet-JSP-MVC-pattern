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

		// 데이터를 UTF-8로 보낸다.
		response.setCharacterEncoding("UTF-8");

		// 브라우저에게 html 타입 파일로 보내니 UTF-8로 해석해라
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
		
		if(op.equals("덧셈")) result = first + second;
		if(op.equals("뺄셈")) result = first - second;
		
		out.print("계산결과: "+result+"입니다!!");
		
	}
}
