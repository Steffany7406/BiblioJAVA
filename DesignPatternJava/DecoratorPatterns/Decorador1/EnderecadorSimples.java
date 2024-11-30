/*(prepararEndereco) = Este método recebe um objeto Endereco e formata suas informações em uma string. 
Ele utiliza StringBuilder para construir a string formatada, 
adicionando quebras de linha entre os campos (logradouro, bairro, cidade/UF). */

class EnderecadorSimples { //instância criada para formatar o endereço de maneira simples.

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

