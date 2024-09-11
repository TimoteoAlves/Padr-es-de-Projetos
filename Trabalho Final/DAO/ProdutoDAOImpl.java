package DAO;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Produto buscarProduto(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtos;
    }

    @Override
    public void atualizarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId() == produto.getId()) {
                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());
            }
        }
    }

    @Override
    public void deletarProduto(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }
}
