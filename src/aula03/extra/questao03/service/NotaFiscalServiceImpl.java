package aula03.extra.questao03.service;

import aula03.extra.questao03.interfaces.NotaFiscalService;
import aula03.extra.questao03.model.Pedido;

/**
 * Implementação do serviço de geração de nota fiscal.
 * Esta classe é responsável por gerar notas fiscais para
 * os pedidos realizados.
 */
public class NotaFiscalServiceImpl implements NotaFiscalService {
    /**
     * Gera a nota fiscal para o cliente associado ao pedido.
     *
     * @param pedido O pedido para o qual será gerada a nota fiscal.
     */
    @Override
    public void gerar(Pedido pedido) {
        System.out.println("Nota fiscal gerada para o cliente " + pedido.getCliente());
    }
}
