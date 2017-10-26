package br.com.compasso.programadebolsas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contador")
public class ExemploInstancia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int contador = 0; 
       
    public ExemploInstancia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contador++; 

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("Contador agora é " + contador);
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
