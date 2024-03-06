public class Cliente {
    public static void main(String[] args) {
        Fabrica fabricaAlimentos = new FabricaAlimentos();
        Fabrica fabricaBebidas = new FabricaBebidas();

        System.out.println("Produtos da fábrica de alimentos:");
        fabricaAlimentos.criarProdutoA().criar();
        fabricaAlimentos.criarProdutoB().criar();
        
        System.out.println("Produtos da fábrica de bebidas:");
        fabricaBebidas.criarProdutoA().criar();
        fabricaBebidas.criarProdutoB().criar();

        System.out.println("---------------------------------------");
        Fabrica fabricaDoces = new FabricaDoces();
        System.out.println("Nova Fábrica criada.");
        System.out.println("Produtos da nova fábrica de doces:");
        fabricaDoces.criarProdutoA().criar();
        fabricaDoces.criarProdutoB().criar();
    }
}