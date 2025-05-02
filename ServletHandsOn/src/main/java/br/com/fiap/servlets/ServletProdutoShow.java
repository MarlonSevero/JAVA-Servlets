package br.com.fiap.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletProdutoShow")
public class ServletProdutoShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletProdutoShow() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession(); //Acessando a sessao
		String sProduto = (String) sessao.getAttribute("produto"); //obtendo o atributo 'produto' criado na ServletAddProduto com get
		PrintWriter out = response.getWriter();
		
		if(sProduto != null) {
			String produto[] = sProduto.split(";");
			for(String p : produto) {
				out.append(p + "\n"); //maneira 1 de fazer 
			}
			out.append("NOME DO PRODUTO:" + produto[0] + "\n"); //segunda maneira de fazer
			out.append("QUANTIDADE DO PRODUTO:" + produto[1]+ "\n");
			out.append("VALOR DO PRODUTO:" + produto[2]+ "\n");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
