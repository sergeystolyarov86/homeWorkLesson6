package com.company;

 public abstract class Animal {
    protected int run;
    protected int swim;
    protected String name;
    Animal(String name,int run,int swim){
    this.name=name;
    this.run=run;
    this.swim=swim;}
    abstract void  runInfo();
    abstract void swimInfo();

}
