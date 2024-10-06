package aula03.extra.questao02.model;

import aula03.extra.questao02.interfaces.IBateria;
import java.util.UUID;

/**
 * Classe que representa um celular com bateria e informações de marca e modelo.
 */
public class Celular {
    private final String id;
    private final IBateria bateria;
    private boolean ligado;
    private final String marca;
    private final String modelo;

    /**
     * Construtor que cria um novo celular.
     *
     * @param marca Marca do celular.
     * @param modelo Modelo do celular.
     * @param bateria Instância de IBateria associada ao celular.
     */
    public Celular(String marca, String modelo, IBateria bateria) {
        this.id = UUID.randomUUID().toString();
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.ligado = false;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getNivelBateria() {
        return bateria.getNivelCarga();
    }

    public boolean isCarregando() {
        return bateria.isCarregando();
    }

    public void ligar() {
        if (bateria.getNivelCarga() > 0) {
            ligado = true;
            bateria.consumirCarga();
        }
    }

    public void desligar() {
        ligado = false;
    }

    public void carregar() {
        bateria.carregar();
    }

    public void desconectarCarregador() {
        bateria.desconectar();
    }
}
