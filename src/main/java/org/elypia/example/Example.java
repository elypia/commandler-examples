package org.elypia.example;

import org.elypia.commandler.Commandler;
import org.elypia.commandler.console.ConsoleIntegration;
import org.slf4j.*;

public class Example {

    private static final Logger logger = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        ConsoleIntegration c = new ConsoleIntegration();
        Commandler commandler = new Commandler();
        logger.debug("Loaded Commandler with configuration of {} properties.", commandler.getConfig().getProperties().size());
    }
}
