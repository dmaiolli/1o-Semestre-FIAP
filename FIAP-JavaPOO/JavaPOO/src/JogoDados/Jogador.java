package JogoDados;

public class Jogador {
	//ATRIBUTOS
	private String nome;
	private int pontos;
	//CONSTRUTORES
	public Jogador(String nome) {
		this.nome = nome;
		this.pontos = 0;
	}
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	//DEMAIS METODOS
	
	public void marcarPontos(int pontos) {
		this.pontos += pontos;
		//this.pontos = this.pontos + pontos;
	}
	
	public void zerarPontos() {
		this.pontos = 0;
	}
}
