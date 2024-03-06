class OvoDePascoa implements Produto {
    private String nome;
    private String peso;
    private String fabricante;

    public OvoDePascoa(String nome, String peso, String fabricante) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public String getPeso() {
        return peso;
    }

    public String getFabricante() {
        return fabricante;
    }
}
