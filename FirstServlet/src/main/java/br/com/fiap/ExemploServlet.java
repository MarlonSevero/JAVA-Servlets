package br.com.fiap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/botao")
public class ExemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExemploServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");		
		if(login.equals("nome") && senha.equals("senha")) {
			response.sendRedirect("sucesso.html");
		}else {
			response.sendRedirect("falha.html", false);
		}
	}
}
