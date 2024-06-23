import java.util.Random;

class Login extends Singleton {
    private static Login loginInstance;

    private String username;
    private String password;
    private String captcha;

    private Login() {
        this.captcha = generateCaptcha();
    }

    public static Login getInstance() {
        if (loginInstance == null) {
            loginInstance = new Login();
        }
        return loginInstance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String generateCaptcha() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            captcha.append(characters.charAt(random.nextInt(characters.length())));
        }
        return captcha.toString();
    }

    public boolean verifyCaptcha(String userInput) {
        return userInput.equals(this.captcha);
    }

    public String getCaptcha() {
        return captcha;
    }
}