class TransportationSystem {
    private final TransportationFactory factory;

    public TransportationSystem(TransportationFactory factory) {
        this.factory = factory;
    }

    public Transport criarTransporte() {
        return factory.criarTransporte();
    }
}