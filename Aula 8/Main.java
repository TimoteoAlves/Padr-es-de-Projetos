import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login loginInstance = Login.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite nome de Usuário: ");
        loginInstance.setUsername(scanner.nextLine());

        System.out.print("Digite a Senha: ");
        loginInstance.setPassword(scanner.nextLine());

        System.out.println("Captcha: " + loginInstance.getCaptcha());
        System.out.print("Digite o Captcha: ");
        String captchaInput = scanner.nextLine();

        if (loginInstance.verifyCaptcha(captchaInput)) {
            System.out.println("Login Realizado!");
        } else {
            System.out.println("Falha no Login. Captcha incorreto123.");
        }

        scanner.close();
    }
}