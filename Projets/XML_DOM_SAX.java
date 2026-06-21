import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;
import java.io.File;

public class CompteurVoitures extends DefaultHandler {

    private int compteur = 0;  // juste UN compteur

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) {
        if (qName.equals("voiture")) {
            compteur++;  // +1 à chaque <voiture>
        }
    }

    public int getCompteur() {
        return compteur;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {

        CompteurVoitures handler = new CompteurVoitures();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("voitures.xml"), handler);

        System.out.println("Nombre de voitures : " + handler.getCompteur());
    }
}