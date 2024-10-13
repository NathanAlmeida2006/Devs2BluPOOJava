package aula04.exer02;

public class Main {
    public static void main(String[] args) {
        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = new PessoaJuridica("Empresa A", 100000, "12345678000101");
        contribuintes[1] = new PessoaJuridica("Empresa B", 500000, "98765432000102");
        contribuintes[2] = new PessoaJuridica("Empresa C", 1000000, "11223344000103");

        contribuintes[3] = new PessoaFisica("João", 1500, "12345678901");
        contribuintes[4] = new PessoaFisica("Maria", 2500, "98765432109");
        contribuintes[5] = new PessoaFisica("Pedro", 4000, "11122233344");

        for (Contribuinte c : contribuintes) {
            System.out.printf("Nome: %s, Tipo: %s, Imposto: R$ %.2f%n",
                    c.getNome(), c instanceof PessoaFisica ? "Pessoa Física" : "Pessoa Jurídica", c.calcularImposto());
        }
    }
}
