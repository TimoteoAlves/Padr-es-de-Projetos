public class Vehicle {
    private String id;
    private String modelo;
    private int ano;

    public Vehicle(String id, String modelo, int ano) {
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return modelo;
    }

    public int getYear() {
        return ano;
    }
}