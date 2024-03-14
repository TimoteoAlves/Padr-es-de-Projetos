class CamisaEsportiva {
    private String marca;
    private String time;

    public CamisaEsportiva(String marca, String time) {
        this.marca = marca;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Camisa Esportiva " + marca + " do time " + time;
    }
}