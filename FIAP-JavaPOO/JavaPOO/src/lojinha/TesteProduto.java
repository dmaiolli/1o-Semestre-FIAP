package lojinha;

import javax.swing.JOptionPane;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		double valorTotal = 0;
		int item = 1;
		
		while (item <= 3) {
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: "));
			double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o desconto: "));
			Produto produto = new Produto(quantidade, preco, desconto);
			valorTotal += produto.calculaTotal();
			
		item++;
		}
		
		JOptionPane.showMessageDialog(null, "O valor total é de R$ " + valorTotal);
	}

}
