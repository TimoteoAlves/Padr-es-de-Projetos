package DAO;
public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAOImpl();

        Produto produto1 = new Produto(1, "Laptop", 2500.00);
        Produto produto2 = new Produto(2, "Smartphone", 1500.00);

        // Adicionando produtos
        produtoDAO.adicionarProduto(produto1);
        produtoDAO.adicionarProduto(produto2);

        // Listando produtos
        System.out.println("Produtos cadastrados:");
        for (Produto p : produtoDAO.listarProdutos()) {
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }
    }
}
