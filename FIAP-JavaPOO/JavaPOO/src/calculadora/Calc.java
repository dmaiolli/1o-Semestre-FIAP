package calculadora;

import javax.swing.JOptionPane;

public class Calc {

	public static void main(String[] args) {
		OperadoresAritmeticos calc = new OperadoresAritmeticos();
		
		String operacao = JOptionPane.showInputDialog("Digite: \n* Para multiplicacao \n/ Para divisao \n+ Para soma \n- Para subtracao");
		double a = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
		
		switch(operacao) {
		
		case "*" :
			JOptionPane.showMessageDialog(null, calc.multiplicacao(a, b));
			break;
		case "+" :
			JOptionPane.showMessageDialog(null, calc.soma(a, b));
			break;
		case "-" :
			JOptionPane.showMessageDialog(null, calc.subtracao(a, b));
			break;
		case "/" :
			JOptionPane.showMessageDialog(null, calc.divisao(a, b));
			break;
		}
	}

}
