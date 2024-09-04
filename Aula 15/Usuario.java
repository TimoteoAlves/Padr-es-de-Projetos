import java.util.List;

class Usuario {
    private String nome;
    List<String> generosInteressados;

    public Usuario(String nome, List<String> generosInteressados) {
        this.nome = nome;
        this.generosInteressados = generosInteressados;
    }

    public void atualizar(String genero, String conteudo) {
        if (generosInteressados.contains(genero)) {
            System.out.println(nome + ", um novo " + genero + " foi adicionado: " + conteudo);
        }
    }
}