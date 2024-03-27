import java.util.Random;

class Subway implements Transport {
    private final int capacidade = 200;
    private int atuaisPassageiros = 0;
    private String linha;

    public int capacidade() {
        return capacidade;
    }

    public String rota() {
        return linha;
    }

    public void gerarRota(String inicio, String fim) {
        this.linha = "Linha: " + inicio + " -> " + fim;
    }

    public void embarcarPassageiros() {
        if (atuaisPassageiros < capacidade) {
            atuaisPassageiros++;
        } else {
            System.out.println("Metrô cheio, não pode embarcar mais passageiros.");
        }
    }

    public void desembarcarPassageiros() {
        if (atuaisPassageiros > 0) {
            atuaisPassageiros--;
        } else {
            System.out.println("Sem passageiros para desembarcar.");
        }
    }

    public int contarPassageirosAtuais() {
        Random rand = new Random();
        return rand.nextInt(capacidade + 1);
    }
}
