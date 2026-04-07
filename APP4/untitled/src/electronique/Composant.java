package electronique;

public abstract class Composant {
    protected double resistance;
    private final double RESISTANCE_DEFAUT = 5.0;

    public Composant(double pResistance) {
        setResistance(pResistance);
    }

    public Composant() {
        setResistance(RESISTANCE_DEFAUT);
    }

    public double calculerResistance(){
        return getResistance();
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
