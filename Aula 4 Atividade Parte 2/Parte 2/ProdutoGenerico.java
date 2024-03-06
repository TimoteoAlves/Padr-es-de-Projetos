class ProdutoGenerico implements Produto {
    private String nome;

    public ProdutoGenerico(String nome) {
        this.nome = nome;
    }

    public void criar() {
        System.out.println(nome + " criado");
    }
}