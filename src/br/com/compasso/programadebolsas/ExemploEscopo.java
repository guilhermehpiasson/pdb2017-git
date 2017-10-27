package br.com.compasso.programadebolsas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exemploEscopo")
public class ExemploEscopo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExemploEscopo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   request.setAttribute("valor", "Valor setado no Escopo de Request");
	   request.getSession().setAttribute("valor", "Valor setado no Escopo de Session");
	   getServletContext().setAttribute("valor", "Valor setado no Escopo de Context");

	   Object valorRequest = request.getAttribute("valor");
	   Object valorSession = request.getSession().getAttribute("valor");
	   Object valorApplication = getServletContext().getAttribute("valor");
//	   Object valorApplication = getServletContext().getAttribute("valor");
		
	   response.getWriter().append("Request: ").append(valorRequest.toString());
	   response.getWriter().append("\nSession: ").append(valorSession.toString());
	   response.getWriter().append("\nContext: ").append(valorApplication.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
