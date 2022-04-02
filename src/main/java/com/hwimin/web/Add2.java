package com.hwimin.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class Add2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 데이터를 UTF-8로 보낸다.
		response.setCharacterEncoding("UTF-8");

		// 브라우저에게 html 타입 파일로 보내니 UTF-8로 해석해라
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String[] num_ = request.getParameterValues("num");
		int result = 0;
		
		for(int i=0 ; i<num_.length; i++) {
			int num = Integer.parseInt(num_[i]);
			result += num;
		}
	
		out.print("계산결과: "+result+"입니다!!");
		
	}
}
