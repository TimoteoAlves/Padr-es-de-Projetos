import java.util.HashMap;
import java.util.Map;

interface Fabrica {
    void adicionarProduto(String codigo, Produto produto);
    Produto getProduto(String codigo);
}

class FabricaHersheys implements Fabrica {
    private Map<String, Produto> produtos;

    public FabricaHersheys() {
        produtos = new HashMap<>();
        adicionarProduto("H1", new Hersheys137());
        adicionarProduto("H2", new Hersheys225());
        adicionarProduto("H3", new Hersheys336());
    }

    public void adicionarProduto(String codigo, Produto produto) {
        produtos.put(codigo, produto);
    }

    public Produto getProduto(String codigo) {
        return produtos.get(codigo);
    }
    public void listarProdutos() {
        for (Map.Entry<String, Produto> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}

