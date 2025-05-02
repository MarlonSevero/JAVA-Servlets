package br.com.fiap.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/ServletAddProduto")
public class ServletAddProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletAddProduto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome"); //pega o parametro nome da requisicao e armazena na variavel
		String quantidade = request.getParameter("quantidade");
		String valor = request.getParameter("valor");
		
		HttpSession sessao = request.getSession(); //getSession retorna um objeto do tipo HttpSession (armazenando a sessao)
		sessao.setAttribute("produto",  nome + ";" + quantidade + ";" + valor  ); //armazenando um novo atributo chamado 'produto' na sessao. 
																																 //Estamos armazenando todas info do produto em um unico atributo.
		
		response.sendRedirect("sucesso.html"); //redirecionamento para um pagina estatica
	}
}