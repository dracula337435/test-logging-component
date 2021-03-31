package io.dracula.test.logging.component;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogging {

    private static Logger logger = LoggerFactory.getLogger(TestLogging.class);

    @Test
    public void test(){
        logger.info("hello");
    }

}
