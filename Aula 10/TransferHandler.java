public class TransferHandler extends BaseHandler {
    @Override
    public String manipular(Transaction transacao) {
        if ("transferencia".equals(transacao.getTipo())) {
            if (transacao.getConta().getSaldo() >= transacao.getValor()) {
                transacao.getConta().setSaldo(transacao.getConta().getSaldo() - transacao.getValor());
                transacao.getContaDestino().setSaldo(transacao.getContaDestino().getSaldo() + transacao.getValor());
                return "Transferência de " + transacao.getValor() + " processada da conta " + transacao.getConta().getId() + " para a conta " + transacao.getContaDestino().getId() + ".";
            } else {
                return "Saldo insuficiente para transferência.";
            }
        } else {
            return super.manipular(transacao);
        }
    }
}
