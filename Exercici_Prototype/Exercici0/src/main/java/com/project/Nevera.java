public class Nevera extends Electrodomestic {
    private int frigories;
    private double soroll;

    public Nevera(String nom, String color, double preu, String marca, String eficiencia, int frigories, double soroll) {
        super(nom, color, preu, marca, eficiencia);
        this.frigories = frigories;
        this.soroll = soroll;
    }

    public int getFrigories() { return frigories; }
    public void setFrigories(int frigories) { this.frigories = frigories; }
    
    public double getSoroll() { return soroll; }
    public void setSoroll(double soroll) { this.soroll = soroll; }

    @Override
    public Nevera clone() {
        return (Nevera) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Nevera{" +
                "frigories=" + frigories +
                ", soroll=" + soroll +
                '}';
    }
}
