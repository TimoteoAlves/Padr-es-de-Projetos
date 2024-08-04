public class Transaction {
    private String tipo;
    private double valor;
    private Account conta;
    private Account contaDestino;

    // Getters e Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Account getConta() {
        return conta;
    }

    public void setConta(Account conta) {
        this.conta = conta;
    }

    public Account getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Account contaDestino) {
        this.contaDestino = contaDestino;
    }
}
