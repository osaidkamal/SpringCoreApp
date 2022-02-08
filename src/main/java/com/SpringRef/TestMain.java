package com.SpringRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanRef.xml");
        A temp = (A) context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getB().getY());
        System.out.println(temp);
    }
}
