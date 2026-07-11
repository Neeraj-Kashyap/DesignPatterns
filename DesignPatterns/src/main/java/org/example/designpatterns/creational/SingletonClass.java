package org.example.designpatterns.creational;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {
        // private constructor to prevent instantiation from outside
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            System.out.println("Inside the instance as null");
            instance = new SingletonClass();
        }
        System.out.println("Outside the instance as not null");
        return instance;
    }

    public static void main(String[] args) {
      getInstance();
    }

}
