public class Main {
    public static void main(String[] args) {
        TransportationFactory busFactory = new BusFactory();
        TransportationFactory subwayFactory = new SubwayFactory();

        TransportationSystem busSystem = new TransportationSystem(busFactory);
        Transport bus = busSystem.criarTransporte();
        bus.gerarRota("A", "B");
        bus.embarcarPassageiros();
        System.out.println("Capacidade do Ônibus: " + bus.capacidade());
        System.out.println("Rota do Ônibus: " + bus.rota());
        System.out.println("Contagem de passageiros atuais: " + bus.contarPassageirosAtuais());

        TransportationSystem subwaySystem = new TransportationSystem(subwayFactory);
        Transport subway = subwaySystem.criarTransporte();
        subway.gerarRota("X", "Y");
        subway.embarcarPassageiros();
        subway.embarcarPassageiros();
        System.out.println("Capacidade do Metrô: " + subway.capacidade());
        System.out.println("Linha do Metrô: " + subway.rota());
        System.out.println("Contagem de Passageiros atuais: " + subway.contarPassageirosAtuais());
    }
}