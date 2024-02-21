interface TrabalhadorViola {
    void trabalhar();
    void comer();
}

class Robo implements TrabalhadorViola{
    public void trabalhar() {
        System.out.println("Estou trabalhando!");
    }

    public void comer() {
        throw new UnsupportedOperationException("Robôs não podem comer.");
    }
}
