class CheckPasswordSpecialCharHandler extends BaseHandler {
    @Override
    public boolean handle(String login, String password) {
        if (!password.matches(".*[!@#$%^&*].*")) {
            System.out.println("A senha deve ter pelo menos um caractere especial.");
            return false;
        }
        return super.handle(login, password);
    }
}