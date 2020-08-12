package ex03;

public class Voo {

	private int numero;
	private Data data;
	private boolean[] lugaresOcupados;

	public Voo(int numero, Data data) {
		this.numero = numero;
		this.data = data;
		this.lugaresOcupados = new boolean[100];
	}
	public int getNumero() {
		return numero;
	}
	
	public Data getData() {
		return data;
	}
	
	public boolean[] getLugaresOcupados() {
		return lugaresOcupados;
	}
	
	public int proximoLivre() {
		for(int i = 0; i < this.lugaresOcupados.length; i++) {
			if(this.lugaresOcupados[i]) {
				return i + 1;
			} 
		} return -1;
	}
	
	public boolean verifica(int numero) {
		return this.lugaresOcupados[numero - 1];
	}

}
