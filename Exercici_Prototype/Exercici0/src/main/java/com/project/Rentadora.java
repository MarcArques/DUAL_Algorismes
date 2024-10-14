package com.project;

public class Rentadora extends Electrodomestic {
    private int revolucions;
    private double soroll;

    public Rentadora(String nom, String color, double preu, String marca, String eficiencia, int revolucions, double soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.revolucions = revolucions;
        this.soroll = soroll;
    }

    public int getRevolucions() { return revolucions; }
    public void setRevolucions(int revolucions) { this.revolucions = revolucions; }
    
    public double getSoroll() { return soroll; }
    public void setSoroll(double soroll) { this.soroll = soroll; }

    @Override
    public Rentadora clone() {
        return (Rentadora) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Rentadora{" +
                "revolucions=" + revolucions +
                ", soroll=" + soroll +
                '}';
    }
}
