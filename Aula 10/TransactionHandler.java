public interface TransactionHandler {
    TransactionHandler setProximo(TransactionHandler manipulador);
    String manipular(Transaction transacao);
}
