public class UsuarioController {
    private Usuario model;
    private UsuarioView view;

    public UsuarioController(Usuario model, UsuarioView view) {
        this.model = model;
        this.view = view;
    }

    public void atualizarUsuario() {
        String nome = view.getInput("Digite o nome do usuário:");
        String email = view.getInput("Digite o email do usuário:");
        model.setNome(nome);
        model.setEmail(email);
    }

    public void mostrarUsuario() {
        view.displayUsuarioInfo(model.getNome(), model.getEmail());
    }
}
