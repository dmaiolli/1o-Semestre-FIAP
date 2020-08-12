package br.com.fiap.bank.domain;

public class PessoaJuridica extends Cliente {

	private String nomeFantasia;
	
	public PessoaJuridica(String nome, int documento) {
		super(nome, documento);
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	

}
