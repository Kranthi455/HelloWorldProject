package Com.Sathya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kranthi")
public class HelloworldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
//		writer.println("<Body bgcolor="+"aqua>");
		writer.println("<h1><BACK COLOR=" + "RED>" + "I Am KranthiKumar</h1>");
		writer.println("<h2><FONT COLOR=" + "BLUE>" + "Sathya Technology</h2>");
		writer.println("<h3><FONT COLOR=" + "GREEN" + "This is Advanc java Class<h3> ");
//		writer.println("</Body>");
		writer.println("</html>");

	}

}
