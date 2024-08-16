public class FlightBooking {
    public enum FlightClass {ECONOMICA, EXECUTIVA, PRIMEIRA_CLASSE}
    
    private static final double BASE_PRICE = 500.0;

    public double calculatePrice(FlightClass flightClass) {
        switch (flightClass) {
            case EXECUTIVA:
                return BASE_PRICE * 2.5;
            case PRIMEIRA_CLASSE:
                return BASE_PRICE * 2.5 * 1.5;
            case ECONOMICA:
            default:
                return BASE_PRICE;
        }
    }

    public String selectSeat(int row, char seat) {
        // Simula a seleção de assentos
        return row + "" + seat;
    }
}
