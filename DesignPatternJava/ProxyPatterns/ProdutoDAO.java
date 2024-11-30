/* Esta classe estende ProdutoDAO e atua como um proxy.
    O método find(long id) é sobrescrito para adicionar funcionalidades de logging antes e depois da chamada ao método find da superclasse (ProdutoDAO).
    Isso permite que você veja quando uma busca de produto é iniciada e quando é concluída, sem modificar a lógica de busca real. */

class ProdutoDAO {

    public ProdutoDAO() {
        simulaTempoAlto();
    }

    public Object find(long id) {
        // Busca produto e retorna
        simulaTempoAlto();
        return new Object();
    }

    private void simulaTempoAlto() {
        try {
            // Cria conexão com o banco
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}