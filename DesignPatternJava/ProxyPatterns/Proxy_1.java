public class Proxy_1 { 

    // RealSubject / Implementação
    // Proxy
    
    public static void main(String[] args) { 
//        ProdutoDAO produtoDAO = new ProdutoDAO(); Dentro do main, um objeto ProdutoDAO é instanciado como LogProdutoDAO, que é uma extensão de ProdutoDAO.
        ProdutoDAO produtoDAO = new LogProdutoDAO(); 
        ProdutoService produtoService = new ProdutoService(produtoDAO);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);
    }

}

/*  O padrão Proxy é utilizado para adicionar funcionalidades (logging, neste caso) sem alterar o código da implementação original.
    O ProdutoService delega a responsabilidade de busca ao ProdutoDAO, enquanto o LogProdutoDAO adiciona comportamento adicional ao logar as operações.
    A simulação de tempo de espera (Thread.sleep(1000)) representa a latência típica de operações de banco de dados.
    Esse padrão é muito útil em situações onde você deseja adicionar funcionalidades como controle de acesso, logging, caching, etc., sem modificar a lógica de negócio existente. */