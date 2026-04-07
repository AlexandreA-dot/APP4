package electronique;

public class Resistance extends Composant {
    private double resistance;
    private final double RESISTANCE_DEFAUT = 5.0;

    public Resistance(double pResistance) {
        super(pResistance);
    }

    public double calculerResistance() {
        return getResistance();
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
