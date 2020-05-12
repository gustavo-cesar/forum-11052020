package forum;

import java.util.ArrayList;

public class Pedido {

	private int numero;
	private ArrayList<ItemPedido> itensPedido = new ArrayList<ItemPedido>();

	public int getNumero() {
		return numero;
	}

	public Pedido(int numero) {
		this.numero = numero;
	}

	public void addItens(ItemPedido itemPedido) {
		this.itensPedido.add(itemPedido);
	}

	public ArrayList<ItemPedido> getitensPedido() {
		return itensPedido;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", itensPedido=" + itensPedido + "]";
	}
	
	

}
