import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class CaixaAssinatura {
    private static final Map<String, Double> itensDisponiveis = new HashMap<>();
    private static final Map<String, Integer> niveis = new HashMap<>();
    
    static {
        itensDisponiveis.put("quadrinhos", 15.00);
        itensDisponiveis.put("chaveiros", 5.00);
        itensDisponiveis.put("bustos", 10.00);
        itensDisponiveis.put("adesivos", 1.00);
        itensDisponiveis.put("posters", 25.00);
        itensDisponiveis.put("camisetas", 25.00);
        itensDisponiveis.put("canetas", 3.00);
        itensDisponiveis.put("miniaturas", 20.00);

        niveis.put("Bronze", 3);
        niveis.put("Prata", 5);
        niveis.put("Ouro", 7);
        niveis.put("Platina", 10);
    }

    private Cliente cliente;
    private List<String> itensNaCaixa;
    private double valorTotal;

    public CaixaAssinatura(Cliente cliente) {
        this.cliente = cliente;
        this.itensNaCaixa = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void gerarCaixa() {
        int numItens = niveis.get(cliente.getNivel());
        Random random = new Random();

        for (int i = 0; i < numItens; i++) {
            List<String> chaves = new ArrayList<>(itensDisponiveis.keySet());
            String item = chaves.get(random.nextInt(chaves.size()));
            itensNaCaixa.add(item);
            valorTotal += itensDisponiveis.get(item);
        }
    }

    public void exibirCaixa() {
        System.out.println("Cliente: " + cliente.getNome() + " - Nível: " + cliente.getNivel());
        System.out.println("Itens na caixa:");
        for (String item : itensNaCaixa) {
            System.out.printf("- %s (R$ %.2f)%n", item, itensDisponiveis.get(item));
        }
        System.out.printf("Valor total da caixa: R$ %.2f%n", valorTotal);
    }
}
