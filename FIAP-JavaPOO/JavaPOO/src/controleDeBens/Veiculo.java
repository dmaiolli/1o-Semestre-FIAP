package controleDeBens;

public class Veiculo {
	
	private String modelo;
	private String motor;
	private int qtDePortas;
	private boolean zero;
	
	public Veiculo(String modelo, String motor, int qtDePortas, boolean zero) {
		this.modelo = modelo;
		this.motor = motor;
		this.qtDePortas = qtDePortas;
		this.zero = zero;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getQtDePortas() {
		return qtDePortas;
	}

	public void setQtDePortas(int qtDePortas) {
		this.qtDePortas = qtDePortas;
	}

	public boolean isZero() {
		return zero;
	}

	public void setZero(boolean zero) {
		this.zero = zero;
	}
	
	

}
