interface Forma {
    double calcularArea();
}

class RetanguloAdere implements Forma {
    double comprimento;
    double largura;

    public double calcularArea() {
        return comprimento * largura;
    }
}

class CalculadoraArea {
    double calcularAreaForma(Forma forma) {
        return forma.calcularArea();
    }
}
