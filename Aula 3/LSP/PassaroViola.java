public class PassaroViola {
    void voar() {
        System.out.println("Estou voando!");
    }
}

class Pinguim extends PassaroViola {
    @Override
    void voar() {
        throw new UnsupportedOperationException("Pinguins não podem voar.");
    }
}
