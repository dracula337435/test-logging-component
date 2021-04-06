package io.dracula.test.logging.component;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class TestLogging {

    private static Logger logger = LoggerFactory.getLogger(TestLogging.class);

    @Test
    public void test(){
        MDC.put("some-key", "world");
        logger.info("format {} {id}","hello", "world");
    }

}
