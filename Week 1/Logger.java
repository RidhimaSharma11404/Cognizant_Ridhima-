public class Logger {

    // Step 1: Private static instance of itself
    private static volatile Logger instance = null;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method 
    public static Logger getInstance() {
        if (instance == null) {                    
            synchronized (Logger.class) {
                if (instance == null) {            
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Logger functionality

    public void log(String level, String message) {
        System.out.printf("[%s] %s: %s%n",
                java.time.LocalDateTime.now(), level.toUpperCase(), message);
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void warn(String message) {
        log("WARN", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }
}