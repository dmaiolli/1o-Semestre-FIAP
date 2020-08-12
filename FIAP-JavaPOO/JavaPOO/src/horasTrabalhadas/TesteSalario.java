package horasTrabalhadas;

import javax.swing.JOptionPane;

public class TesteSalario {
	
	public static void main(String[] args) {
		
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora trabalhada: "));
		
		Salario salario = new Salario(valorHora);
		
		double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe a qtd de horas trabalhadas: "));
		salario.setHorasTrabalhadas(horasTrabalhadas);
		
		JOptionPane.showMessageDialog(null, "Seu salario será de R$ " + salario.calculaSalario());
	}

}
