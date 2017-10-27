package br.com.compasso.programadebolsas.model;

public class Cartao {
	
	private String nroCartao;
	private String dtValidade;
	private String bandeira;
	private String codigoVerificador;
	private String nomeTitular;
	private String teste;
	
	public Cartao(String nroCartao, String dtValidade, String bandeira, String codigoVerificador, String nomeTitular) {
		super();
		this.nroCartao = nroCartao;
		this.dtValidade = dtValidade;
		this.bandeira = bandeira;
		this.codigoVerificador = codigoVerificador;
		this.nomeTitular = nomeTitular;
	}
	
	public Cartao() {
		super();
	}

	public String getNroCartao() {
		return nroCartao;
	}

	public void setNroCartao(String nroCartao) {
		this.nroCartao = nroCartao;
	}

	public String getDtValidade() {
		return dtValidade;
	}

	public void setDtValidade(String dtValidade) {
		this.dtValidade = dtValidade;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	@Override
	public String toString() {
		return "{"
				+ "\n \"nroCartao\":" +"\""+nroCartao+"\""
				+ ",\n \"dtValidade\":" +"\""+ dtValidade+"\""
				+ ",\n \"bandeira\":" +"\""+ bandeira+"\""
				+ ",\n \"codigoVerificador\":" +"\""+ codigoVerificador+"\""
				+ ",\n \"nomeTitular\":" +"\""+ nomeTitular+"\""
				+ "\n}";
	}
	
}
