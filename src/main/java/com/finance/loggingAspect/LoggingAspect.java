/*
 * FileName: LoggingAspect.java
 * Author  : Ajimon
 * 
 * Using JRE 1.8.0_211
 * 
 * Copyright(c) 2020 Finance.
 * Duplication or distribution of this code in part or in whole by any media
 * without the express written permission of Finance or its agents is
 * strictly prohibited.
 *  
 * REVISION         DATE        NAME       DESCRIPTION
 * 511.101       2 Jan, 2020       Ajimon      Initial Code  
 */
package com.finance.loggingAspect;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * The Class LoggingAspect.
 */
@Aspect
@Component
public class LoggingAspect {

    /*	
    	public class CoreLogger {
    	    private static final MethodLogger METHOD_LOGGER = Optional.ofNullable(MethodLogger.aspectOf())
    	            .orElse(new MethodLogger());
    
    	    @Around("execution(public * (@com.jcabi.aspects.Loggable *).*(..))"
    	            + " && !execution(String *.toString())"
    	            + " && !execution(int *.hashCode())"
    	            + " && !execution(boolean *.canEqual(Object))"
    	            + " && !execution(boolean *.equals(Object))")
    	    public Object wrapClass(final ProceedingJoinPoint point) throws Throwable {
    
    	        return METHOD_LOGGER.wrapClass(point);
    	    }
    
    	    @Around("@annotation(com.jcabi.aspects.Loggable)")
    	    public Object wrapMethod(final ProceedingJoinPoint point) throws Throwable {
    
    	        return METHOD_LOGGER.wrapMethod(point);
    	    }
    	}*/

    /** The log. */
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * Pointcut that matches all repositories, services and Web REST endpoints.
     */
    @Pointcut("within(@org.springframework.stereotype.Repository *)"
        + " || within(@org.springframework.stereotype.Service *)"
        + " || within(@org.springframework.web.bind.annotation.RestController *)")
    public void springBeanPointcut() {
        // Method is empty as this is just a Pointcut, the implementations are in the advices.
    }

    /**
     * Pointcut that matches all Spring beans in the application's main packages.
     */
    @Pointcut("within(com.learningturf.core..*)" + " || within(com.learningturf.core.service.impl..*)"
        + " || within(com.learningturf.core.controller..*)")
    public void applicationPackagePointcut() {
        // Method is empty as this is just a Pointcut, the implementations are in the advices.
    }

    /**
     * Advice that logs methods throwing exceptions.
     *
     * @param joinPoint join point for advice
     * @param e exception
     */
    @AfterThrowing(pointcut = "applicationPackagePointcut() && springBeanPointcut()", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        log.error("Exception in {}.{}() with cause = {}", joinPoint.getSignature().getDeclaringTypeName(),
            joinPoint.getSignature().getName(), e.getCause() != null ? e.getCause() : "NULL");
    }

    /**
     * Advice that logs when a method is entered and exited.
     *
     * @param joinPoint join point for advice
     * @return result
     * @throws Throwable throws IllegalArgumentException
     */
    @Around("applicationPackagePointcut() && springBeanPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        if (log.isDebugEnabled()) {
            log.debug("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
        }
        try {
            Object result = joinPoint.proceed();
            if (log.isDebugEnabled()) {
                log.debug("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
                    joinPoint.getSignature().getName(), result);
            }
            return result;
        } catch (IllegalArgumentException e) {
            log.error("Illegal argument: {} in {}.{}()", Arrays.toString(joinPoint.getArgs()),
                joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
            throw e;
        }
    }
}
