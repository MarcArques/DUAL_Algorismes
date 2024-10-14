package com.project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Entregues {
    private List<Producte> productes;
    private final PropertyChangeSupport support;

    public Entregues() {
        this.productes = new ArrayList<>();
        this.support = new PropertyChangeSupport(this);
    }

    public void addProducte(Producte producte) {
        productes.add(producte);
        support.firePropertyChange("entreguesAdd", null, producte);
    }

    public void removeProducte(int id) {
        Producte producteToRemove = null;
        for (Producte p : productes) {
            if (p.getId() == id) {
                producteToRemove = p;
                break;
            }
        }

        if (producteToRemove != null) {
            productes.remove(producteToRemove);
            support.firePropertyChange("entreguesRemove", producteToRemove, null);
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
        return "Entregues{" + "productes=" + productes + '}';
    }
}
