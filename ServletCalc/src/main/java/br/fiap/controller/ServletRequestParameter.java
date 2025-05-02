package br.fiap.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServletRequestParameter")
public class ServletRequestParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletRequestParameter() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Enumeration<String> h = request.getHeaderNames();
		
		while(h.hasMoreElements()) {
			out.append("Elemento: " + h.nextElement() + "\n");
		}
		out.append(request.getHeader("user-agent") + "\n");
		
		String nome = request.getParameter( "nome");
		
		out.append(nome);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}