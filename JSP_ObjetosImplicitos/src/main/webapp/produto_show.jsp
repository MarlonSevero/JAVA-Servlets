<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="br.com.fiap.entities.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Produto p = (Produto) session.getAttribute("produto");
	out.println("Nome do produto: " + p.getNome() + "\n");
	out.println("Valor do produto: " + p.getValor() + "\n");
%>
</body>
</html>