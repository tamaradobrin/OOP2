package com.endava;

public class Animal {
    private String nickname;
    private double weight;
    private double height;

    public Animal(String nickname, double weight, double height) {
        this.nickname = nickname;
        this.weight = weight;
        this.height = height;
    }

    public void eat(){ System.out.println("I'm eating");}
    public void sleep() { System.out.println("I'm sleeping");}

    public String getNickname() { return nickname;}
    public void setNickname(String nickname) { this.nickname = nickname;}
    public double getWeight() { return weight;}
    public void setWeight(double weight) { this.weight = weight;}
    public double getHeight() { return height;}
    public void setHeight(double height) { this.height = height;}
}
