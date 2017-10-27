package br.com.compasso.programadebolsas;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Parametros
 */
@WebServlet(
		name = "Parametros", 
		urlPatterns = { "/initParamExemplo" }, 
		initParams = {
		@WebInitParam(name = "login", value = "valor_login"), 
		@WebInitParam(name = "password", value = "valor_senha") 
		})
public class Parametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String login;
//	private String password;
       
    public Parametros() {
        super();
    }
    
    @Override
	public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	this.login = config.getInitParameter("login");
//    	this.password = config.getInitParameter("password");
    }
	
    //Comentario Diego
	@Override
	public void destroy() {
		super.destroy();
	}
//comentario Djéssica
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		out.println("<h2>Exemplo com InitParam Servlet</h2>");
//		out.println("<br>Valor do parâmetro 1: " + this.login);
//		out.println("<br>Valor do parâmetro 1: " + this.password);
//		out.close();
		
		//response = populaResponseComInitParameter(request, response);
		response = populaResponseComValores(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	public HttpServletResponse populaResponseComValores(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.getWriter().append("Login: ").append(null != request.getParameter("login") ? request.getParameter("login") : login);
		response.getWriter().append("\nSenha: ").append(null != request.getParameter("password") ? request.getParameter("password") : getServletConfig().getInitParameter("password"));
		
		return response;
	}

}
