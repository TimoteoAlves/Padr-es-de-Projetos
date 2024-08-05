class CheckPasswordUpperCaseHandler extends BaseHandler {
    @Override
    public boolean handle(String login, String password) {
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            System.out.println("A senha deve ter pelo menos uma letra maiúscula.");
            return false;
        }
        return super.handle(login, password);
    }
}