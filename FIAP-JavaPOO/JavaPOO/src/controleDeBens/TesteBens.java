package controleDeBens;

public class TesteBens {
	
	public static void main(String[] args) {
		
		Imovel imovel = new Imovel(25, "Travessa airton senna", 300000, false);
		Veiculo veiculo = new Veiculo("Ford", "3cv", 4, true);
		PessoaFisica pessoaFisica = new PessoaFisica("Denys", 352668108, veiculo, imovel);
		
		System.out.printf("%s tem um imovel com o tamanho de %dm2, na rua %s, no valor de R$%.2f, residencial? %s\nCPF: %d tem um veiculo %s, capacidade de motor %s, %d portas, Zero? %s", pessoaFisica.getNome(), imovel.getTamanho(), imovel.getEndereco(), imovel.getValor(), imovel.isResidencial(), pessoaFisica.getCpf(), veiculo.getModelo(), veiculo.getMotor(), veiculo.getQtDePortas(), veiculo.isZero());
	}

}
