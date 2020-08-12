package restaurante;

public class TesteRestaurante {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido("Anakin", "Moqueca de Jaca", 40);	
		
		pedido.fazPedido();
		pedido.entregaPedido();
		pedido.calculaTotal();
		
		System.out.printf("%s pediu %s no valor de R$%.1f\nO pedido esta pendente? %s", pedido.getCliente(), pedido.getUltimoPedido(), pedido.getValorTotal(), pedido.isPedidoPendente());
	}
}
