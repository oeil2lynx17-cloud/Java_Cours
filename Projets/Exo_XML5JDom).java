import org.jdom.*;
import org.jdom.output.*;
import java.io.*;
import java.util.*; //import java.util.*: ERREUR

public class CatalogueXML {
    public void ecrire(Map<String,Integer> data, String nature, OutputStream out) { //public void ecrire(Map<String,Double> data, ...) ERREUR
        Element racine = new Element("catalogue"); //Element racine = nex Element("catalogue"); ERREUR
        racine.setAttribute("genre", nature);

        for (Map.Entry<String,Integer> e : data.entrySet()) { //for (Map.Entry<Sting,Double> e : data.entrySet())
            Element enfant = new Element("livre");
            enfant.setAttribute("titre", e.getKey()); //enfant.setAttribute("titre", e.getkey()); ERREUR
            enfant.setAttribute("annee", "" + e.getValue());
            racine.addContent(enfant); //racine.addContent(enfant): ERREUR
        }
        Document doc = new Document(racine, new DocType("catalogue", "catalogue.dtd"));
        XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
        try { sortie.output(doc, out); }
        catch (IOException ex) { ex.printStackTrace(); } //catch (IOEception ex { ex.printStackTrace(); } ERREUR
    }
}
// EREUR : Oublie du main.
public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> livres = new HashMap<>();
        livres.put("1984", 1949);
        livres.put("Le Petit Prince", 1943);

        CatalogueXML gen = new CatalogueXML();
        gen.ecrire(livres, "science-fiction", System.out);
    }
}