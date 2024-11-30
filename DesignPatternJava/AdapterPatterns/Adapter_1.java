//Padrão Adapter = Wrapper padrão embrulho.

public class Adapter_1 {
    
    public static void main(String[] args) {
        MeuPagamentoCredito credito = new MeuPagamentoCredito();
        credito.debitar(new BigDecimal("100"));
    }
}