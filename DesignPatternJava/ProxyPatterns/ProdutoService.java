class ProdutoService { // responsável por fornecer serviços relacionados a produtos.

    private ProdutoDAO produtoDAO; // possui uma dependência de ProdutoDAO, que é injetada através do construtor.

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Object buscarProduto(long id) {
        return produtoDAO.find(id); //O método buscarProduto(long id) chama o método find(id) do ProdutoDAO para buscar um produto.
    }

}