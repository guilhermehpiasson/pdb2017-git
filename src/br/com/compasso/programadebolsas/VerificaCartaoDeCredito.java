package br.com.compasso.programadebolsas;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.compasso.programadebolsas.model.Cartao;

@WebServlet("/verificaCartaoDeCredito")
public class VerificaCartaoDeCredito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VerificaCartaoDeCredito() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Demanda Patrick 
		// Patrick Swayzs
		Cartao cartaoUsuario = new Cartao();
		cartaoUsuario.setNroCartao(null != request.getParameter("nroCartao") ? request.getParameter("nroCartao") : null);
		cartaoUsuario.setDtValidade(null != request.getParameter("dtValidade") ? request.getParameter("dtValidade") : null);
		cartaoUsuario.setBandeira(null != request.getParameter("bandeira") ? request.getParameter("bandeira") : null);
		cartaoUsuario.setCodigoVerificador(null != request.getParameter("codigoVerificador") ? request.getParameter("codigoVerificador") : null);
		cartaoUsuario.setNomeTitular(null != request.getParameter("nomeTitular") ? request.getParameter("nomeTitular") : null);
		response.getWriter().append(String.valueOf(cartaoUsuario));
		
	}
	
	public Calendar converteDataParaCalendar(String data) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Calendar c = Calendar.getInstance();     
	    c.setTime(sdf.parse(data));
	    return c;
	}
	
}
