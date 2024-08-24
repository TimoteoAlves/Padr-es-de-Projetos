class PackageDecorator extends SubscriptionDecorator {
    private String packageName;
    private double packagePrice;

    public PackageDecorator(Subscription subscription, String packageName, double packagePrice) {
        super(subscription);
        this.packageName = packageName;
        this.packagePrice = packagePrice;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + packagePrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n" + packageName + ": R$" + packagePrice;
    }
}