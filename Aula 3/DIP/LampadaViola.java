public class LampadaViola {

    boolean ligada = false;

    void ligar() {
        ligada = true;
        System.out.println("Lampada ligada!");
    }

    void desligar() {
        ligada = false;
        System.out.println("Lampada desligada!");
    }

    boolean estaLigada() {
        return ligada;
    }
}

class InterruptorEletrico {
    LampadaViola lampada;

    void pressionar() {
        if (lampada.estaLigada()) {
            lampada.desligar();
        } else {
            lampada.ligar();
        }
    }
}
