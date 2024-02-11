package Interface;

import java.util.ArrayList;
import java.util.List;

interface Disciplina {
    void adicionarAluno(String aluno);
    void removerAluno(String aluno);
    void listarAlunos();
}

class DisciplinaImpl implements Disciplina {
    private List<String> alunos;

    public DisciplinaImpl() {
        this.alunos = new ArrayList<>();
    }

    @Override
    public void adicionarAluno(String aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println(aluno + " foi matriculado com sucesso!");
        } else {
            System.out.println(aluno + " já está matriculado.");
        }
    }

    @Override
    public void removerAluno(String aluno) {
        if (alunos.remove(aluno)) {
            System.out.println(aluno + " foi desmatriculado com sucesso!");
        } else {
            System.out.println(aluno + " não está matriculado.");
        }
    }

    @Override
    public void listarAlunos() {
        System.out.println("Alunos matriculados na disciplina:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
