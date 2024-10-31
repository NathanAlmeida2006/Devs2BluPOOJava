package aula08.questao02.impls;

import aula08.questao02.interfaces.NotificacaoPush;

public class ServicoPush implements NotificacaoPush {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por PUSH.");
    }

    @Override
    public void configurarPush() {
        System.out.println("Configurando serviço por PUSH.");
    }
}
