package com.project;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Main {
    public static void main(String[] args) {
        Producte p0 = new Producte(0, "Llibre");
        Producte p1 = new Producte(1, "Boli");
        Producte p2 = new Producte(2, "Rotulador");
        Producte p3 = new Producte(3, "Carpeta");
        Producte p4 = new Producte(4, "Motxilla");
        Magatzem magatzem = new Magatzem();
        Entregues entregues = new Entregues();

        magatzem.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("magatzemAdd")) {
                    Producte producte = (Producte) evt.getNewValue();
                    System.out.println("S'ha afegit el producte amb id " + producte.getId() + " al magatzem");
                } else if (evt.getPropertyName().equals("magatzemRemove")) {
                    Producte producte = (Producte) evt.getOldValue();
                    System.out.println("S'ha esborrat el producte amb id " + producte.getId() + " del magatzem");
                } else if (evt.getPropertyName().equals("magatzemEntrega")) {
                    Producte producte = (Producte) evt.getOldValue();
                    System.out.println("S'ha mogut el producte amb id " + producte.getId() + " cap a les entregues");
                }
            }
        });

        entregues.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("entreguesAdd")) {
                    Producte producte = (Producte) evt.getNewValue();
                    System.out.println("S'ha afegit el producte amb id " + producte.getId() + " a les entregues");
                } else if (evt.getPropertyName().equals("entreguesRemove")) {
                    Producte producte = (Producte) evt.getOldValue();
                    System.out.println("S'ha entregat el producte amb id " + producte.getId());
                }
            }
        });

        p0.setId(5);
        p0.setNom("Llibreta");
        p1.setNom("Boli de luxe");

        magatzem.addProducte(p0);
        magatzem.addProducte(p1);
        magatzem.addProducte(p2);
        magatzem.addProducte(p3);
        magatzem.addProducte(p4);

        magatzem.removeProducte(2, entregues);
        magatzem.removeProducte(3, entregues);
        magatzem.removeProducte(4, entregues);

        entregues.removeProducte(2);
        entregues.removeProducte(3);

        System.out.println(magatzem);
        System.out.println(entregues);
    }
}
