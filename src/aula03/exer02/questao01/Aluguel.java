package aula03.exer02.questao01;

public class Aluguel {
    private Cliente cliente;
    private Endereco endereco;
    private Tema tema;
    private String dataFesta;
    private String horaInicio;
    private String horaTermino;
    private double desconto;
    private double valorCobrado;
    private Pagamento pagamento;

    public Aluguel() {
    }

    public Aluguel(Cliente cliente, Endereco endereco, Tema tema, String dataFesta, String horaInicio, String horaTermino, double desconto, double valorCobrado) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.tema = tema;
        this.dataFesta = dataFesta;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.desconto = desconto;
        this.valorCobrado = valorCobrado;
        this.pagamento = new Pagamento(valorCobrado);
        cliente.adicionarAluguel(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public String getDataFesta() {
        return dataFesta;
    }

    public void setDataFesta(String dataFesta) {
        this.dataFesta = dataFesta;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}