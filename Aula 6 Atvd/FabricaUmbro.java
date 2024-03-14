class FabricaUmbro implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaEsportiva("Umbro", "Fluminense");
    }
}