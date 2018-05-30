package com.quintet.utils.AOPUtils;

import com.quintet.utils.AOPUtils.Annontation.LogAOP;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
public final class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Before(value = "@annotation(logAOP)")
    private void preHandle(LogAOP logAOP) {
        logger.info("log AOP utils test");
        UUID.randomUUID();
    }


}
