package SingletonPatternExample;

public class Test {
    public static void main(String[] args) {
        // Basic Initialization
        Logger basicLogger1 = Logger.getInstance();
        Logger basicLogger2 = Logger.getInstance();
        basicLogger1.log("Basic Initialization: This is the first log message.");
        basicLogger2.log("Basic Initialization: This is the second log message.");
        if (basicLogger1 == basicLogger2) {
            System.out.println("Basic Initialization: Both instances are the same.");
        }

        // Eager Initialization
        LoggerEager eagerLogger1 = LoggerEager.getInstance();
        LoggerEager eagerLogger2 = LoggerEager.getInstance();
        eagerLogger1.log("Eager Initialization: This is the first log message.");
        eagerLogger2.log("Eager Initialization: This is the second log message.");
        if (eagerLogger1 == eagerLogger2) {
            System.out.println("Eager Initialization: Both instances are the same.");
        }

        // Lazy Initialization
        LoggerLazy lazyLogger1 = LoggerLazy.getInstance();
        LoggerLazy lazyLogger2 = LoggerLazy.getInstance();
        lazyLogger1.log("Lazy Initialization: This is the first log message.");
        lazyLogger2.log("Lazy Initialization: This is the second log message.");
        if (lazyLogger1 == lazyLogger2) {
            System.out.println("Lazy Initialization: Both instances are the same.");
        }

        // Thread-Safe Singleton
        LoggerThreadSafe threadSafeLogger1 = LoggerThreadSafe.getInstance();
        LoggerThreadSafe threadSafeLogger2 = LoggerThreadSafe.getInstance();
        threadSafeLogger1.log("Thread-Safe Singleton: This is the first log message.");
        threadSafeLogger2.log("Thread-Safe Singleton: This is the second log message.");
        if (threadSafeLogger1 == threadSafeLogger2) {
            System.out.println("Thread-Safe Singleton: Both instances are the same.");
        }
    }
}
