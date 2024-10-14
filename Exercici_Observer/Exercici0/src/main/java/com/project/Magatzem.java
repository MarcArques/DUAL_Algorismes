package com.project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Magatzem {
    private List<Producte> productes;
    private int capacitat;
    private final PropertyChangeSupport support;

    public Magatzem() {
        this.productes = new ArrayList<>();
        this.capacitat = 10;
        this.support = new PropertyChangeSupport(this);
    }

    public List<Producte> getProductes() {
        return productes;
    }

    public void addProducte(Producte producte) {
        if (capacitat > 0) {
            productes.add(producte);
            capacitat--;
            support.firePropertyChange("magatzemAdd", null, producte);
        }
    }

    public void removeProducte(int id, Entregues entregues) {
        Producte producteToRemove = null;
        for (Producte p : productes) {
            if (p.getId() == id) {
                producteToRemove = p;
                break;
            }
        }

        if (producteToRemove != null) {
            productes.remove(producteToRemove);
            capacitat++;
            support.firePropertyChange("magatzemRemove", producteToRemove, null);
            entregues.addProducte(producteToRemove);
            support.firePropertyChange("magatzemEntrega", producteToRemove, entregues);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    @Override
    public String toString() {
        return "Magatzem{" + "productes=" + productes + ", capacitat=" + capacitat + '}';
    }
}
