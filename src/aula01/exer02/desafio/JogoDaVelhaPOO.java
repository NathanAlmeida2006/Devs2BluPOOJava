package aula01.exer02.desafio;

import java.util.Scanner;

public class JogoDaVelhaPOO {
    public static void main(String[] args) {
        Jogar jogo = new Jogar();

        while (!jogo.ganhou) {
            jogo.imprimirTabuleiro();
            jogo.verificarJogador();
            jogo.setarLinha();
            jogo.setarColuna();
            jogo.verificarPosicaoValida();
            jogo.verificarGanhadorExistente();
        }
    }

    public static class Jogar {
        Scanner sc = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];
        int jogada = 1;
        boolean ganhou = false;
        char sinal;
        int linha = 0;
        int coluna = 0;

        public Jogar() {
        }

        public Jogar(Scanner sc, char[][] jogoVelha, int jogada, boolean ganhou, char sinal, int linha, int coluna) {
            this.sc = sc;
            this.jogoVelha = jogoVelha;
            this.jogada = jogada;
            this.ganhou = ganhou;
            this.sinal = sinal;
            this.linha = linha;
            this.coluna = coluna;
        }

        public void imprimirTabuleiro() {
            for (char[] chars : jogoVelha) {
                for (char aChar : chars) {
                    System.out.print(aChar + " | ");
                }
                System.out.println();
            }
        }

        public void verificarJogador() {
            if (jogada % 2 == 1) { // jogador 1
                System.out.println("Vez do Jogador 1. Escolha linha e coluna (1-3)");
                sinal = 'X';
            } else {
                System.out.println("Vez do Jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }
        }

        public void setarLinha() {
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = sc.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }
        }

        public void setarColuna() {
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = sc.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }
        }

        public void verificarPosicaoValida() {
            linha--;
            coluna--;
            System.out.println("linha " + linha + " coluna " + coluna);
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }
        }

        public void verificarGanhadorExistente() {
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) { // diagonal
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) { // diagonal
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
        }
    }
}
