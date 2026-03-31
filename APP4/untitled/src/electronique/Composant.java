package electronique;

public abstract class Composant {
    protected Resistance resistance;
    public Composant(Resistance pResistance) {
        setResistance(pResistance);
    }
    public double calculerResistance(){
        return getResistance().calculerResistance();
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
    }
}
