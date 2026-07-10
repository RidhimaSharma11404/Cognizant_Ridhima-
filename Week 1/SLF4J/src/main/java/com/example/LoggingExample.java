package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exercise 1: Logging Error Messages and Warning Levels
 *
 * This class demonstrates how to use SLF4J with Logback to log messages
 * at different severity levels (ERROR, WARN, INFO, DEBUG, TRACE).
 *
 * SLF4J (Simple Logging Facade for Java) is a logging abstraction layer —
 * it does NOT do the actual logging itself. It delegates to a bound
 * implementation at runtime (here: Logback via logback-classic).
 */
public class LoggingExample {

    // Each class gets its own Logger instance.
    // LoggerFactory.getLogger() looks up (or creates) a logger keyed to this class name.
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        System.out.println("=== SLF4J Logging Demo - Exercise 1 ===\n");

        // ----------------------------------------------------------------
        // 1. ERROR  — Critical problems; the application cannot continue
        // ----------------------------------------------------------------
        logger.error("This is an error message");

        // ERROR with an exception attached (stack-trace printed automatically)
        try {
            int result = 10 / 0;          // deliberately throws ArithmeticException
        } catch (ArithmeticException e) {
            logger.error("Caught an arithmetic exception: {}", e.getMessage(), e);
        }

        // ----------------------------------------------------------------
        // 2. WARN   — Something unexpected, but the app can keep running
        // ----------------------------------------------------------------
        logger.warn("This is a warning message");
        logger.warn("Disk usage is at {}% — consider freeing space", 85);

        // ----------------------------------------------------------------
        // 3. INFO   — Normal operational milestones
        // ----------------------------------------------------------------
        logger.info("Application started successfully");
        logger.info("Processing user request for userId={}", 42);

        // ----------------------------------------------------------------
        // 4. DEBUG  — Detailed diagnostic information (dev / test only)
        // ----------------------------------------------------------------
        logger.debug("Entering calculateTotal() with params: items={}, discount={}", 5, 0.1);

        // ----------------------------------------------------------------
        // 5. TRACE  — Most granular; fine-grained execution tracing
        // ----------------------------------------------------------------
        logger.trace("Variable x has value: {}", "sampleValue");

        System.out.println("\n=== Logging demo complete. Check console output above. ===");
    }
}
