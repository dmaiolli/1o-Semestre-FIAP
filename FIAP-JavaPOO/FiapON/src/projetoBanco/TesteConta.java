package projetoBanco;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.saldo = 50;
		cc.agencia = 633;
		cc.numero = 321;
		
		cc.depositar(1000);
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(25, 1254, 1000);
		poupanca.sacar(50);
		
		System.out.println(poupanca.verificarSaldo());
		

	}

}
