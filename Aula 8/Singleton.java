class Singleton {
    private static Singleton instance;

    protected Singleton() {
        // Protected constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

