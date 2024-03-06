class FabricaEletrodomesticos implements Fabrica {
    public Produto criarProdutoA() {
        return new Televisao();
    }

    public Produto criarProdutoB() {
        return new Geladeira();
    }

    public Produto criarProdutoC(String tipo) {
        return new ProdutoGenerico(tipo);
    }
}