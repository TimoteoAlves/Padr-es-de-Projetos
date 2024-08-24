class BasicSubscription implements Subscription {
    private final double price = 9.99;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Assinatura Básica";
    }
}