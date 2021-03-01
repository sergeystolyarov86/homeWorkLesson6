package com.company;

public class Cat extends Animal {

    Cat(String name,int run,int swim){
        super(name,run,swim);}
        @Override
        void swimInfo() {
            System.out.println("Коты/кошки не умеют плавать");

    }
    @Override
    void runInfo(){
        if (run>0 && run<=200) System.out.println("Кот/кошка "+name+" пробежала: "+run+" метров");
        if (run>200) System.out.println("Коты столько не бегают");
        if (run<=0)  System.out.println("Неверный параметр");
    }

}
