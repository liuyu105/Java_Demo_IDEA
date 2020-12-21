package Java_basic.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Logging_Commons {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(Logging_Commons.class);
        log.info("start...");
        log.warn("end.");
    }
}
