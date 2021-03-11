package Xadrez;

import TabuleiroXadrez.Peca;
import TabuleiroXadrez.Tabuleiro;

public class PecaXadrez extends Peca {
    public Cor cor;

    public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
