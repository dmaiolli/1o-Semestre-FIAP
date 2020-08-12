package JogoDados;

import java.util.Random;

public class JogoDados {

	private int dado1;
	private int dado2;
	private Jogador jogador1;
	private Jogador jogador2;
	private boolean fimJogo;

	public JogoDados(Jogador jogador1, Jogador jogador2) {
		this.dado1 = 0;
		this.dado2 = 0;
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.fimJogo = false;
	}

	public int getDado1() {
		return dado1;
	}

	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public boolean isFimJogo() { // Quando a variavel é booleana, o get se transforma pra is
		return fimJogo;
	}

	public void setFimJogo(boolean fimJogo) {
		this.fimJogo = fimJogo;
	}

	public int atirarDados() {
		return new Random().nextInt(6) + 1;
	}

	public void Joga() {
		this.dado1 = this.atirarDados();
		this.dado2 = this.atirarDados();
	}

	public String verPlacar() {
		return "O" + this.jogador1.getNome() + "tem" + this.jogador1.getPontos() + "pontos.\n" + "O"
				+ this.jogador2.getNome() + "tem" + this.jogador2.getPontos() + "pontos.\n";
	}

	public String vencedor() {
		if (this.dado1 > this.dado2) {
			this.jogador1.marcarPontos(this.dado1);
			return "O" + this.jogador1.getNome() + "foi o vencedor";
		}

		else if (this.dado1 > this.dado2) {
			this.jogador2.marcarPontos(this.dado1);
			return "O" + this.jogador2.getNome() + "foi o vencedor";
		}

		else {
			return "EMPATOU";
		}
	}

	public void reinicia() {
		this.jogador1.zerarPontos();
		this.jogador2.zerarPontos();
	}
}