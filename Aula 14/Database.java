import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instancia;
    private List<User> usuarios;

    private Database() {
        usuarios = new ArrayList<>();
    }

    public static Database getInstancia() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }

    public void adicionarUsuario(User usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário adicionado: " + usuario.getNome());
    }

    public User obterUsuario(int id) {
        for (User usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
