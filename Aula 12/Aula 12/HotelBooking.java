public class HotelBooking {
    public enum RoomType {SIMPLES, EXECUTIVO, SUITE_PRESIDENCIAL}

    private static final double SIMPLE_ROOM_PRICE = 200.0;

    public double calculatePrice(RoomType roomType, int numberOfGuests) {
        double pricePerPerson;
        switch (roomType) {
            case EXECUTIVO:
                pricePerPerson = SIMPLE_ROOM_PRICE * 1.5;
                break;
            case SUITE_PRESIDENCIAL:
                pricePerPerson = SIMPLE_ROOM_PRICE * 1.5 * 3;
                break;
            case SIMPLES:
            default:
                pricePerPerson = SIMPLE_ROOM_PRICE;
                break;
        }
        return pricePerPerson * numberOfGuests;
    }
}
