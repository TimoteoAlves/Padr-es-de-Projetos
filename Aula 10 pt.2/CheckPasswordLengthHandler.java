class CheckPasswordLengthHandler extends BaseHandler {
    @Override
    public boolean handle(String login, String password) {
        if (password.length() < 8 || password.length() > 16) {
            System.out.println("A senha deve ter entre 8 e 16 caracteres.");
            return false;
        }
        return super.handle(login, password);
    }
}