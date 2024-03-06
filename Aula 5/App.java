import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<String, Fabrica> fabricas = new HashMap<>();
        fabricas.put("N", new FabricaNestle());
        fabricas.put("G", new FabricaGaroto());
        fabricas.put("L", new FabricaLacta());
        fabricas.put("H", new FabricaHersheys());
        fabricas.put("F", new FabricaFerreiro());

        Scanner scanner = new Scanner(System.in);
Fabrica fabricaEscolhida = null;

while (true) {
    System.out.println("Escolha uma fábrica de ovos de páscoa:");
    System.out.println("N - Nestle");
    System.out.println("G - Garoto");
    System.out.println("L - Lacta");
    System.out.println("H - Hershey's");
    System.out.println("F - Ferreiro");
    System.out.println("S - Sair");
    System.out.print("Digite uma letra: ");
    String letra = scanner.nextLine().toUpperCase();
    if (letra.equals("S")) {
        break;
    }

    switch (letra) {
        case "N":
            fabricaEscolhida = new FabricaNestle();
            break;
        case "G":
            fabricaEscolhida = new FabricaGaroto();
            break;
        case "L":
            fabricaEscolhida = new FabricaLacta();
            break;
        case "H":
            fabricaEscolhida = new FabricaHersheys();
            break;
        case "F":
            fabricaEscolhida = new FabricaFerreiro();
            break;
        default:
            System.out.println("Letra inválida.");
            continue;
    }

    System.out.println("Produtos disponíveis:");
    fabricaEscolhida.listarProdutos();

    System.out.print("Digite um código de produto: ");
    String codigo = scanner.nextLine().toUpperCase();
    Produto produto = fabricaEscolhida.getProduto(codigo);
    if (produto != null) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Peso: " + produto.getPeso());
        System.out.println("Fabricante: " + produto.getFabricante());
    } else {
        System.out.println("Produto não encontrado.");
    }
}
scanner.close();

    }
}
