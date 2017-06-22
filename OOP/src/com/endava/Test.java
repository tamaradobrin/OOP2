package com.endava;

public class Test {
    public static void main(String arg[]){
        Test t1 = new Test();
        Test t2 = new Test();
        if(!t1.equals(t2)){
            System.out.println("they are not equals");
        }
        if(t1 instanceof Object){
            System.out.println("t1 is an Object");
        }
    }
}
