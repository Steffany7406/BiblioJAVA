/*Após a busca, o LogProdutoDAO imprime outra mensagem de log informando que a busca foi concluída. */

class LogProdutoDAO extends ProdutoDAO { //método find(long id) é sobrescrito para adicionar funcionalidades de logging antes 
                                        //e depois da chamada ao método find da superclasse (ProdutoDAO).
    @Override
    public Object find(long id) {
        System.out.println("Buscando produto com id " + id);
        Object find = super.find(id);
        System.out.println("Buscando produto com id " + id);
        return find;
    } 
}

