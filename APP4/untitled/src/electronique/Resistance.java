package electronique;

public class Resistance {
    private double resistance;
    private final double RESISTANCE_DEFAUT = 5.0;

    public Resistance(double pResistance) {
        setResistance(pResistance);
    }

    public Resistance() {
        setResistance(RESISTANCE_DEFAUT);
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
