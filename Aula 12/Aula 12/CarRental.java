public class CarRental {
    public enum CarType {ECONOMICO, EXECUTIVO, LUXO}

    private static final double ECONOMIC_CAR_PRICE = 150.0;

    public double calculatePrice(CarType carType) {
        switch (carType) {
            case EXECUTIVO:
                return ECONOMIC_CAR_PRICE * 2;
            case LUXO:
                return ECONOMIC_CAR_PRICE * 4;
            case ECONOMICO:
            default:
                return ECONOMIC_CAR_PRICE;
        }
    }
}
