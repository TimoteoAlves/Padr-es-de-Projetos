public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private static final Object lock = new Object();

    private DatabaseConnectionManager() {
        // Private constructor to prevent instantiation
    }

    public static DatabaseConnectionManager getInstance() {
        synchronized (lock) {
            if (instance == null) {
                instance = new DatabaseConnectionManager();
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println(Thread.currentThread().getName() + " connected to the database.");
    }
}
