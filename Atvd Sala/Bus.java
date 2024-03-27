import java.util.Random;

class Bus implements Transport {
    private final int capacidade = 50;
    private int ataisPassageiros = 0;
    private String rota;

    public int capacidade() {
        return capacidade;
    }

    public String rota() {
        return rota;
    }

    public void gerarRota(String inicio, String fim) {
        this.rota = "Rota: " + inicio + " -> " + fim;
    }

    public void embarcarPassageiros() {
        if (ataisPassageiros < capacidade) {
            ataisPassageiros++;
        } else {
            System.out.println("Ônibus cheio, não pode embarcar mais passageiros.");
        }
    }

    public void desembarcarPassageiros() {
        if (ataisPassageiros > 0) {
            ataisPassageiros--;
        } else {
            System.out.println("Sem passageiros para desembarcar.");
        }
    }

    public int contarPassageirosAtuais() {
        Random rand = new Random();
        return rand.nextInt(capacidade + 1);
    }
}