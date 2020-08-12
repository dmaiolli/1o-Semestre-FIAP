package financiamento;

public class AppFinanciamento {
	
	public static void main(String[] args) {
		
		Financiamento financiamento = new Financiamento(100, 10, 3);
	
		System.out.printf("Você deve pagar %.2f", financiamento.calculaValorTotalAPagar());
	}

}
