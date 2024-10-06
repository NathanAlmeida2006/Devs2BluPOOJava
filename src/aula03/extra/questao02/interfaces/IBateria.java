package aula03.extra.questao02.interfaces;

/**
 * Interface que define as operações para uma bateria.
 */
public interface IBateria {
    /**
     * Retorna o nível atual de carga da bateria.
     *
     * @return Nível de carga.
     */
    int getNivelCarga();

    /**
     * Consome uma unidade de carga da bateria.
     */
    void consumirCarga();

    /**
     * Inicia o processo de carregamento da bateria.
     */
    void carregar();

    /**
     * Desconecta a bateria do carregador.
     */
    void desconectar();

    /**
     * Verifica se a bateria está carregando.
     *
     * @return true se a bateria estiver carregando, false caso contrário.
     */
    boolean isCarregando();
}
