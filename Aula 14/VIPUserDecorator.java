public class VIPUserDecorator extends UserDecorator {
    public VIPUserDecorator(User usuarioDecorado) {
        super(usuarioDecorado);
    }

    @Override
    public String getPapel() {
        return usuarioDecorado.getPapel() + " (VIP)";
    }

    public void adicionarPermissao(String permissao) {
        System.out.println("Adicionando permissão: " + permissao);
        // Adicionar lógica para gerenciar permissões
    }
}
