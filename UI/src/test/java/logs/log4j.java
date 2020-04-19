package logs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {

private static Logger logger = LogManager.getLogger(log4j.class);

public static void main(String[] args)
{
    BasicConfigurator.configure();
    PropertyConfigurator.configure("log4j2.properties");
    logger.info("This is info");
    logger.error("This is error");
    logger.warn("This is info");
    logger.fatal("This is info");

}

}
