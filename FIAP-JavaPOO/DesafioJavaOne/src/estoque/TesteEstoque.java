package estoque;

public class TesteEstoque {
	
	public static void main(String[] args) {
		Produto produto = new Produto("LightSaber", 5, 0, 0, 2400);
		
		Venda venda = new Venda(produto, 2, 4800);
		
		System.out.printf("Existem %d %s com valor unitário de %.2f\nFoi realizado uma venda de %d %s em um valor total de %.2f", produto.getQuantidadeAtual(), produto.getDescricao(), produto.getPrecoVenda(), venda.getQuantidade(), venda.getProduto().getDescricao(), venda.getValorVenda());
	}

}
