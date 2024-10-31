package aula08.questao02;

import aula08.questao02.impls.ServicoEmail;
import aula08.questao02.impls.ServicoPush;
import aula08.questao02.impls.ServicoSMS;

public class Main {
    public static void main(String[] args) {
        System.out.println("Email:");
        ServicoEmail email = new ServicoEmail();
        email.enviar();
        email.configurarEmail();

        System.out.println("\nSMS:");
        ServicoSMS sms = new ServicoSMS();
        sms.enviar();
        sms.configurarSMS();

        System.out.println("\nPush:");
        ServicoPush push = new ServicoPush();
        push.enviar();
        push.configurarPush();
    }
}
