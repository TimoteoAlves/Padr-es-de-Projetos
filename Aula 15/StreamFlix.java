import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StreamFlix {
    private Map<String, List<Usuario>> observadoresPorGenero;

    public StreamFlix() {
        observadoresPorGenero = new HashMap<>();
    }

    public void inscrever(Usuario usuario) {
        for (String genero : usuario.generosInteressados) {
            observadoresPorGenero
                .computeIfAbsent(genero, k -> new ArrayList<>())
                .add(usuario);
        }
    }

    public void desinscrever(Usuario usuario) {
        for (String genero : usuario.generosInteressados) {
            List<Usuario> usuariosInscritos = observadoresPorGenero.get(genero);
            if (usuariosInscritos != null) {
                usuariosInscritos.remove(usuario);
            }
        }
    }

    public void adicionarConteudo(String genero, String conteudo) {
        System.out.println("Adicionando novo conteúdo: " + conteudo + " no gênero " + genero);
        notificar(genero, conteudo);
    }

    private void notificar(String genero, String conteudo) {
        List<Usuario> usuariosInscritos = observadoresPorGenero.get(genero);
        if (usuariosInscritos != null) {
            for (Usuario usuario : usuariosInscritos) {
                usuario.atualizar(genero, conteudo);
            }
        }
    }
}