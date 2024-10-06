package aula03.extra.questao03.interfaces;

import aula03.extra.questao03.model.Pedido;

/**
 * Interface que define o serviço de geração de nota fiscal.
 * Implementações desta interface são responsáveis por
 * gerar notas fiscais para os pedidos realizados.
 */
public interface NotaFiscalService {
    /**
     * Gera a nota fiscal para o pedido especificado.
     *
     * @param pedido O pedido para o qual será gerada a nota fiscal.
     */
    void gerar(Pedido pedido);
}
