package aula03.extra.questao03.interfaces;

import aula03.extra.questao03.model.Pedido;

/**
 * Interface que define o serviço de envio de pedidos.
 * Implementações desta interface são responsáveis por
 * enviar pedidos ao cliente.
 */
public interface EnvioService {
    /**
     * Envia o pedido especificado.
     *
     * @param pedido O pedido a ser enviado.
     */
    void enviar(Pedido pedido);
}
