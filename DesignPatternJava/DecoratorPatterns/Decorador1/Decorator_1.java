/*  Atributo enderecador = objeto da classe EnderecadorSimples, que será decorado.
    Construtor = recebe um EnderecadorSimples e o armazena no atributo enderecador.
    Método (prepararEndereco) = chama o método (prepararEndereco) do (EnderecadorSimples) e transforma o resultado em letras maiúsculas usando o método (toUpperCase()). 
    Adicionando a funcionalidade de formatação em caixa alta ao resultado original. */

public class Decorator_1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1 Casa 94", "Cidade Alegria", "Resende", "RJ", "27486-909");
        EnderecadorSimples enderecador = new EnderecadorSimples();
        EnderecadorCaixaAlta enderecadorCaixaAlta = new EnderecadorCaixaAlta(enderecador);
        
        String enderecoFormatado = enderecadorCaixaAlta.prepararEndereco(endereco);
        System.out.println(enderecoFormatado); 
    }
}