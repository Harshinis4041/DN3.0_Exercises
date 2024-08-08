package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.BookService.performService(..))")
    public void logBefore() {
        System.out.println("Logging before method execution.");
    }

    @After("execution(* com.library.BookService.performService(..))")
    public void logAfter() {
        System.out.println("Logging after method execution.");
    }
}
