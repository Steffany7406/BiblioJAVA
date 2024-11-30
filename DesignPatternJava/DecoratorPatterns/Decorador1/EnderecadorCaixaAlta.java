/* O método prepararEndereco do enderecadorCaixaAlta é chamado, 
que formata o endereço e o transforma em letras maiúsculas, 
e o resultado é impresso no console.*/

class EnderecadorCaixaAlta { //Decorador que envolve EnderecadorSimples e adiciona a funcionalidade de transformar o endereço formatado em letras maiúsculas.

    EnderecadorSimples enderecador;

    public EnderecadorCaixaAlta(EnderecadorSimples enderecador) {
        super();
        this.enderecador = enderecador;
    } 

    public String prepararEndereco(Endereco endereco) {
        return enderecador.prepararEndereco(endereco).toUpperCase();
    }
}