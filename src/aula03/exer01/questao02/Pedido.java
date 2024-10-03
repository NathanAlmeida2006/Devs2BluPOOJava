package aula03.exer01.questao02;

public class Pedido {
    private Produto produto;
    private int quantidade;

    public Pedido() {
    }

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcular() {
        return produto.getPreco() * quantidade;
    }

    public void exibirPedido() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço total: R$ " + calcular());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
