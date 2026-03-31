package electronique;

public class Resistance {
    private double resistance;
    public Resistance(double pResistance) {
        setResistance(pResistance);
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
