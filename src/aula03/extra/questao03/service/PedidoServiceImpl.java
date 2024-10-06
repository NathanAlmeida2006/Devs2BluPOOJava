package aula03.extra.questao03.service;

import aula03.extra.questao03.interfaces.EnvioService;
import aula03.extra.questao03.interfaces.NotaFiscalService;
import aula03.extra.questao03.interfaces.PedidoService;
import aula03.extra.questao03.model.Pedido;
import aula03.extra.questao03.repository.PedidoRepository;
import aula03.extra.questao03.model.StatusPedido;

import java.util.List;

/**
 * Implementação do serviço de gerenciamento de pedidos.
 * Esta classe é responsável pela criação, envio, geração de nota fiscal
 * e listagem de pedidos.
 */
public class PedidoServiceImpl implements PedidoService {
    private final PedidoRepository pedidoRepository;
    private final NotaFiscalService notaFiscalService;
    private final EnvioService envioService;

    /**
     * Construtor da classe PedidoServiceImpl.
     *
     * @param pedidoRepository O repositório de pedidos utilizado para persistência.
     * @param notaFiscalService O serviço de geração de notas fiscais.
     * @param envioService O serviço de envio de pedidos.
     */
    public PedidoServiceImpl(PedidoRepository pedidoRepository, NotaFiscalService notaFiscalService, EnvioService envioService) {
        this.pedidoRepository = pedidoRepository;
        this.notaFiscalService = notaFiscalService;
        this.envioService = envioService;
    }

    /**
     * Cria um novo pedido e o salva no repositório.
     *
     * @param pedido O pedido a ser criado.
     * @return O pedido criado.
     */
    @Override
    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.salvar(pedido);
    }

    /**
     * Envia o pedido com o identificador especificado.
     * O status do pedido é atualizado para "ENVIADO" após o envio.
     *
     * @param id O identificador do pedido a ser enviado.
     */
    @Override
    public void enviarPedido(Long id) {
        Pedido pedido = pedidoRepository.buscarPorId(id);
        if (pedido != null) {
            envioService.enviar(pedido);
            pedido.setStatus(StatusPedido.ENVIADO);
            pedidoRepository.salvar(pedido);
        }
    }

    /**
     * Gera a nota fiscal para o pedido com o identificador especificado.
     *
     * @param id O identificador do pedido para o qual será gerada a nota fiscal.
     */
    @Override
    public void gerarNotaFiscal(Long id) {
        Pedido pedido = pedidoRepository.buscarPorId(id);
        if (pedido != null) {
            notaFiscalService.gerar(pedido);
        }
    }

    /**
     * Retorna a lista de todos os pedidos registrados no repositório.
     *
     * @return Uma lista de todos os pedidos.
     */
    @Override
    public List<Pedido> listarPedidos() {
        return pedidoRepository.buscarTodos();
    }
}
