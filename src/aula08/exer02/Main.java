package aula08.exer02;

import aula08.exer02.impls.AutenticacaoPorBiometria;
import aula08.exer02.impls.AutenticacaoPorEmail;
import aula08.exer02.service.AutenticacaoService;

public class Main {
    public static void main(String[] args) {
        AutenticacaoPorEmail autenticacaoPorEmail = new AutenticacaoPorEmail();
        AutenticacaoPorBiometria autenticacaoPorBiometria = new AutenticacaoPorBiometria();
        AutenticacaoService autenticacaoServiceEmail = new AutenticacaoService(autenticacaoPorEmail);
        AutenticacaoService autenticacaoServiceBiometria = new AutenticacaoService(autenticacaoPorBiometria);

        System.out.println("Autenticação por e-mail:");
        System.out.println(autenticacaoServiceEmail.autenticar("admin1", "123")); // true
        System.out.println(autenticacaoServiceEmail.autenticar("admin1", "789")); // false

        System.out.println("Autenticação por biometria:");
        System.out.println(autenticacaoServiceBiometria.autenticar("admin2", "456")); // true
        System.out.println(autenticacaoServiceBiometria.autenticar("admin2", "123")); // false
    }
}
