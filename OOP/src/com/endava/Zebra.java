package com.endava;

public class Zebra extends Animal {
    private int numberOfStripes;

    public Zebra(String nickname, double weight, double height, int numberOfStripes) {
        super(nickname, weight, height);
        this.numberOfStripes = numberOfStripes;
    }

    public void eat() {
        super.eat();
        System.out.println(" like a zebra");
    }

    public int getNumberOfStripes() { return numberOfStripes;}

    public void setNumberOfStripes(int numberOfStripes) {
        if (numberOfStripes <= 0) {
            //values less than 0 are not accepted
        } else {
            this.numberOfStripes = numberOfStripes;
        }
    }
}
