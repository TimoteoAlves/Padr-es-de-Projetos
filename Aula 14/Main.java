public class Main {
    public static void main(String[] args) {
        DatabaseProxy proxy = new DatabaseProxy();

        User usuario1 = new SimpleUser(1, "João Silva", "Usuário");
        User usuario2 = new SimpleUser(2, "Maria Oliveira", "Administrador");

        // Adiciona usuários através do Proxy
        proxy.adicionarUsuario(usuario1);
        proxy.adicionarUsuario(usuario2);

        // Recupera usuário através do Proxy
        User usuarioRecuperado = proxy.obterUsuario(1);
        System.out.println("Usuário recuperado: " + usuarioRecuperado.getNome() + " com papel: " + usuarioRecuperado.getPapel());

        // Adiciona comportamento VIP a um usuário
        User usuarioVip = new VIPUserDecorator(usuario1);
        System.out.println("Usuário VIP: " + usuarioVip.getNome() + " com papel: " + usuarioVip.getPapel());
    }
}
