<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="br.com.fiap.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String nome = "";
	if(request.getParameter("nome") != null){ //pegando parametros da requisicao
		nome = request.getParameter("nome");
	}
	
	float valor = 0;
	if(request.getParameter("valor")!= null){
		valor = Float.parseFloat(request.getParameter("valor"));
	}
	
	if((nome != "") && (valor != 0) ){
		Produto p = new Produto(nome, valor);
		session.setAttribute("produto", p); //guardando produto cadastrado na session 
		//poderiamos usar o application 
	}
%>

<jsp:forward page="produto_show.jsp"></jsp:forward>
</body>
</html>