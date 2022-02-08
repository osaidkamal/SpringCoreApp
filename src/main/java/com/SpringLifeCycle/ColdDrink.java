package com.SpringLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ColdDrink implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ColdDrink() {
        super();
    }

    @Override
    public String toString() {
        return "ColdDrink{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside ColdDrink Init Method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside ColdDrink Destroy Method");
    }
}
