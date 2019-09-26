

import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		BancoDeDados banco = new BancoDeDados();
		out.println("<a href='index.html'>Add New Employee</a>");
		out.println("<h1>Employees List</h1>");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		List<Pizza> list=banco.getPizza();
		/*(nome,vendedor,descricao,loja,feedback,vendido,preco) */
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Id</th><th>Nome</th><th>Vendedor</th><th>Descricao</th><th>Loja</th><th>Feedback</th><th>Vendido</th><th>Preco</th><th>Edit</th><th>Delete</th><th>Data</th></tr>");
		for(Pizza e:list){
			out.print("<tr><td>"+e.getId()+"</td><td>"+e.getNome()+"</td><td>"+e.getVendedor()+"</td><td>"+e.getDescricao()
			+"</td><td>"+e.getLoja()+"</td><td>"+e.getFeedback()+"</td><td>"+e.isVendido()
			+"</td><td>"+e.getPreco()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td><td><a href='DeleteServlet?id="
			+e.getId()+"'>delete</a></td></tr>"+"<tr><td>"+format.format(e.getDate()));
		}
		out.print("</table>");
		
		out.close();
	}
}
