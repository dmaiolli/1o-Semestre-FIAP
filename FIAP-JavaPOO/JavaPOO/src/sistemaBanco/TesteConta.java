package sistemaBanco;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteConta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String rua = JOptionPane.showInputDialog("Rua: ");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
		String complemento = JOptionPane.showInputDialog("Complemento: ");
		String bairro = JOptionPane.showInputDialog("Bairro: ");
		int cep = Integer.parseInt(JOptionPane.showInputDialog("CEP: "));
		Endereco endereco = new Endereco(rua, numero, complemento, bairro, cep);
		
		
		String nome = JOptionPane.showInputDialog("Nome: ");
		long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF: "));	
		Cliente cliente = new Cliente(nome, cpf, endereco);
		
		
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
		ContaCorrente contaCorrente = new ContaCorrente(saldo, cliente);
		
		
		System.out.printf("SALDO : %.2f\nNOME: %s\nCPF: %d\nRUA: %s\nNº: %d\nCOMPL.: %s\nBAIRRO: %s\nCEP: %d", contaCorrente.getSaldo(), cliente.getNome(), cliente.getCpf(), endereco.getRua(), endereco.getNumero(), endereco.getComplemento(), endereco.getBairro(), endereco.getCep());
		
		entrada.close();

	}
}
