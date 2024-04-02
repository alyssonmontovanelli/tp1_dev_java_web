public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Coxinha", 45.98, "Lanche", true);
        Produto produto2 = new Produto("Guaravita", 5.50, "Bebida", false);
        Produto produto3 = new Produto("Hamburguer", 10.00, "Acompanhamento", false);

        Pedido pedido = new Pedido("Alysson");

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        pedido.exibirProdutos();
    }
}