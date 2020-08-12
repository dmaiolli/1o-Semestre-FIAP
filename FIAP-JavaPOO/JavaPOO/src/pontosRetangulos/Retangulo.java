package pontosRetangulos;

public class Retangulo {
	
	private Pontos ponto2;
	private Pontos ponto1;
	
	public Retangulo(Pontos ponto1, Pontos ponto2) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
	}
	
	
	public Pontos getPonto2() {
		return ponto2;
	}


	public void setPonto2(Pontos ponto2) {
		this.ponto2 = ponto2;
	}


	public Pontos getPonto1() {
		return ponto1;
	}


	public void setPonto1(Pontos ponto1) {
		this.ponto1 = ponto1;
	}


	public boolean estaDentro(Pontos ponto) {
		return 
		ponto.getX() >= this.ponto1.getX() &&
		ponto.getX() >= this.ponto2.getX() &&
		ponto.getY() >= this.ponto1.getY() &&
		ponto.getY() >= this.ponto1.getY();
				
	}
	
	public double distanciaExtremidadeMaisProxima(Pontos ponto) {
			double diferencaX = ponto.getX() - this.ponto1.getX();
			double diferencaY = ponto.getY() - this.ponto1.getY();
			
			double xAbsoluto = Math.abs(diferencaX);
			double yAbsoluto = Math.abs(diferencaY);
			
			double quadradoY = Math.pow(xAbsoluto, 2);
			double quadradoX = Math.pow(xAbsoluto, 2);
			
			double soma = quadradoX + quadradoY;
			
			double distanciaPonto1 = Math.sqrt(soma);
			
			
			
			
			diferencaX = ponto.getX() - this.ponto2.getX();
			diferencaY = ponto.getY() - this.ponto2.getY();
			
			xAbsoluto = Math.abs(diferencaX);
			yAbsoluto = Math.abs(diferencaY);
			
			quadradoY = Math.pow(yAbsoluto, 2);
			quadradoX = Math.pow(xAbsoluto, 2);
			
			soma = quadradoX + quadradoY;
			
			double distanciaPonto2 = Math.sqrt(soma);
			
			double resultado = distanciaPonto1 < distanciaPonto2 ? distanciaPonto1 : distanciaPonto2;
			
			return resultado;
	}
	
}
