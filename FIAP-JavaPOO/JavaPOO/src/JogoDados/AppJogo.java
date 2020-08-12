package JogoDados;

public class AppJogo {
	
	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador("Allen");
		Jogador jogador2 = new Jogador("Allen");
			
		JogoDados jogo = new JogoDados(jogador1, jogador2);
				
		jogo.Joga();
		System.out.println(jogo.vencedor());
		
		jogo.Joga();
		System.out.println(jogo.vencedor());
		
		jogo.Joga();
		System.out.println(jogo.vencedor());
		
		jogo.verPlacar();
		
		jogo.reinicia();
		
		
	}

}
