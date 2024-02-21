interface Ligavel {
    void ligar();
    void desligar();
    boolean estaLigado();
}

class Lampada implements Ligavel {
    boolean ligada = false;

    public void ligar() {
        ligada = true;
        System.out.println("Lampada ligada!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lampada desligada!");
    }

    public boolean estaLigado() {
        return ligada;
    }
}

class InterruptorEletrico {
    Ligavel dispositivo;

    void pressionar() {
        if (dispositivo.estaLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }
}
