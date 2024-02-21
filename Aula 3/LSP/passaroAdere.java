interface PassaroAdere {
    void comer();
}

interface PassaroVoador extends PassaroAdere {
    void voar();
}

class Pardal implements PassaroVoador {
    public void comer() {
        System.out.println("Estou comendo!");
    }

    public void voar() {
        System.out.println("Estou voando!");
    }
}

class Pinguim implements PassaroAdere {
    public void comer() {
        System.out.println("Estou comendo!");
    }
}
