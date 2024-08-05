class CheckPasswordConsecutiveDigitsHandler extends BaseHandler {
    @Override
    public boolean handle(String login, String password) {
        if (password.matches(".*\\d{3}.*")) {
            System.out.println("A senha não deve ter três números consecutivos.");
            return false;
        }
        return super.handle(login, password);
    }
}
