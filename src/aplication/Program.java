package aplication;

import TabuleiroXadrez.Posicao;
import TabuleiroXadrez.Tabuleiro;

public class Program {

    public static void main(String[] args) {
        Posicao posicao = new Posicao(3,4);
        System.out.println(posicao);
        Tabuleiro  tabuleiro = new Tabuleiro(8,8);
    }
}
