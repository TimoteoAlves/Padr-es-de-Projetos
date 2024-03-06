class FabricaDoces implements Fabrica {
    public Produto criarProdutoA() {
        return new Bolo();
    }

    public Produto criarProdutoB() {
        return new Cookie();
    }
    
    public Produto criarProdutoC(String tipo) {
        return new ProdutoGenerico(tipo);
    }
}
