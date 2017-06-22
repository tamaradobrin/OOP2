package com.endava;

public class Parrot extends Animal implements Flyable{
    public void buildNest(){
        System.out.println("I'm building a nest");
    }
    public void fly(){
        System.out.println("I'm flying like a simple parrot");
    }
}
