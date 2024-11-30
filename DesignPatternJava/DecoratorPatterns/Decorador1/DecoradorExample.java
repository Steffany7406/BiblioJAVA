/*Decorador Estrutural Simples 

public class Decorator_1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1 Casa 94", "Cidade Alegria", "Resende", "RJ", "27486-909");
        EnderecadorSimples enderecador = new EnderecadorSimples();
        EnderecadorCaixaAlta enderecadorCaixaAlta = new EnderecadorCaixaAlta(enderecador);
        
        String enderecoFormatado = enderecadorCaixaAlta.prepararEndereco(endereco);
        System.out.println(enderecoFormatado); 
    }
}
// ---------
class Endereco {
    final String logradouro;
    final String bairro;
    final String cidade;
    final String uf;
    final String cep;
    
    public Endereco(String logradouro, String bairro, String cidade, String uf, String cep){
        super();
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
}
//-----------------
class EnderecadorSimples { Uma instância dessa classe é criada para formatar o endereço de maneira simples.

    public String prepararEndereco(Endereco endereco) {
        StringBuilder sb = new StringBuilder();

        sb.append(endereco.logradouro);
        sb.append("\n");
        sb.append(endereco.bairro);
        sb.append("\n");
        sb.append(endereco.cidade);
        sb.append("/");
        sb.append(endereco.uf);
        return sb.toString();
    }
}
// ---------------------
class EnderecadorCaixaAlta {

    EnderecadorSimples enderecador;

    public EnderecadorCaixaAlta(EnderecadorSimples enderecador) {
        super();
        this.enderecador = enderecador;
    } 

    public String prepararEndereco(Endereco endereco) {
        return enderecador.prepararEndereco(endereco).toUpperCase();
    }
}
*/