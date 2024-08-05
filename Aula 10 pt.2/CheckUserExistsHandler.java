import java.util.Arrays;
import java.util.List;

class CheckUserExistsHandler extends BaseHandler {
    private static final List<String> registeredUsers = Arrays.asList("user1", "user2", "user3");

    @Override
    public boolean handle(String login, String password) {
        if (!registeredUsers.contains(login)) {
            System.out.println("Login não está cadastrado.");
            return false;
        }
        return super.handle(login, password);
    }
}