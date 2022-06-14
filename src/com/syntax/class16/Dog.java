package com.syntax.class16;

public class Dog {

    String name;
    String color;

    static int noOfLegs=4;

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Tomy";
        dog1.color="Pink";

        Dog dog2=new Dog();
        dog2.name="Fido";
        dog2.color="Black";

        Dog dog3=new Dog();
        dog2.name="Jajaja";
        dog2.color="White";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
        System.out.println();
        System.out.println(dog1.color);
        System.out.println(dog2.color);
        System.out.println(dog3.color);


    }

}
