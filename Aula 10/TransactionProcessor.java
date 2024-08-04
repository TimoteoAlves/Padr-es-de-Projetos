public class TransactionProcessor {
    public static void main(String[] args) {
        TransactionHandler manipuladorDeposito = new DepositHandler();
        TransactionHandler manipuladorSaque = new WithdrawHandler();
        TransactionHandler manipuladorTransferencia = new TransferHandler();

        manipuladorDeposito.setProximo(manipuladorSaque).setProximo(manipuladorTransferencia);

        Account conta1 = new Account();
        conta1.setId("CONTA1");
        conta1.setSaldo(1000);

        Account conta2 = new Account();
        conta2.setId("CONTA2");
        conta2.setSaldo(500);

        Transaction transacaoDeposito = new Transaction();
        transacaoDeposito.setTipo("deposito");
        transacaoDeposito.setValor(200);
        transacaoDeposito.setConta(conta1);

        Transaction transacaoSaque = new Transaction();
        transacaoSaque.setTipo("saque");
        transacaoSaque.setValor(300);
        transacaoSaque.setConta(conta1);

        Transaction transacaoTransferencia = new Transaction();
        transacaoTransferencia.setTipo("transferencia");
        transacaoTransferencia.setValor(400);
        transacaoTransferencia.setConta(conta1);
        transacaoTransferencia.setContaDestino(conta2);

        Transaction transacaoInvalida = new Transaction();
        transacaoInvalida.setTipo("invalida");
        transacaoInvalida.setValor(100);
        transacaoInvalida.setConta(conta1);

        System.out.println(manipuladorDeposito.manipular(transacaoDeposito));
        System.out.println(manipuladorDeposito.manipular(transacaoSaque));
        System.out.println(manipuladorDeposito.manipular(transacaoTransferencia));
        System.out.println(manipuladorDeposito.manipular(transacaoInvalida));
    }
}
