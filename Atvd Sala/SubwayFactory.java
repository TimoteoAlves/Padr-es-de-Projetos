class SubwayFactory implements TransportationFactory {
    public Transport criarTransporte() {
        return new Subway();
    }
}