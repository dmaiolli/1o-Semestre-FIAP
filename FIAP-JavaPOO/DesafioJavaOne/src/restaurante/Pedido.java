package restaurante;

public class Pedido {

	private String cliente;
	private String ultimoPedido;
	private boolean pedidoPendente;
	private double valorTotal;
	
	public Pedido(String cliente, String ultimoPedido) {
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
	}

	public Pedido(String cliente, String ultimoPedido, double valorTotal) {
		this.cliente = cliente;
		this.ultimoPedido = ultimoPedido;
		this.valorTotal = valorTotal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getUltimoPedido() {
		return ultimoPedido;
	}

	public void setUltimoPedido(String ultimoPedido) {
		this.ultimoPedido = ultimoPedido;
	}

	public boolean isPedidoPendente() {
		return pedidoPendente;
	}

	public void setPedidoPendente(boolean pedidoPendente) {
		this.pedidoPendente = pedidoPendente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void fazPedido() {
		this.cliente = getCliente();
		this.ultimoPedido = getUltimoPedido();
		pedidoPendente = true;
	}

	public boolean entregaPedido() {
		return this.pedidoPendente = false;
	}

	public void calculaTotal() {
		valorTotal = getValorTotal();
	}
}
