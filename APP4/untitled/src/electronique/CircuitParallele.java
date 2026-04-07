package electronique;

import java.util.List;

public class CircuitParallele extends Circuit{
    public CircuitParallele(List<Composant> plisteComposant) {
        super(plisteComposant);
    }
    public double calculerResistance() {
        double reponse = 0.0;
        for (Composant composant: listeComposant){
            reponse += (1 / composant.calculerResistance());
        }
        reponse = Math.pow(reponse, -1.0);
        return reponse;
    }
}
