package com.ajimon.core.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

@Service
public class JMSErrorHandler implements ErrorHandler {

    private Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void handleError(Throwable t) {
        log.error("Error in JMS listener", t);
    }
}