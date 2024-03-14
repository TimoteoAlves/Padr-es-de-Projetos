class FabricaPuma implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaEsportiva("Puma", "Botafogo");
    }
}