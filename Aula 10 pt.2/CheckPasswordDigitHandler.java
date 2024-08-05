class CheckPasswordDigitHandler extends BaseHandler {
    @Override
    public boolean handle(String login, String password) {
        if (!password.chars().anyMatch(Character::isDigit)) {
            System.out.println("A senha deve ter pelo menos um número.");
            return false;
        }
        return super.handle(login, password);
    }
}