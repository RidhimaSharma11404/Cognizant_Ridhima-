public class LoggerTest {

    public static void main(String[] args) {

        System.out.println("===== Singleton Pattern Test =====\n");

       
        // Test 1: Same instance returned every time
     
        System.out.println("-- Test 1: Single Instance Check --");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        System.out.println("logger1 hashCode: " + System.identityHashCode(logger1));
        System.out.println("logger2 hashCode: " + System.identityHashCode(logger2));
        System.out.println("logger3 hashCode: " + System.identityHashCode(logger3));

        boolean sameInstance = (logger1 == logger2) && (logger2 == logger3);
        System.out.println("All references point to the same object: " + sameInstance);
        System.out.println();

        
        // Test 2: Logging functionality works 
       
        System.out.println("-- Test 2: Logging Functionality --");
        logger1.info("Application started.");
        logger2.warn("Low memory detected.");
        logger3.error("Failed to connect to database.");
        System.out.println();

       
        // Test 3: Thread-safety test – multiple threads get the same instance
       
        System.out.println("-- Test 3: Thread-Safety Check --");
        Runnable task = () -> {
            Logger threadLogger = Logger.getInstance();
            System.out.println(Thread.currentThread().getName()
                    + " -> hashCode: " + System.identityHashCode(threadLogger));
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        // Wait 
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n===== All tests completed =====");
    }
}