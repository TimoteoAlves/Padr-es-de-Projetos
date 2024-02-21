public class TrabalhadorAdere {
    
}
interface Trabalhavel {
    void trabalhar();
}

interface Comivel {
    void comer();
}

class TrabalhadorHumano implements Trabalhavel, Comivel {
    public void trabalhar() {
        System.out.println("Estou trabalhando!");
    }

    public void comer() {
        System.out.println("Estou comendo!");
    }
}

class RoboTrabalhador implements Trabalhavel {
    public void trabalhar() {
        System.out.println("Estou trabalhando!");
    }
}
