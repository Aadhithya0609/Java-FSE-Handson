package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultipleAppendersDemo {
    private static final Logger logger = LoggerFactory.getLogger(MultipleAppendersDemo.class);

    public static void main(String[] args) {
        logger.info("This log goes to both console and file!");
        logger.debug("Debug log for multiple appenders.");
        logger.error("Error log sent to both destinations.");
    }
}
