import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        Scanner scanner = new Scanner(System.in);

        // Captura os dados do cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        // Captura os dados do voo
        System.out.println("Escolha a classe do voo: ");
        System.out.println("1. Econômica");
        System.out.println("2. Executiva");
        System.out.println("3. Primeira Classe");
        int flightClassOption = scanner.nextInt();
        FlightBooking.FlightClass flightClass = FlightBooking.FlightClass.values()[flightClassOption - 1];

        System.out.print("Digite a fileira do assento (1-32): ");
        int row = scanner.nextInt();
        
        System.out.print("Digite a letra do assento (A-F): ");
        char seat = scanner.next().charAt(0);

        // Captura os dados do hotel
        System.out.println("Escolha o tipo de quarto do hotel: ");
        System.out.println("1. Simples");
        System.out.println("2. Executivo");
        System.out.println("3. Suíte Presidencial");
        int roomTypeOption = scanner.nextInt();
        HotelBooking.RoomType roomType = HotelBooking.RoomType.values()[roomTypeOption - 1];

        System.out.print("Digite o número de hóspedes: ");
        int numberOfGuests = scanner.nextInt();

        // Captura os dados do carro
        System.out.println("Escolha o tipo de carro para aluguel: ");
        System.out.println("1. Econômico");
        System.out.println("2. Executivo");
        System.out.println("3. Luxo");
        int carTypeOption = scanner.nextInt();
        CarRental.CarType carType = CarRental.CarType.values()[carTypeOption - 1];

        // Captura os dados do pagamento
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1. Pix (10% de desconto)");
        System.out.println("2. Boleto (5% de desconto)");
        System.out.println("3. Débito (sem desconto)");
        System.out.println("4. Crédito (até 6x com juros)");
        int paymentMethodOption = scanner.nextInt();
        Payment.PaymentMethod paymentMethod = Payment.PaymentMethod.values()[paymentMethodOption - 1];

        int installments = 1;
        if (paymentMethod == Payment.PaymentMethod.CREDITO) {
            System.out.print("Digite o número de parcelas (1-6): ");
            installments = scanner.nextInt();
        }

        // Reserva o pacote
        travelFacade.bookPackage(nome, cpf, flightClass, row, seat,
                roomType, numberOfGuests, carType,
                paymentMethod, installments);

        scanner.close();
    }
}
