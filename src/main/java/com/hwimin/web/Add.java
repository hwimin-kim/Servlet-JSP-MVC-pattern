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

		// 데이터를 UTF-8로 보낸다.
		response.setCharacterEncoding("UTF-8");

		// 브라우저에게 html 타입 파일로 보내니 UTF-8로 해석해라
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
		out.print("계산결과: "+first_+"입니다!!");
		out.print("계산결과: "+second_+"입니다!!");
		out.print("계산결과: "+result+"입니다!!");
		
	}
}
