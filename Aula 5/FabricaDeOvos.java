import java.util.HashMap;
import java.util.Map;

interface Fabrica {
    void adicionarProduto(String codigo, Produto produto);
    Produto getProduto(String codigo);
}

class FabricaDeOvos implements Fabrica {
    private Map<String, Produto> produtos;

    public FabricaDeOvos() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(String codigo, String nome, String peso, String fabricante) {
        produtos.put(codigo, new OvoDePascoa(nome, peso, fabricante));
    }

    public Produto getProduto(String codigo) {
        return produtos.get(codigo);
    }

    @Override
public void adicionarProduto(String codigo, Produto produto) {
    produtos.put(codigo, produto);
}

}
