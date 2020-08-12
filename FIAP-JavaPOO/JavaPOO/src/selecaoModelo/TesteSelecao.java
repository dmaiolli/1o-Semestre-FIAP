package selecaoModelo;

public class TesteSelecao {
	
	public static void main(String[] args) {
		
		Modelo pessoa1 = new Modelo("Juriscreuda", 80, 1.70);
		Modelo pessoa2 = new Modelo("Jussara", 45, 1.45);
		SelecaoModelo selecaoModelo = new SelecaoModelo(pessoa1, pessoa2);
		
		selecaoModelo.maisAlta();
		selecaoModelo.maisMagra();
		selecaoModelo.menorIMC();
		
		
		System.out.printf("%s foi a ganhadora", selecaoModelo.melhorPerfil().getNome());
	}

}
