abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    @Override
    public boolean handle(String login, String password) {
        if (next != null) {
            return next.handle(login, password);
        }
        return true;
    }
}