package aula08.questao02.impls;

import aula08.questao02.interfaces.NotificacaoSMS;

public class ServicoSMS implements NotificacaoSMS {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por SMS.");
    }

    @Override
    public void configurarSMS() {
        System.out.println("Configurando serviço de SMS.");
    }
}
