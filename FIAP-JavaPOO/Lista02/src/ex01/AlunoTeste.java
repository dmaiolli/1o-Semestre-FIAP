package ex01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe sua matricula: "));
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");

		Aluno aluno = new Aluno(matricula, nome);
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da prova 1: "));
		aluno.setNota1(nota);
		
		nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da prova 2: "));
		aluno.setNota2(nota);

		double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do trabalho: "));
		aluno.setTrabalho(trabalho);
		
		DecimalFormat formataNota = new DecimalFormat("#0.0");
		
		double media = aluno.media();
		double avFinal = aluno.notaFinal();
		
		String precisaFinal = avFinal == 0 ? "O aluno n�o precisa realizar a avalia��o final" : "O aluno precisa obter " + formataNota.format(avFinal) + "pontos para continuar sua jornada";
		
		
		String resultado = "O aluno" + aluno.getNome() + " ficou com a m�dia " + formataNota.format(media) + "./n" + precisaFinal;
		JOptionPane.showMessageDialog(null, resultado);
	}

}
