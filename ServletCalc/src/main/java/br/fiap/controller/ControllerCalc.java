package br.fiap.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculation")
public class ControllerCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllerCalc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result = 0;
		if(request.getParameter("operacao").equals("soma")) {
			result = Integer.parseInt(request.getParameter("valor1") + Integer.parseInt(request.getParameter("valor2")));
		}else if(request.getParameter("operacao").equals("subtracao")){
			result = Integer.parseInt(request.getParameter("valor1")) - Integer.parseInt(request.getParameter("valor2"));
		}else if(request.getParameter("operacao").equals("multiplicacao")){
			result = Integer.parseInt(request.getParameter("valor1")) * Integer.parseInt(request.getParameter("valor2"));
		}else if(request.getParameter("operacao").equals("divisao")){
			result = Integer.parseInt(request.getParameter("valor1")) / Integer.parseInt(request.getParameter("valor2"));
		}
		
		request.setAttribute("resultado", result);
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
	}
}