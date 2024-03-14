class FabricaKappa implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaEsportiva("Kappa", "Vasco");
    }
}