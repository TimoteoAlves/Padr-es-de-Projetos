package Abstrata;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new DisciplinaImpl();
        disciplina.adicionarAluno("João");
        disciplina.adicionarAluno("Maria");
        disciplina.listarAlunos();
        disciplina.removerAluno("Maria");
        disciplina.listarAlunos();
    }
}
