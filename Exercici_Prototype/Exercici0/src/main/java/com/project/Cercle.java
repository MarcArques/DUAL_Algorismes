package com.project;

public class Cercle extends Poligon {
    
    public int radius;

    public Cercle() {
    }

    public Cercle(Cercle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Poligon clone() {
        return new Cercle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (this == object2) return true;
        if (!(object2 instanceof Poligon) || !super.equals(object2)) return false;
        if (!this.getClass().equals(object2.getClass())) return false;
        Cercle cast2 = (Cercle) object2;
        return cast2.radius == radius;
    }
}