package com.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String username = "aadhithya";
        int loginAttempts = 5;

        logger.info("User {} attempted to log in {} times", username, loginAttempts);
        logger.debug("Detailed log for user {}: last login = {}", username, "2025-06-28 10:00 AM");
    }
}
