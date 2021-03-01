package com.company;

public class Dog extends Animal {
    Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    void swimInfo() {
        if (swim<10 && swim>0) System.out.println("Собака "+name +" проплыла: " + swim+" метров");
        if (swim>10) System.out.println("Собака "+name+ " столько не проплывет");
        if (swim<0)System.out.println("Неверный параметр");
    }

    @Override
    void runInfo() {
        if (run >= 500) System.out.println("Собака столько не пробежит");
        if (run > 0 && run < 500) System.out.println("Собака "+name+" пробежала: "+run+" метров");
        if (run<=0)  System.out.println("Неверный параметр");
    }
}

