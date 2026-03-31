package electronique;

public abstract class Composant {
    protected double resistance;
    public Composant(double resistance) {
        setResistance(resistance);
    }
    public double calculerResistance(){
        return 0.0;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
