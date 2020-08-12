package br.com.fiap.bank.domain;

public class Cliente {

	private String nome;
	private int documento;
	private String turma;
	
	public Cliente(String nome, int documento) {
		System.out.println("Construtor do cliente invocado");
		this.nome = nome;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int rm) {
		this.documento = rm;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}
