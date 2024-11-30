class OProduto {
    public String nome;
    public double preco;
    public String categoria;
    private double quantidade; // Adicionando o atributo quantidade

    // Corrigindo o nome do construtor
    public OProduto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    // Método para obter a quantidade
    public double getQuantidade() {
        return quantidade;
    }
}

public class UsandoPOO {
    public static void main(String[] args) {
        OProduto produto = new OProduto("Coca-Cola", 5.99, "Bebida");

        // Definindo a quantidade
        produto.setQuantidade(245);

        System.out.println("\nNome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade()); // Agora imprimindo a quantidade corretamente
    }
}