package aula01.exer01;

public class Questao01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(123, "João", 1000.0);
        ContaBancaria contaBancaria2 = new ContaBancaria(456, "Maria", 500.0);
        ContaBancaria contaBancaria3 = new ContaBancaria();

        //Conta 1
        contaBancaria1.transferir(contaBancaria2, 100);
        contaBancaria1.depositar(1000);
        contaBancaria1.exibir();

        System.out.println();

        //Conta 2
        contaBancaria2.sacar(300);
        contaBancaria2.exibir();

        System.out.println();

        //Conta 3
        System.out.println();
        contaBancaria3.setTitular("Carlos");
        contaBancaria3.setNumero(156421);
        contaBancaria2.setSaldo(10);
        contaBancaria3.sacar(100);
        contaBancaria3.exibir();
    }

    public static class ContaBancaria {
        private int numero;
        private String titular;
        private double saldo;

        public ContaBancaria() {
        }

        public ContaBancaria(int numero, String titular, double saldo) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }

        public void transferir(ContaBancaria destino, double valor) {
            if (valor <= saldo) {
                this.sacar(valor);
                destino.depositar(valor);
                System.out.println("Transferência de " + valor + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        }

        public void exibir() {
            System.out.println("Número: " + getNumero());
            System.out.println("Titular: " + getTitular());
            System.out.println("Saldo: " + getSaldo());
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }
}
