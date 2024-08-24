public class StreamingService {
    public static void main(String[] args) {
        // Assinatura básica
        Subscription subscription = new BasicSubscription();

        // Adicionando pacotes diretamente (sem escolhas manuais)
        subscription = new PackageDecorator(subscription, "Assistir em vários dispositivos", 19.99);
        subscription = new PackageDecorator(subscription, "Frete Grátis", 9.99);
        subscription = new PackageDecorator(subscription, "Caixa Surpresa", 29.99);
        subscription = new PackageDecorator(subscription, "Cartão Platinum", 49.99);
        subscription = new PackageDecorator(subscription, "Cash Back", 19.99);

        // Exibindo os detalhes da assinatura
        System.out.println("Descrição da assinatura:");
        System.out.println(subscription.getDescription());
        System.out.println("\nTotal: R$" + subscription.getPrice());
    }
}