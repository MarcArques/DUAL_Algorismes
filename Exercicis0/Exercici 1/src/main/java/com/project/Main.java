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
        Singleton instance1 = getNewDestroyedInstance("Manolo", "Cafre", 18);
        Singleton instance2 = getNewDestroyedInstance("Paco", "Sanchez", 22);
        Singleton instance3 = getNewDestroyedInstance("Maria", "Gimenez", 15);

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }

    static Singleton getNewDestroyedInstance(String nom, String cognom, Integer edat) {
        Singleton instanciaHackeada = null;
        try {
            Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                instanciaHackeada = (Singleton) constructor.newInstance(nom, cognom, edat);
                break; 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instanciaHackeada;
    }
}
