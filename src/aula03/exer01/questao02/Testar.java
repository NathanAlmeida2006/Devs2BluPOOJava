package aula03.exer01.questao02;

public class Testar {

    public static void main(String[] args) {
        Produto carne = new Produto("Picanha", 50);
        Produto pao = new Produto();
        pao.setNome("Pão francês");
        pao.setPreco(5);

        Pedido pedido1 = new Pedido();
        pedido1.setProduto(carne);
        pedido1.setQuantidade(2);
        pedido1.exibirPedido();

        Pedido pedido2 = new Pedido(pao, 2);
        pedido2.exibirPedido();
    }
}
