package SingletonPatternExample;

public class LoggerEager {
   
    private static final LoggerEager instance = new LoggerEager();

    
    private LoggerEager() {
    }

        public static LoggerEager getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
