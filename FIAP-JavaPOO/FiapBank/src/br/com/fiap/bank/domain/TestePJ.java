package br.com.fiap.bank.domain;

public class TestePJ {
	
	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica("Chispirito", 1234);
		System.out.println(pj.getNome());
		
		PessoaFisica pf = new PessoaFisica("Chapolin", 3214, "1TDSR");
		System.out.println(pf.getDocumento());
		
		Cliente clientePj = new PessoaJuridica("Chica", 789);
		System.out.println(clientePj.getNome());
		System.out.println(clientePj.getDocumento());

		Cliente clientePf = new PessoaFisica("Madruga", 789, "1TDSR");
		System.out.println(clientePf.getNome());
		System.out.println(clientePf.getDocumento());
		System.out.println(clientePf.getTurma());
		
	}

}
