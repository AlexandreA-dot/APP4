package electronique;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Circuit extends Composant{
    protected static List<Composant> listeComposant = new ArrayList<Composant>();
    public Circuit(List<Composant> plisteComposant) {
        for (Composant composant: plisteComposant){
            listeComposant.add(composant);
        }
    }
}
