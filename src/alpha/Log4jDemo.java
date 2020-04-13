package alpha;

import org.apache.logging.log4j.*;

public class Log4jDemo {

    private static Logger log = LogManager.getLogger(Log4jDemo.class.getName()); //create Object

    public static void main(String[] args) {
        log.debug("I am debugging"); //check information
        log.info("object is present"); //infomation
        log.error("object is not present"); //error message
        log.fatal("this is fatal");

    }
}
