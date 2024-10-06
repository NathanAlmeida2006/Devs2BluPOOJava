package aula03.extra.questao03.view;

import aula03.extra.questao03.model.Pedido;

import java.util.List;

/**
 * A classe PedidoView é responsável por exibir informações relacionadas aos pedidos,
 * como seus detalhes e a lista de pedidos.
 */
public class PedidoView {

    /**
     * Exibe os detalhes de um pedido específico no console.
     *
     * @param pedido O pedido cujos detalhes serão exibidos.
     */
    public void mostrarDetalhesPedido(Pedido pedido) {
        System.out.println("\nDetalhes do Pedido:");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Valor Total: R$" + pedido.getValorTotal());
        System.out.println("Endereço: " + pedido.getEndereco());
        System.out.println("Status: " + pedido.getStatus());
    }

    /**
     * Exibe uma lista de pedidos no console, mostrando o ID, nome do cliente
     * e status de cada pedido.
     *
     * @param pedidos A lista de pedidos a ser exibida.
     */
    public void mostrarListaPedidos(List<Pedido> pedidos) {
        System.out.println("\nLista de Pedidos:");
        pedidos.forEach(pedido -> {
            System.out.println("ID: " + pedido.getId() + " | Cliente: " + pedido.getCliente() + " | Status: " + pedido.getStatus());
        });
    }
}
