package alpha;

import org.apache.logging.log4j.*;

public class Log4jDemo {

    private static Logger log = LogManager.getLogger(Log4jDemo.class.getName()); //create Object

    public static void main(String[] args) {
        log.debug("I have clicked on button"); //check information
        log.info("Button is displayed"); //infomation
        log.error("Button is not displayed"); //error message
        log.fatal("Button is Missing");

    }
}
