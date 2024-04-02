import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private String cliente;
    private int quantidadeProdutos;
    private double valorTotal;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.quantidadeProdutos = 0;
        this.valorTotal = 0.0;
    }

    // Adicionando produto ao pedido
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        quantidadeProdutos++;
        valorTotal += produto.getPreco();
    }

    // Exibir produto no pedido
    public void exibirProdutos() {
        System.out.println("Produtos no pedido de " + cliente + ":");
        for (Produto produto : produtos) {
            System.out.println(produto.exibirInformacoes());
        }
        System.out.println("Quantidade total de produtos: " + quantidadeProdutos);
        System.out.println("Valor total do pedido: R$ " + valorTotal);
    }
}