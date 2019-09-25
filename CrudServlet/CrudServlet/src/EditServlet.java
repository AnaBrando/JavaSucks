

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Update Employee</h1>");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		Pizza e=PizzaDao.getPizzaId(id);
		
		out.print("<form action='EditServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getNome()+"'/></td></tr>");
		out.print("<tr><td>Vendedor:</td><td><input type='password' name='password' value='"+e.getVendedor()+"'/></td></tr>");
		out.print("<tr><td>Descricao:</td><td><input type='email' name='email' value='"+e.getDescricao()+"'/></td></tr>");
		out.print("<tr><td>Loja:</td><td><input type='email' name='email' value='"+e.getLoja()+"'/></td></tr>");
		out.print("<tr><td>Feedback:</td><td><input type='email' name='email' value='"+e.getFeedback()+"'/></td></tr>");
		out.print("<tr><td>Vendido:</td><td><input type='email' name='email' value='"+e.isVendido()+"'/></td></tr>");
		out.print("<tr><td>Preco:</td><td><input type='email' name='email' value='"+e.getPreco()+"'/></td></tr>");
		out.print("<tr><td>Loja:</td><td>");
		out.print("<select name='country' style='width:150px'>");
		out.print("<option>India</option>");
		out.print("<option>USA</option>");
		out.print("<option>UK</option>");
		out.print("<option>Other</option>");
		out.print("</select>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		
		out.close();
	}
}
