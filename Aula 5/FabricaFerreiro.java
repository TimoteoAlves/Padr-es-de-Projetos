import java.util.HashMap;
import java.util.Map;


interface Fabrica {
    void adicionarProduto(String codigo, Produto produto);
    Produto getProduto(String codigo);
}

class FabricaFerreiro implements Fabrica {
    private Map<String, Produto> produtos;

    public FabricaFerreiro() {
        produtos = new HashMap<>();
        adicionarProduto("F1", new FerreiroRocher137());
        adicionarProduto("F2", new FerreiroRocher255());
        adicionarProduto("F3", new FerreiroRocher366());
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
