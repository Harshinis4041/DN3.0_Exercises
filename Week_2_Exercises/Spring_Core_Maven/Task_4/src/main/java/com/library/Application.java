package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
        sampleBean.sayHello();
    }
}
