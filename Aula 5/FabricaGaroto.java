import java.util.HashMap;
import java.util.Map;


interface Fabrica {
    void adicionarProduto(String codigo, Produto produto);
    Produto getProduto(String codigo);
}


class FabricaGaroto implements Fabrica {
    private Map<String, Produto> produtos;

    public FabricaGaroto() {
        produtos = new HashMap<>();
        adicionarProduto("G1", new Crocante());
        adicionarProduto("G2", new Talento());
        adicionarProduto("G3", new BatonAoLeite());
        adicionarProduto("G4", new Caribe());
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