import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fabrica fabricaEletronicos = new FabricaEletrodomesticos();
        Fabrica fabricaMoveis = new FabricaMoveis();

        System.out.println("Fábrica De Eletrodomésticos");
        fabricaEletronicos.criarProdutoA().criar();
        fabricaEletronicos.criarProdutoB().criar();

        System.out.println("--------------------------------");
        System.out.println("Fábrica De Movéis");
        fabricaMoveis.criarProdutoA().criar();
        fabricaMoveis.criarProdutoB().criar();

        System.out.println("--------------------------------");
        System.out.println("Digite o nome do novo produto eletrodoméstico que você deseja criar:");
        String tipoProduto = scanner.nextLine();
        System.out.println("--------------------------------");
        Produto novoProdutoEletronico = fabricaEletronicos.criarProdutoC(tipoProduto);
        novoProdutoEletronico.criar();

        System.out.println("--------------------------------");
        System.out.println("Digite o nome do novo produto de móveis que você deseja criar:");
        tipoProduto = scanner.nextLine();
        System.out.println("--------------------------------");
        Produto novoProdutoMoveis = fabricaMoveis.criarProdutoC(tipoProduto);
        novoProdutoMoveis.criar();
    }
}