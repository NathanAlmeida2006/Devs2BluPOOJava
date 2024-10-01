package aula02.questao01;

import java.util.Arrays;

public class TesteAluguel {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Rafaela");
        cliente.setTelefone("123456789");

        // Criando um endereço
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setNumero(123);
        endereco.setBairro("Centro");
        endereco.setCidade("Cidade");
        endereco.setEstado("Estado");
        endereco.setCep("12345-678");

        // Criando um tema
        Tema tema = new Tema();
        tema.setNome("Cinderela");
        tema.setListaItens(Arrays.asList("castelo", "boneca da Cinderela", "bruxa"));
        tema.setValorAluguel(500.0);
        tema.setCorToalha("azul");

        // Criando um aluguel
        Aluguel aluguel = new Aluguel();
        aluguel.setCliente(cliente);
        aluguel.setEndereco(endereco);
        aluguel.setTema(tema);
        aluguel.setDataFesta("01/10/2024");
        aluguel.setHoraInicio("18:00");
        aluguel.setHoraTermino("22:00");
        aluguel.setDesconto(50.0);
        aluguel.setValorCobrado(450.0);

        // Exibindo os detalhes do aluguel
        System.out.println("Cliente: " + aluguel.getCliente().getNome());
        System.out.println("Telefone: " + aluguel.getCliente().getTelefone());
        System.out.println("Endereço: " + aluguel.getEndereco().getRua() + ", " + aluguel.getEndereco().getNumero());
        System.out.println("Tema: " + aluguel.getTema().getNome());
        System.out.println("Itens do Tema: " + aluguel.getTema().getListaItens());
        System.out.println("Data da Festa: " + aluguel.getDataFesta());
        System.out.println("Hora de Início: " + aluguel.getHoraInicio());
        System.out.println("Hora de Término: " + aluguel.getHoraTermino());
        System.out.println("Desconto: " + aluguel.getDesconto());
        System.out.println("Valor Cobrado: " + aluguel.getValorCobrado());
    }
}
