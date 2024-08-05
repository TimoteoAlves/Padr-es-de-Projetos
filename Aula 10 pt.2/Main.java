public class Main {
    public static void main(String[] args) {
        Handler chain = new CheckUserExistsHandler();
        chain.setNext(new CheckPasswordUpperCaseHandler())
            .setNext(new CheckPasswordLowerCaseHandler())
            .setNext(new CheckPasswordSpecialCharHandler())
            .setNext(new CheckPasswordDigitHandler())
            .setNext(new CheckPasswordConsecutiveDigitsHandler())
            .setNext(new CheckPasswordLengthHandler());

        String login = "user1";
        String password = "AcD#!@13";

        if (chain.handle(login, password)) {
            System.out.println("Login e senha válidos.");
        }
    }
}