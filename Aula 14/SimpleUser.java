public class SimpleUser implements User {
    private int id;
    private String nome;
    private String papel;

    public SimpleUser(int id, String nome, String papel) {
        this.id = id;
        this.nome = nome;
        this.papel = papel;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getPapel() {
        return papel;
    }
}
