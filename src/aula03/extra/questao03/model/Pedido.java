package aula03.extra.questao03.model;

/**
 * A classe Pedido representa um pedido realizado por um cliente.
 * Cada pedido contém informações sobre o cliente, valor total,
 * endereço de entrega e o status atual do pedido.
 */
public class Pedido {
    private Long id;
    private String cliente;
    private double valorTotal;
    private String endereco;
    private StatusPedido status;

    /**
     * Construtor da classe Pedido.
     *
     * @param id         O identificador único do pedido.
     * @param cliente    O nome do cliente que realizou o pedido.
     * @param valorTotal O valor total do pedido.
     * @param endereco   O endereço de entrega do pedido.
     */
    public Pedido(Long id, String cliente, double valorTotal, String endereco) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.endereco = endereco;
        this.status = StatusPedido.PENDENTE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}