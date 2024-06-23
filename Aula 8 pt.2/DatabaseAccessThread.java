public class DatabaseAccessThread extends Thread {
    @Override
    public void run() {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        connectionManager.connect();
    }
}