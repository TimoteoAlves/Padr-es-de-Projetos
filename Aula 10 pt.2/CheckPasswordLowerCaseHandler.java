class CheckPasswordLowerCaseHandler extends BaseHandler {
    @Override
    public boolean handle(String login, String password) {
        if (!password.chars().anyMatch(Character::isLowerCase)) {
            System.out.println("A senha deve ter pelo menos uma letra minúscula.");
            return false;
        }
        return super.handle(login, password);
    }
}