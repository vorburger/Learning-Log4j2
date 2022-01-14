package ch.vorburger.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private final static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("hello, world");
    }
}
