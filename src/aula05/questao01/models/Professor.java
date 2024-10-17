package aula05.questao01.models;

import aula04.exerEsquenta.Funcionario;
import aula05.questao01.interfaces.Pesquisador;

public class Professor extends Funcionario implements Pesquisador {
    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Professor";
    }
}

