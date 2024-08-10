public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria", "Ouro");
        CaixaAssinatura caixa1 = new CaixaAssinatura(cliente1);
        caixa1.gerarCaixa();
        caixa1.exibirCaixa();

        Cliente cliente2 = new Cliente("João", "Bronze");
        CaixaAssinatura caixa2 = new CaixaAssinatura(cliente2);
        caixa2.gerarCaixa();
        caixa2.exibirCaixa();
    }
}