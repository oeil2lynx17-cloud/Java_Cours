import org.jdom.*;
import org.jdom.output.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> voitures = new HashMap<>();
        voitures.put("Ferrari", 320.0);
        voitures.put("Lamborghini", 325.0);

        GenerateurXML gen = new GenerateurXML();
        gen.ecrire(voitures, "voitures", System.out);
    }
}

public class GenerateurXML {
    public void ecrire(Map<String, Double> voitures,String nature, OutputStream out) {

        // 1. Créer la balise racine
        Element racine = new Element("voitures");

        for (Map.Entry<String, Double> entry : voitures.entrySet()) {
            String marque = entry.getKey();
            Double vitesse = entry.getValue();

            Element voiture = new Element("voiture");
            voiture.setAttribute("marque", marque);
            voiture.setAttribute("vitesse", "" + vitesse);
            racine.addContent(voiture);

        }

        // 2. Créer le document
        Document doc = new Document(racine);

        // 3. Écrire le document
        XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
        sortie.output(doc, System.out);
    }
}



