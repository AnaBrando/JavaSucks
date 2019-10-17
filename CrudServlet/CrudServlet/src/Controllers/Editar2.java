package Controllers;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Infra.BancoDeDados;
import Model.Pizza;
@WebServlet("/Editar2")
public class Editar2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		BancoDeDados banco = new BancoDeDados();
		String id=request.getParameter("codigo");
		
	
		Pizza e=banco.busca(Integer.parseInt(id));
		PrintWriter out=response.getWriter();
		/*(nome,vendedor,descricao,loja,feedback,vendido,preco) */
		String name=request.getParameter("name");
		String vendedor=request.getParameter("vendedor");
		String descricao=request.getParameter("descricao");
		String loja=request.getParameter("loja");
		String feedback=request.getParameter("feedback");
		boolean vendido=Boolean.parseBoolean(request.getParameter("vendido"));
		double preco=Double.parseDouble(request.getParameter("preco"));
		
	
		e.setName(name);
		e.setVendedor(vendedor);
		e.setDescricao(descricao);
		e.setLoja(loja);
		e.setFeedback(feedback);
		e.isVendido();
		e.setPreco(preco);
		
		out.print("<a href=\"ViewServlet\">Pizzas</a>");
		
		
	}

}
