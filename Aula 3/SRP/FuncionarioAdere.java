public class FuncionarioAdere {
    
    String nomeFuncionario;
    String emailFuncionario;
}

class ServicoEmail {
    void enviarEmail(String mensagem, String email) {
        System.out.println("Enviando email para " + email + " com a mensagem: " + mensagem);
    }
}
