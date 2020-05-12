package forum;

public class App {

	public static void main(String[] args) {

		Produto Passatempo = new Produto("Passatempo");
		Produto Cerveja = new Produto("Cerveja");
		Produto Chocolate = new Produto("Chocolate");

		ItemPedido itemPassatempo = new ItemPedido(Passatempo, 2, 3.0);
		ItemPedido itemCerveja = new ItemPedido(Cerveja, 12, 32.00);
		ItemPedido itemchocolate = new ItemPedido(Chocolate, 1, 2.00);

		Pedido primeiroPedido = new Pedido(1);
		primeiroPedido.addItens(itemPassatempo);
		primeiroPedido.addItens(itemCerveja);
		primeiroPedido.addItens(itemchocolate);

	
		for (ItemPedido item : primeiroPedido.getitensPedido()) {
			System.out.println(item);
		}
	}

}
