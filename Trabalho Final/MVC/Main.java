public class Main {
    public static void main(String[] args) {
        Usuario model = new Usuario("Desconhecido", "email@exemplo.com");
        UsuarioView view = new UsuarioView();
        UsuarioController controller = new UsuarioController(model, view);

        // Atualizando dados do usuário
        controller.atualizarUsuario();
        
        // Mostrando informações atualizadas
        controller.mostrarUsuario();
    }
}
