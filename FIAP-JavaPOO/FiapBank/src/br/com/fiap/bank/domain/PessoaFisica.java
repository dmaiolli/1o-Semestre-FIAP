package br.com.fiap.bank.domain;

public class PessoaFisica extends Cliente {

	private String turma;

	public PessoaFisica(String nome, int documento, String turma) {
		super(nome, documento);
		this.turma = turma;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}
