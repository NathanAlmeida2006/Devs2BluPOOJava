package aula03.extra.questao02.model;

import aula03.extra.questao02.interfaces.IBateria;

/**
 * Classe que implementa a interface IBateria e representa a bateria de um celular.
 */
public class Bateria implements IBateria {
    private int nivelCarga;
    private boolean carregando;

    /**
     * Construtor que inicializa a bateria com carga completa e não carregando.
     */
    public Bateria() {
        this.nivelCarga = 100;
        this.carregando = false;
    }

    @Override
    public int getNivelCarga() {
        return nivelCarga;
    }

    @Override
    public void consumirCarga() {
        if (nivelCarga > 0) {
            nivelCarga--;
        }
    }

    @Override
    public void carregar() {
        carregando = true;
        nivelCarga = 100;
    }

    @Override
    public void desconectar() {
        carregando = false;
    }

    @Override
    public boolean isCarregando() {
        return carregando;
    }
}
