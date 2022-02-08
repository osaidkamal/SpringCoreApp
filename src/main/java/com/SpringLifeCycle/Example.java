package com.SpringLifeCycle;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
        super();
    }

    public void start() {
        System.out.println("Starting Method");
    }

    public void end() {
        System.out.println("Ending Method");
    }
}
