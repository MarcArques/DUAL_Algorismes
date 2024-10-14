public class Forn extends Electrodomestic {
    private int temperatura;
    private boolean autoneteja;

    public Forn(String nom, String color, double preu, String marca, String eficiencia, int temperatura, boolean autoneteja) {
        super(nom, color, preu, marca, eficiencia);
        this.temperatura = temperatura;
        this.autoneteja = autoneteja;
    }

    public int getTemperatura() { return temperatura; }
    public void setTemperatura(int temperatura) { this.temperatura = temperatura; }
    
    public boolean isAutoneteja() { return autoneteja; }
    public void setAutoneteja(boolean autoneteja) { this.autoneteja = autoneteja; }

    @Override
    public Forn clone() {
        return (Forn) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Forn{" +
                "temperatura=" + temperatura +
                ", autoneteja=" + autoneteja +
                '}';
    }
}
