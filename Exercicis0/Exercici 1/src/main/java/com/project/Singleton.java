package com.project;

public final class Singleton {
    
    private static Singleton instance;  
    private String nom;
    private String cognom;
    private Integer edat;

    private Singleton(String nom, String cognom, Integer edat) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static Singleton getInstance(String nom, String cognom, Integer edat) {
        if (instance == null) {
            instance = new Singleton(nom, cognom, edat);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + "       Cognom: " + cognom + "       Edat: " + edat;
    }
}
