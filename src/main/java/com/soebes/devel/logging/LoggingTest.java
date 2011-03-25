package com.soebes.devel.logging;

import org.apache.log4j.Logger;


public class LoggingTest {
    private static Logger LOGGER = Logger.getLogger(LoggingTest.class);

    public static void main(String[] args) {
        System.out.println("LoggingTest.main()");
        LOGGER.info("INFO: This is the LoggingTest()");
        LOGGER.debug("DEBUG: This is the LoggingTest()");
        LOGGER.trace("TRACE: This is the LoggingTest()");
        LOGGER.error("ERROR: This is the LoggingTest()");
        LOGGER.warn("WARN: This is the LoggingTest()");
        LOGGER.fatal("FATAL: This is the LoggingTest()");
    }

}
