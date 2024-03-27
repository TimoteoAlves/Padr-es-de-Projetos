interface Transport {
    int capacidade();
    String rota();
    void gerarRota(String startPoint, String endPoint);
    void embarcarPassageiros();
    void desembarcarPassageiros();
    int contarPassageirosAtuais();
}