package electronique;

import java.util.List;

public class CircuitSerie extends Circuit{
    public CircuitSerie(List<Composant> plisteComposant) {
        super(plisteComposant);
    }
    public double calculerResistance() {
        double reponse = 0.0;
        for (Composant composant: listeComposant){
            reponse += composant.calculerResistance();
        }
        return reponse;
    }
}
