package com.SpringLifeCycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Price");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init() {
        System.out.println("Inside Samosa Init Method");
    }

    public void destroy() {
        System.out.println("Inside Samosa Destroy Method");
    }
}
