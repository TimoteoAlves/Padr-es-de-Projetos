public class WithdrawHandler extends BaseHandler {
    @Override
    public String manipular(Transaction transacao) {
        if ("saque".equals(transacao.getTipo())) {
            if (transacao.getConta().getSaldo() >= transacao.getValor()) {
                transacao.getConta().setSaldo(transacao.getConta().getSaldo() - transacao.getValor());
                return "Saque de " + transacao.getValor() + " processado. Novo saldo: " + transacao.getConta().getSaldo();
            } else {
                return "Saldo insuficiente para saque.";
            }
        } else {
            return super.manipular(transacao);
        }
    }
}
