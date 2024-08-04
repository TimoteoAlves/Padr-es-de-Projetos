public class DepositHandler extends BaseHandler {
    @Override
    public String manipular(Transaction transacao) {
        if ("deposito".equals(transacao.getTipo())) {
            if (transacao.getValor() > 0) {
                transacao.getConta().setSaldo(transacao.getConta().getSaldo() + transacao.getValor());
                return "Depósito de " + transacao.getValor() + " processado. Novo saldo: " + transacao.getConta().getSaldo();
            } else {
                return "O valor do depósito deve ser positivo.";
            }
        } else {
            return super.manipular(transacao);
        }
    }
}
