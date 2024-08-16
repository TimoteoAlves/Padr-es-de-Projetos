public class Payment {
    public enum PaymentMethod {PIX, BOLETO, DEBITO, CREDITO}

    public double calculateTotal(double basePrice, PaymentMethod paymentMethod, int installments) {
        double discountOrInterest;
        switch (paymentMethod) {
            case PIX:
                discountOrInterest = 0.9; // 10% de desconto
                break;
            case BOLETO:
                discountOrInterest = 0.95; // 5% de desconto
                break;
            case CREDITO:
                if (installments > 1) {
                    return basePrice * Math.pow(1.0399, installments);
                }
            case DEBITO:
            default:
                discountOrInterest = 1.0; // Sem desconto ou acréscimo
                break;
        }
        return basePrice * discountOrInterest;
    }
}
