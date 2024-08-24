abstract class SubscriptionDecorator implements Subscription {
    protected Subscription decoratedSubscription;

    public SubscriptionDecorator(Subscription subscription) {
        this.decoratedSubscription = subscription;
    }

    @Override
    public double getPrice() {
        return decoratedSubscription.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedSubscription.getDescription();
    }
}
