package aula08.exer02.impls;

import aula08.exer02.interfaces.Autenticacao;

import java.util.HashMap;
import java.util.Map;

public class AutenticacaoPorBiometria implements Autenticacao {
    private final Map<String, String> biometriasCadastradas;

    public AutenticacaoPorBiometria() {
        this.biometriasCadastradas = new HashMap<>();
        biometriasCadastradas.put("admin2", "456");
    }

    @Override
    public boolean autenticar(String usuario, String biometria) {
        return biometriasCadastradas.containsKey(usuario) && biometriasCadastradas.get(usuario).equals(biometria);
    }
}
