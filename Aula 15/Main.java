import java.util.List;

public class Main {
    public static void main(String[] args) {
        StreamFlix streamFlix = new StreamFlix();

        Usuario usuario1 = new Usuario("Alice", List.of("ação", "comédia"));
        Usuario usuario2 = new Usuario("Bob", List.of("terror"));
        Usuario usuario3 = new Usuario("Carlos", List.of("ação", "ficção científica"));
        Usuario usuario4 = new Usuario("Diana", List.of("anime", "comédia"));
        Usuario usuario5 = new Usuario("Eva", List.of("ação", "terror"));

        streamFlix.inscrever(usuario1);
        streamFlix.inscrever(usuario2);
        streamFlix.inscrever(usuario3);
        streamFlix.inscrever(usuario4);
        streamFlix.inscrever(usuario5);

        streamFlix.adicionarConteudo("ação", "Novo filme de ação explosiva!");
        streamFlix.adicionarConteudo("comédia", "Nova série de comédia hilariante!");
        streamFlix.adicionarConteudo("terror", "Novo filme de terror assustador!");
    }
}