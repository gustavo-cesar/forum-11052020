package forum;

public class ItemPedido {
	private double quantidade;
	private double preco;
	private Produto produto;

	public ItemPedido(Produto produto, double quantidade, double preco) {

		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public Produto getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "itemPedido [" + this.produto + ", quantidade=" + this.quantidade + ", preco=" + this.preco ;
	}
	
	

}
