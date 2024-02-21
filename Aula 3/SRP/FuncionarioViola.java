class FuncionarioViola {
    String nomeFuncionario;
    String emailFuncionario;

    void enviarEmail(String mensagem) {
        System.out.println("Enviando email para " + emailFuncionario + " com a mensagem: " + mensagem);
    }
}
