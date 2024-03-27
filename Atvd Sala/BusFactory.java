class BusFactory implements TransportationFactory {
    public Transport criarTransporte() {
        return new Bus();
    }
}