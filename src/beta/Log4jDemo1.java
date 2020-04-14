package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo1 {

    private static Logger log = LogManager.getLogger(Log4jDemo1.class.getName()); //create Object

    public static void main(String[] args) {
        log.debug("I am debugging"); //check information
        log.info("object is present"); //infomation
        log.error("object is not present"); //error message
        log.fatal("this is fatal");

    }
}
