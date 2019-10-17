package Controllers;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Infra.BancoDeDados;
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BancoDeDados banco = new BancoDeDados();
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		banco.removePizza(id);
		response.sendRedirect("ViewServlet");
	}
}
