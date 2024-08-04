public abstract class BaseHandler implements TransactionHandler {
    private TransactionHandler proximoManipulador;

    @Override
    public TransactionHandler setProximo(TransactionHandler manipulador) {
        this.proximoManipulador = manipulador;
        return manipulador;
    }

    @Override
    public String manipular(Transaction transacao) {
        if (proximoManipulador != null) {
            return proximoManipulador.manipular(transacao);
        }
        return "Transação não pode ser processada.";
    }
}
