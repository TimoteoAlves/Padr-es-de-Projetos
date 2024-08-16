public class Client {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();

        // Dados do cliente
        String nome = "João Silva";
        String cpf = "123.456.789-00";

        // Reserva do pacote
        travelFacade.bookPackage(nome, cpf,
                FlightBooking.FlightClass.EXECUTIVA, 5, 'A',
                HotelBooking.RoomType.SUITE_PRESIDENCIAL, 2,
                CarRental.CarType.LUXO,
                Payment.PaymentMethod.CREDITO, 3);
    }
}
