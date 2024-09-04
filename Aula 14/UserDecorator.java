public abstract class UserDecorator implements User {
    protected User usuarioDecorado;

    public UserDecorator(User usuarioDecorado) {
        this.usuarioDecorado = usuarioDecorado;
    }

    @Override
    public int getId() {
        return usuarioDecorado.getId();
    }

    @Override
    public String getNome() {
        return usuarioDecorado.getNome();
    }

    @Override
    public String getPapel() {
        return usuarioDecorado.getPapel();
    }
}
