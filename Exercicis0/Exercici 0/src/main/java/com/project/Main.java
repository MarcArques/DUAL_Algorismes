package com.project;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++){
            System.out.println("Iniciant " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        Singleton instance1 = Singleton.getInstance("Manolo","Cafre", 18);
        Singleton instance2 = Singleton.getInstance("Paco","Sanchez", 22);
        Singleton instance3 = Singleton.getInstance("Maria","Gimenez", 15);

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}