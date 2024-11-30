/*   GoF - Design Patterns Strategy
Author:  R. Pascual
Ideia: Trabalhando com Strategy para evitar excesso de if/else e herança 

Conceitos:
- Dados
- Instância
- Instância por Interface 

*/
import java.math.BigDecimal;

public class Strategy_1 {
    //Estratégia - Interface, Concreta
    //Contexto
    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("10");
        Compra compra = new Compra(valor);

        compra.processarCompra(new PagamentoCartaoCredito());
        compra.processarCompra(new PagamentoCartaoDebito());

    }
}
// -------------------------------
class Compra { //Contexto - classe que contém a estratégia que será utilizada.
    BigDecimal valor;

    public Compra(BigDecimal valor){
        this.valor = valor;
    }

    void processarCompra(EstrategiaPagamento estrategiaPagamento) {
        estrategiaPagamento.pagar(valor);
    }
}
//PagamentoStrategy - Interface que representa estrategia de pagamento.
interface EstrategiaPagamento { //Estratégia - Interface
    void pagar(BigDecimal valor);
}
// -------------------------------------
//Estratégia - Concreta 
class PagamentoCartaoCredito implements EstrategiaPagamento { 

    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagamento realizado com cartão de crédito no valor de R$"+ valor);
    }
}
class PagamentoCartaoDebito implements EstrategiaPagamento {

    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagamento realizado com cartão de débito no valor de R$"+ valor);
    }
}