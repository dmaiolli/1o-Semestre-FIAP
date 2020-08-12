package ex01;

public class Aluno {

	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double trabalho;

	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(double notaTrabalho) {
		this.trabalho = notaTrabalho;
	}

	public double media() {
		return ((this.nota1 * 2.5) + (this.nota2 * 2.5) + (this.trabalho * 2.0)) / 7;
	}

	public double notaFinal() {
		double media = this.notaFinal();
		if (media < 6 && media >= 4) {
			return 12 - media;
		} return 0;
	}

}
