public class TravelFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;
    private Payment payment;

    public TravelFacade() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.carRental = new CarRental();
        this.payment = new Payment();
    }

    public void bookPackage(String customerName, String cpf, FlightBooking.FlightClass flightClass, int row, char seat,
                            HotelBooking.RoomType roomType, int numberOfGuests, CarRental.CarType carType,
                            Payment.PaymentMethod paymentMethod, int installments) {

        // Reserva o voo
        String selectedSeat = flightBooking.selectSeat(row, seat);
        double flightPrice = flightBooking.calculatePrice(flightClass);

        // Reserva o hotel
        double hotelPrice = hotelBooking.calculatePrice(roomType, numberOfGuests);

        // Aluguel do carro
        double carPrice = carRental.calculatePrice(carType);

        // Calcula o total
        double totalPrice = flightPrice + hotelPrice + carPrice;
        double finalPrice = payment.calculateTotal(totalPrice, paymentMethod, installments);

        // Imprime os detalhes do pacote
        printReceipt(customerName, cpf, selectedSeat, flightClass, roomType, carType, paymentMethod, finalPrice);
    }

    private void printReceipt(String customerName, String cpf, String selectedSeat, FlightBooking.FlightClass flightClass,
                            HotelBooking.RoomType roomType, CarRental.CarType carType,
                            Payment.PaymentMethod paymentMethod, double finalPrice) {
        System.out.println("----- Recibo da Compra -----");
        System.out.println("Nome: " + customerName);
        System.out.println("CPF: " + cpf);
        System.out.println("Voo: " + flightClass + " - Assento: " + selectedSeat);
        System.out.println("Hotel: " + roomType);
        System.out.println("Carro: " + carType);
        System.out.println("Forma de Pagamento: " + paymentMethod);
        System.out.println("Valor Final: R$ " + finalPrice);
        System.out.println("----------------------------");
    }
}
