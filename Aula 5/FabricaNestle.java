import java.util.HashMap;
import java.util.Map;

interface Fabrica {
    void adicionarProduto(String codigo, Produto produto);
    Produto getProduto(String codigo);
}

class FabricaNestle implements Fabrica {
    private Map<String, Produto> produtos;

    public FabricaNestle() {
        produtos = new HashMap<>();
        adicionarProduto("N1", new Alpino());
        adicionarProduto("N2", new Classic());
        adicionarProduto("N3", new KitKat());
        adicionarProduto("N4", new Bis());
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

