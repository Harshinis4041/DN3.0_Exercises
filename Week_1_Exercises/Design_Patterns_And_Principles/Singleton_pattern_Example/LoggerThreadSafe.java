package SingletonPatternExample;

public class LoggerThreadSafe {
    
    private static volatile LoggerThreadSafe instance;

    
    private LoggerThreadSafe() {
    }

    public static LoggerThreadSafe getInstance() {
        if (instance == null) {
            synchronized (LoggerThreadSafe.class) {
                if (instance == null) {
                    instance = new LoggerThreadSafe();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
