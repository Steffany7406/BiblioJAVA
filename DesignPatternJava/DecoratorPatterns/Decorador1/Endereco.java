/* Esse código implementa o padrão de projeto Decorador que permite adicionar funcionalidades
 * a um objeto de forma dinâmica. 
 * 
 * Através dessa estrutura, podemos facilmente adicionar mais decoradores no futuro se necessário
 * para estender a funcionalidade sem modificar as classes existentes.
 */

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