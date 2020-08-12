package sistemaBanco;

public class ContaCorrente {
	
	private double saldo;
	private Cliente titular;
	
	public ContaCorrente(double saldo, Cliente titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	

}
