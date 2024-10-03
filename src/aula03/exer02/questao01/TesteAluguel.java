package aula03.exer02.questao01;

import java.util.Arrays;

public class TesteAluguel {
    public static void main(String[] args) {
        EmpresaAluguel empresa = new EmpresaAluguel("Festas Felizes Ltda.");

        Cliente cliente = new Cliente("João Silva", "123-456-7890");

        Endereco endereco = new Endereco("Rua das Flores", 123, "Centro", "São Paulo", "SP", "01234-567");

        Tema tema = new Tema("Aniversário Infantil", Arrays.asList("Balões", "Faixa", "Bolo"), 500.0, "Azul");

        tema.adicionarItemDecoracao(new ItemDecoracao("Mesa decorada", 100.0));
        tema.adicionarItemDecoracao(new ItemDecoracao("Painel de fundo", 150.0));

        Aluguel aluguel = new Aluguel(cliente, endereco, tema, "2024-10-15", "14:00", "18:00", 50.0, 450.0);

        empresa.adicionarAluguel(aluguel);

        aluguel.getPagamento().efetuarPagamento();

        System.out.println("Detalhes do Aluguel:");
        System.out.println("Cliente: " + aluguel.getCliente().getNome());
        System.out.println("Tema: " + aluguel.getTema().getNome());
        System.out.println("Data: " + aluguel.getDataFesta());
        System.out.println("Valor: R$" + aluguel.getValorCobrado());
        System.out.println("Status do Pagamento: " + aluguel.getPagamento().getStatus());

        System.out.println("\nHistórico de Aluguéis do Cliente:");
        for (Aluguel a : cliente.getHistoricoAlugueis()) {
            System.out.println("Data: " + a.getDataFesta() + ", Tema: " + a.getTema().getNome());
        }
    }
}