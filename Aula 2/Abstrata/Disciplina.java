package Abstrata;

import java.util.ArrayList;
import java.util.List;

abstract class Disciplina {
    protected List<String> alunos;

    public Disciplina() {
        this.alunos = new ArrayList<>();
    }

    public abstract void adicionarAluno(String aluno);

    public abstract void removerAluno(String aluno);

    public void listarAlunos() {
        System.out.println("Alunos matriculados na disciplina:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

class DisciplinaImpl extends Disciplina {
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
}
