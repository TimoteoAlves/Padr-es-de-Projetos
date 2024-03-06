class FabricaBebidas implements Fabrica {
    public Produto criarProdutoA() {
        return new Suco();
    }

    public Produto criarProdutoB() {
        return new Refrigerante();
    }

    public Produto criarProdutoC(String tipo) {
        return new ProdutoGenerico(tipo);
    }
}
