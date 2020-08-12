package listaExercicios06;

import javax.swing.JOptionPane;

public class TesteCliente {

	public static void main(String[] args) {
		
		int cep = Integer.parseInt(JOptionPane.showInputDialog("Informe o CEP: "));
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da residência: "));
		
		Endereco endereco = new Endereco(cep, numero);
		
		int ddd = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu DDD: "));
		int operadora = Integer.parseInt(JOptionPane.showInputDialog("Informe sua operadora: "));
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe seu numero de telefone: "));
		
		Telefone telefone = new Telefone(ddd, operadora, numero);
		 
		String nome = JOptionPane.showInputDialog("Informe seu nome completo: ");
		String email = JOptionPane.showInputDialog("Informe seu email: ");
		
		Cliente cliente = new Cliente(nome, email, telefone, endereco);
		
		JOptionPane.showMessageDialog(null, "O cliente informado é " + cliente.getNome());
		
		
	}
}
