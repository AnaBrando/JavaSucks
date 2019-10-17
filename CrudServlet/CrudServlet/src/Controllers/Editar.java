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
@WebServlet("/Editar")
public class Editar extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BancoDeDados banco = new BancoDeDados();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Edição</h1>");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		Pizza e=banco.busca(id);
		
		out.print("<form action='Editar2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>Codigo:</td><td><input type='text' name='codigo' value='"+e.getId()+"'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='nome' value='"+e.getNome()+"'/></td></tr>");
		out.print("<tr><td>Vendedor:</td><td><input type='text' name='vendedor' value='"+e.getVendedor()+"'/></td></tr>");
		out.print("<tr><td>Descricao:</td><td><input type='text' name='descricao' value='"+e.getDescricao()+"'/></td></tr>");
		out.print("<tr><td>Loja:</td><td><input type='text' name='loja' value='"+e.getLoja()+"'/></td></tr>");
		out.print("<tr><td>Feedback:</td><td><input type='text' name='feedback' value='"+e.getFeedback()+"'/></td></tr>");
		out.print("<tr><td>Vendido:</td><td><input type='text' name='vendido' value='"+e.isVendido()+"'/></td></tr>");
		out.print("<tr><td>Preco:</td><td><input type='text' name='preco' value='"+e.getPreco()+"'/></td></tr>");
		out.print("<tr><td>Tamanho:</td><td>");
		out.print("<select name='tamanho' style='width:150px'>");
		out.print("<option>P</option>");
		out.print("<option>M</option>");
		out.print("<option>G</option>");
		out.print("<option>GG</option>");
		out.print("</select>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");
			
		
		out.close();
	}
}
