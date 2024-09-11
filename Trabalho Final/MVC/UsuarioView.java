import java.util.Scanner;

public class UsuarioView {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void displayUsuarioInfo(String nome, String email) {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}
