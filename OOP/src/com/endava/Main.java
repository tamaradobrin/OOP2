package com.endava;

public class Main {
    public void sleep(Animal a){
        a.sleep();
    }

    public void sleep(Zebra z){
        z.sleep();
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Zebra z = new Zebra();
        Animal z1 = new Zebra();
        a.sleep();
        z.sleep();
        z1.sleep();
    }

    public void changeSize(int size, String name, float scale){}

    public void changeSize(int size, String name){}
    public void changeSize(double size, String name, float scale){}
}
