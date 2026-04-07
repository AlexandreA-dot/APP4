package app;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import electronique.CircuitParallele;
import electronique.CircuitSerie;
import electronique.Composant;
import electronique.Resistance;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class CircuitBuilder {
    private static final char fSep = File.separatorChar;
    private static String pathIn = System.getProperty("user.dir") + fSep + "APP4" + fSep + "src" + fSep + "donnees" + fSep;

    public Composant ConstruireCircuit(String Fichier) {
        pathIn += Fichier;
        List<Composant> listeComposant = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode donneesCircuit = mapper.readTree(new File(pathIn));
            return lireCircuit(donneesCircuit);
        } catch (IOException e) {

            System.err.println("Erreur de lecture : " + e.getMessage());

        }
        return null;
    }

    /**
     * Méthode récursive permettant de lire et de créer un circuit à partir d'un nœud JSON.
     *
     * @param node Le nœud JSON décrivant un circuit.
     * @return Un objet circuit paralèle ou en série correspondant au nœud JSON.
     * @throws IllegalArgumentException Si le type de circuit est inconnu.
     */
    private Composant lireCircuit(JsonNode node) {
        String type = node.get("type").asText();


        if ("resistance".equals(type)) {
            return new Resistance(node.get("valeur").asDouble());
        } else if ("parallele".equals(type)) {
            List<Composant> listeComposant1 = new ArrayList<Composant>();
            for (JsonNode composantNode : node.get("composants")) {
                listeComposant1.add(lireCircuit(composantNode));
            }
            return new CircuitParallele(listeComposant1);


        } else if ("serie".equals(type)) {
            List<Composant> listeComposant2 = new ArrayList<Composant>();
            for (JsonNode composantNode : node.get("composants")) {
                listeComposant2.add(lireCircuit(composantNode));
            }
            return new CircuitSerie(listeComposant2);


        }
        throw new IllegalArgumentException("Type de circuit inconnu : " + type);
    }
}