package com.endava;

public class Nest {
    public void buildNest(){
        //build the nest here
    }

    class Bird {
        public void sleep() {
            System.out.println("I'm sleeping like a bird");
        }
    }

    class Duckling extends Bird {
        public void sleep() {
            System.out.println("I'm sleeping like a duckling");
        }

        public void quack() {
        }
    }
}
