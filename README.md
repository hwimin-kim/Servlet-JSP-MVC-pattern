# Servlet JSP MVC pattern

## 기능

1. Servlet
2. JSP
3. MVC pattern

## Servlet

- URL 매핑 1, web.xml(Servlet mapping)
- URL 매핑 2, Annotation(WebServlet)
- request, response 인코딩(한글 깨짐)
- GET, POST 요청

- ### URL 매핑 1, web.xml(Servlet mapping)

  - web.xml 파일

  ```
  <servlet>
  <servlet-name>na</servlet-name>
  <servlet-class>com.hwimin.web.Khm</servlet-class>
  </servlet>

  <servlet-mapping>
  <servlet-name>na</servlet-name>
  <url-pattern>/hello</url-pattern>
  </servlet-mapping>
  ```

- ### URL 매핑 2, Annotation(WebServlet)
  - web.xml 파일
  ```
  metadata-complete="true">
  ```
  - Servlet 파일
  ```
  @WebServlet("/hi")
  public class Khm extends HttpServlet {}
  ```
- ### request, response 인코딩(한글 깨짐)
  - (서버 ->클라이언트)일때 서버는 UTF-8 인코딩 방식으로 보낼 것이다.
  ```
  response.setCharacterEncoding("UTF-8");
  ```
  - (서버 ->클라이언트)일때 클라이언트는 UTF-8로 읽고 파일 형식은 html이다.
  ```
  response.setContentType("text/html; charset=UTF-8");
  ```
  - (클라이언트->서버)일때 서버는 UTF-8 인코딩 방식으로 읽어라
  ```
  requset.setCharacterEncoding("UTF-8");
  ```
- ### GET, POST 요청

  - GET 클라이언트

  ```
  <body>
  	환영합니다.
  	<br>
  	<a href="hi">인사하기</a>
  	<br>
  	<a href="hi?cnt=3">인사하기</a>
  	<br>
  </body>
  ```

  - GET 서버

  ```
  PrintWriter out = response.getWriter();
  String cnt_ = requset.getParameter("cnt");
  	int cnt = 10;

   if (cnt_ != null && !cnt_.equals(""))
  		cnt = Integer.parseInt(cnt_);

  	for (int i = 0; i < cnt; i++) {
  		out.println((i + 1) + ": 안녕 Servlet!!<br >");
  	}
  ```

  - POST 클라이언트

  ```
  <form action="notice-reg" method="post">
  	<div>
  		<label>제목:</label><input type="text" name="title" />
  	</div>
  	<div>
  		<label>내용:</label>
  		<textarea name="content" rows="" cols=""></textarea>
  	</div>
  	<div>
  		<input type="submit" value="등록" />
  	</div>
  </form>
  ```

  - POST 서버

  ```
  PrintWriter out = response.getWriter();

  String title = requset.getParameter("title");
  String content = requset.getParameter("content");

  out.print(title);
  out.print(content);
  ```
