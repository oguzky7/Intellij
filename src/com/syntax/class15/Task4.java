package com.syntax.class15;

public class Task4 {

    void sayHello(String country){

        String hello;
        switch (country){
            case "USA":
                hello="Hola";
                break;
            case "Russia":
                hello="Privet";
                break;
            case "France":
                hello="bonjour";
                break;
            case  "Pakistan":
                hello="Assalam o Alykum";
                break;
            case "India":
                hello="Namastey";
                break;
            default:
                hello="Country not found";
        }
        System.out.println(hello);
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("France");
    }
}
