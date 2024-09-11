package DAO;
import java.util.List;

public interface ProdutoDAO {
    void adicionarProduto(Produto produto);
    Produto buscarProduto(int id);
    List<Produto> listarProdutos();
    void atualizarProduto(Produto produto);
    void deletarProduto(int id);
}
