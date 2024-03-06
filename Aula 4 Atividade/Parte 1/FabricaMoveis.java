class FabricaMoveis implements Fabrica {
    public Produto criarProdutoA() {
        return new Sofa();
    }

    public Produto criarProdutoB() {
        return new Mesa();
    }

    public Produto criarProdutoC(String tipo) {
        return new ProdutoGenerico(tipo);
    }
}