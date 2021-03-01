package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 6, 5);
        Cat cat = new Cat("Мурка", 25, 5);
        Dog dog1=new Dog("Тузик",12,32);
        cat.runInfo();
        cat.swimInfo();
        dog.runInfo();
        dog.swimInfo();
        dog1.runInfo();
        Animal[] summAnimal = {dog, cat,dog1};
        System.out.println("Всего животных: "+summAnimal.length);
    }
}

