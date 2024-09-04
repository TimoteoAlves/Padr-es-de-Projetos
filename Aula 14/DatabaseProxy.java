public class DatabaseProxy {
    private Database bancoDeDadosReal;

    public DatabaseProxy() {
        this.bancoDeDadosReal = Database.getInstancia();
    }

    public void adicionarUsuario(User usuario) {
        // Aqui poderia ter lógica de controle de acesso
        System.out.println("Verificando permissões para adicionar usuário.");
        bancoDeDadosReal.adicionarUsuario(usuario);
    }

    public User obterUsuario(int id) {
        // Aqui poderia ter lógica de controle de acesso
        System.out.println("Verificando permissões para recuperar usuário.");
        return bancoDeDadosReal.obterUsuario(id);
    }
}
