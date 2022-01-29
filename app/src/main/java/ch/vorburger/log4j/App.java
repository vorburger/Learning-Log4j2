package ch.vorburger.log4j;

public class App {

    private final static org.apache.logging.log4j.Logger loggerV2 = org.apache.logging.log4j.LogManager.getLogger();
    private final static org.apache.log4j.Logger loggerV1 = org.apache.log4j.Logger.getLogger(App.class);

    public static void main(String[] args) {
        loggerV2.info("hello, world via Log4j2");
        loggerV1.info("hello, world via Log4j1");
    }
}
