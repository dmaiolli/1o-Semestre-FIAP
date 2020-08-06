import javax.swing.JOptionPane;

public class InterfaceUsuario {

	public static int recebeNumero(String mensagem) {
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			return numero;
		} catch (NumberFormatException e) {
			System.err.println("Verifique se voc� n�o digitou um texto ao inv�s de um n�mero.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ele executa sempre, com sucesso ou n�o do nosso c�digo");
		}
		return recebeNumero(mensagem);
	}
	
	public static void main(String[] args) {
		System.out.println(recebeNumero("Digite um numero"));
	}
}
