interface Handler {
    Handler setNext(Handler next);
    boolean handle(String login, String password);
}