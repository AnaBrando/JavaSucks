

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		BancoDeDados banco = new BancoDeDados();
		/*(nome,vendedor,descricao,loja,feedback,vendido,preco) */
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String name=request.getParameter("name");
		String vendedor=request.getParameter("vendedor");
		String descricao=request.getParameter("descricao");
		String loja=request.getParameter("loja");
		String feedback=request.getParameter("feedback");
		boolean vendido=Boolean.parseBoolean(request.getParameter("vendido"));
		double preco=Double.parseDouble(request.getParameter("preco"));
		
		
		Pizza e=new Pizza();
		e.setName(name);
		e.setVendedor(vendedor);
		e.setDescricao(descricao);
		e.setLoja(loja);
		e.setFeedback(feedback);
		e.isVendido();
		e.setPreco(preco);
		
		banco.adiciona(e);
		
		
	}

}
