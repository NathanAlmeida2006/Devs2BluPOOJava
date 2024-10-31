package aula08.questao02.impls;

import aula08.questao02.interfaces.NotificacaoEmail;

public class ServicoEmail implements NotificacaoEmail {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por e-mail.");
    }

    @Override
    public void configurarEmail() {
        System.out.println("Configurando serviço de e-mail.");
    }
}