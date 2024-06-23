public class FabricaDeBancoDeDados {
    public static BancoDeDados getBancoDeDados(String perfilUsuario) {
        switch (perfilUsuario) {
            case "Gratuito":
                return new ParadoxAdapter();
            case "Básico":
                return new FirebirdAdapter();
            case "Ultimate":
                return new MySQLAdapter();
            default:
                throw new IllegalArgumentException("Perfil de usuário desconhecido");
        }
    }
}