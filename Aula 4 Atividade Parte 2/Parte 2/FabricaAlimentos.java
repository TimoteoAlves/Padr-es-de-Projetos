class FabricaAlimentos implements Fabrica {
    public Produto criarProdutoA() {
        return new Pao();
    }

    public Produto criarProdutoB() {
        return new Sanduiche();
    }

    public Produto criarProdutoC(String tipo) {
        return new ProdutoGenerico(tipo);
    }
}
