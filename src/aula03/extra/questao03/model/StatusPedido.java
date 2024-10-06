package aula03.extra.questao03.model;

/**
 * Enumeração que representa os possíveis status de um Pedido.
 * <ul>
 *     <li>PENDENTE: O pedido ainda não foi enviado.</li>
 *     <li>ENVIADO: O pedido foi enviado para o cliente.</li>
 *     <li>ENTREGUE: O pedido foi entregue ao cliente.</li>
 * </ul>
 */
public enum StatusPedido {
    PENDENTE, ENVIADO, ENTREGUE
}