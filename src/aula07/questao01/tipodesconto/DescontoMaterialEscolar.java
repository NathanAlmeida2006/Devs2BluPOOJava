package aula07.questao01.tipodesconto;

import aula07.questao01.interfaces.Desconto;
import aula07.questao01.model.Produto;

public class DescontoMaterialEscolar implements Desconto {
    @Override
    public double calcularDesconto(Produto produto) {
        return produto.getPreco() * 0.25;
    }
}
