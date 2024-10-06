package aula03.extra.questao03;

import aula03.extra.questao03.interfaces.EnvioService;
import aula03.extra.questao03.interfaces.NotaFiscalService;
import aula03.extra.questao03.interfaces.PedidoService;
import aula03.extra.questao03.model.Pedido;
import aula03.extra.questao03.repository.PedidoRepository;
import aula03.extra.questao03.repository.PedidoRepositoryImpl;
import aula03.extra.questao03.service.*;
import aula03.extra.questao03.view.PedidoView;

public class Main {
    public static void main(String[] args) {
        PedidoRepository pedidoRepository = new PedidoRepositoryImpl();
        NotaFiscalService notaFiscalService = new NotaFiscalServiceImpl();
        EnvioService envioService = new EnvioServiceImpl();
        PedidoService pedidoService = new PedidoServiceImpl(pedidoRepository, notaFiscalService, envioService);

        PedidoView pedidoView = new PedidoView();

        Pedido novoPedido1 = new Pedido(1L, "João Silva", 150.00, "Rua ABC, 123");
        pedidoService.criarPedido(novoPedido1);
        pedidoView.mostrarDetalhesPedido(novoPedido1);
        pedidoService.enviarPedido(1L);
        pedidoService.gerarNotaFiscal(1L);

        Pedido novoPedido2 = new Pedido(2L, "Maria Silva", 300, "Rua DEF, 456");
        pedidoService.criarPedido(novoPedido2);
        pedidoView.mostrarDetalhesPedido(novoPedido2);
        pedidoService.enviarPedido(2L);
        pedidoService.gerarNotaFiscal(2L);

        pedidoView.mostrarListaPedidos(pedidoService.listarPedidos());
    }
}
