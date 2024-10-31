package aula08.exer02.impls;

import aula08.exer02.interfaces.Autenticacao;

import java.util.HashMap;
import java.util.Map;

public class AutenticacaoPorEmail implements Autenticacao {
    private final Map<String, String> usuariosCadastrados;

    public AutenticacaoPorEmail() {
        this.usuariosCadastrados = new HashMap<>();
        usuariosCadastrados.put("admin1", "123");
    }

    @Override
    public boolean autenticar(String usuario, String senha) {
        return usuariosCadastrados.containsKey(usuario) && usuariosCadastrados.get(usuario).equals(senha);
    }
}