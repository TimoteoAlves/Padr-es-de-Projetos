public class Main {
    public static void main(String[] args) {
        String[] perfis = {"Gratuito", "Básico", "Ultimate"};
        
        for (String perfil : perfis) {
            BancoDeDados db = FabricaDeBancoDeDados.getBancoDeDados(perfil);
            db.conectar();
            db.executarConsulta("SELECT * FROM usuarios");
            db.desconectar();
        }
    }
}