package aula08.exer02.service;

import aula08.exer02.interfaces.Autenticacao;

public class AutenticacaoService {
    private final Autenticacao autenticacao;

    public AutenticacaoService(Autenticacao autenticacao) {
        this.autenticacao = autenticacao;
    }

    public boolean autenticar(String usuario, String senha) {
        return autenticacao.autenticar(usuario, senha);
    }
}