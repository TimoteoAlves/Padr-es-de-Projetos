public class Main {
    public static void main(String[] args) {
        // Create and start 5 threads
        for (int i = 0; i < 5; i++) {
            Thread thread = new DatabaseAccessThread();
            thread.start();
        }
    }
}
