package aula03.extra.questao03.service;

import aula03.extra.questao03.interfaces.EnvioService;
import aula03.extra.questao03.model.Pedido;

/**
 * Implementação do serviço de envio de pedidos.
 * Esta classe é responsável por realizar o envio de pedidos
 * ao endereço especificado.
 */
public class EnvioServiceImpl implements EnvioService {
    /**
     * Envia o pedido para o endereço do cliente.
     *
     * @param pedido O pedido a ser enviado.
     */
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado para: " + pedido.getEndereco());
    }
}
