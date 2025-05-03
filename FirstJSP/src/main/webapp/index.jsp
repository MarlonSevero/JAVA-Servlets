<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String x = "Hello World!";
		out.println(x);
		String browser = request.getHeader("user-agent");
		out.println(browser);
		String IP = request.getRemoteAddr();
		out.println(IP + "\n");
	%>
</body>
</html>