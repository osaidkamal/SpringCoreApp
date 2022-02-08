package com.SpringLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCy.xml");
//        Samosa s1 = (Samosa) context.getBean("s1");
//        System.out.println(s1);
        //When using RegisterShutDownHook use abstract application context
        context.registerShutdownHook();
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        ColdDrink p1= (ColdDrink) context.getBean("p1");
//        System.out.println(p1);
        Example e1 = (Example) context.getBean("e1");
        System.out.println(e1);
    }
}
