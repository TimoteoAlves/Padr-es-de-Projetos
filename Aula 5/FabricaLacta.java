import java.util.HashMap;
import java.util.Map;

interface Fabrica {
    void adicionarProduto(String codigo, Produto produto);
    Produto getProduto(String codigo);
    void listarProdutos();
}

class FabricaLacta implements Fabrica {
    private Map<String, Produto> produtos;

    public FabricaLacta() {
        produtos = new HashMap<>();
        adicionarProduto("L1", new ALeite());
        adicionarProduto("L2", new Oreo());
        adicionarProduto("L3", new SonhoDeValsa());
        adicionarProduto("L4", new OuroBranco());
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

