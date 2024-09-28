package aula01.exer02.questao01;

import aula01.exer02.questao01.Aluguel;
import aula01.exer02.questao01.Cliente;
import aula01.exer02.questao01.Endereco;
import aula01.exer02.questao01.Tema;

import java.util.Arrays;

public class TesteAluguel {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente();
        cliente.nome = "Rafaela";
        cliente.telefone = "123456789";

        // Criando um endereço
        Endereco endereco = new Endereco();
        endereco.rua = "Rua das Flores";
        endereco.numero = 123;
        endereco.bairro = "Centro";
        endereco.cidade = "Cidade";
        endereco.estado = "Estado";
        endereco.cep = "12345-678";

        // Criando um tema
        Tema tema = new Tema();
        tema.nome = "Cinderela";
        tema.listaItens = Arrays.asList("castelo", "boneca da Cinderela", "bruxa");
        tema.valorAluguel = 500.0;
        tema.corToalha = "azul";

        // Criando um aluguel
        Aluguel aluguel = new Aluguel();
        aluguel.cliente = cliente;
        aluguel.endereco = endereco;
        aluguel.tema = tema;
        aluguel.dataFesta = "01/10/2024";
        aluguel.horaInicio = "18:00";
        aluguel.horaTermino = "22:00";
        aluguel.desconto = 50.0;
        aluguel.valorCobrado = 450.0;

        // Exibindo os detalhes do aluguel
        System.out.println("Cliente: " + aluguel.cliente.nome);
        System.out.println("Telefone: " + aluguel.cliente.telefone);
        System.out.println("Endereço: " + aluguel.endereco.rua + ", " + aluguel.endereco.numero);
        System.out.println("Tema: " + aluguel.tema.nome);
        System.out.println("Itens do Tema: " + aluguel.tema.listaItens);
        System.out.println("Data da Festa: " + aluguel.dataFesta);
        System.out.println("Hora de Início: " + aluguel.horaInicio);
        System.out.println("Hora de Término: " + aluguel.horaTermino);
        System.out.println("Desconto: " + aluguel.desconto);
        System.out.println("Valor Cobrado: " + aluguel.valorCobrado);
    }
}
