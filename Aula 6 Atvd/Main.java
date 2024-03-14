public class Main {
    public static void main(String[] args) {
        
        FabricaEsportiva[] fabricas = {
            new FabricaNike(),
            new FabricaAdidas(),
            new FabricaPuma(),
            new FabricaUmbro(),
            new FabricaKappa()
        };

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Escolha a marca esportiva (Nike, Adidas, Puma, Umbro, Kappa): ");
        String marcaEsportiva = scanner.nextLine().toLowerCase();
        
        FabricaEsportiva fabricaEsportiva = null;
        for (FabricaEsportiva f : fabricas) {
            String nomeFabrica = f.getClass().getSimpleName().substring(7).toLowerCase();
            if (nomeFabrica.equals(marcaEsportiva)) {
                fabricaEsportiva = f;
                break;
            }
        }

        if (fabricaEsportiva != null) {
            CamisaEsportiva camisa = fabricaEsportiva.criarCamisa();
            System.out.println("Você escolheu a marca " + marcaEsportiva + ". Opção disponível: ");
            System.out.println("- " + camisa);
        } else {
            System.out.println("Marca não encontrada.");
        }
    }
}
