# 📕 Fiche de révision — NFP121

> 🎯 Synthèse spéciale examen : Swing · XML (écriture/lecture) · Introspection · POO. Avec tes pièges réels et les questions de cours.

---

# 🪟 FICHE 1 — SWING (interfaces graphiques)

## 🏗️ Squelette structure (toujours pareil)

```java
public MaFenetre() {
    Container c = fenetre.getContentPane();
    c.setLayout(new BorderLayout());

    JPanel formulaire = new JPanel(new GridLayout(1, 2));
    formulaire.add(labelX);
    formulaire.add(champX);

    JPanel boutons = new JPanel(new FlowLayout());
    boutons.add(boutonY);

    c.add(formulaire, BorderLayout.NORTH);
    c.add(boutons, BorderLayout.SOUTH);

    boutonY.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // ← LOGIQUE ICI, voir exemple ci-dessous
        }
    });

    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.pack();
    fenetre.setVisible(true);
}
```

## 💻 Exemple RÉEL de logique (combine Swing + Composite)

```java
public class TacheSwing {

    private TacheComplexe tacheProjet;            // attribut = paramètre reçu

    public TacheSwing(TacheComplexe tacheProjet) {
        this.tacheProjet = tacheProjet;           // ← stocker le paramètre
        ...
        boutonAjouter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = champNom.getText();
                int cout = Integer.parseInt(champCout.getText());     // texte → nombre
                tacheProjet.ajouter(new TacheElementaire(nom, cout)); // créer + ajouter
            }
        });

        boutonAfficher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Coût total : " + tacheProjet.getCout());
            }
        });
    }

    public static void main(String[] a) {
        TacheComplexe projet = new TacheComplexe("Mon projet"); // créer AVANT
        new TacheSwing(projet);                                 // ← passer en paramètre
    }
}
```

## 📐 Layouts + conversion texte → nombre

- **BorderLayout** : NORTH / SOUTH / EAST / WEST / CENTER
- **FlowLayout** : à la suite (boutons) — **GridLayout(l, c)** : grille
- `getText()` → String ; `Integer.parseInt()` / `Double.parseDouble()` → nombre
- `setText("")` vide le champ — `fenetre.dispose()` ferme la fenêtre

## ⚠️ MES ERREURS RÉELLES

- Classe jamais ouverte (`public class` / constructeur `{` manquant) — attribut utilisé sans être déclaré (`this.x`)
- Copier-coller d'un exercice précédent qui traîne (nom de bouton/variable) — casse incohérente (`labelCout` ≠ `labelcout`)
- Mauvais type dans le `for` : `List<Tache>` → `for (Tache t : ...)` — le `main()` doit créer l'objet AVANT de le passer en paramètre

## 📖 Questions de cours — Swing

> **Q : Rôle d'ActionListener / ActionEvent / addActionListener / actionPerformed ?**
> → `ActionListener` = interface implémentée pour réagir à un clic. `ActionEvent` = décrit l'événement. `addActionListener` = abonne le listener au bouton. `actionPerformed` = appelée automatiquement au clic.

> **Q : 3 patrons de conception utilisés dans Swing ?**
> → **Observateur** (ActionListener écoute le bouton), **Composite** (JPanel contient d'autres composants), **Décorateur** (JScrollPane ajoute un ascenseur).

---

# 📄 FICHE 2 — XML : ÉCRITURE (JDom) + DTD

## 💻 Écrire un fichier XML avec JDom — pattern complet

```java
import org.jdom.*;
import org.jdom.output.*;
import java.io.*;
import java.util.*;

public class GenerateurXML {
    public void ecrire(Map<String, Double> data, String nature, OutputStream out) {

        Element racine = new Element("racine");       // <racine>
        racine.setAttribute("nature", nature);        // attribut

        for (Map.Entry<String, Double> e : data.entrySet()) {
            Element enfant = new Element("item");
            enfant.setAttribute("nom", e.getKey());
            enfant.setAttribute("valeur", "" + e.getValue());
            // OU contenu texte : enfant.setText("" + e.getValue());
            racine.addContent(enfant);
        }

        Document doc = new Document(racine, new DocType("racine", "racine.dtd"));
        XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
        try { sortie.output(doc, out); }
        catch (IOException ex) { ex.printStackTrace(); }
    }
}
```

> 🟥 À adapter à l'énoncé = les **noms de balises/attributs**. Les 4 étapes (**Element → setAttribute → addContent → Document + XMLOutputter**) ne changent jamais.

## 🗺️ Map<String, Double> data — RAPPEL

- `data.put("Ferrari", 320.0)` → on remplit le tiroir AVANT d'appeler `ecrire()`
- `entry.getKey()` → la clé / `entry.getValue()` → la valeur (la boucle lit automatiquement)

## 📋 DTD — règles essentielles

- `ELEMENT a (b*)` : a contient 0..n b
- `ELEMENT a (b+)` : a contient 1..n b
- `ELEMENT a (b?)` : a contient 0..1 b
- `ELEMENT a (b|c)` : a contient b OU c
- `ELEMENT a EMPTY` : a sans contenu (attributs seuls)
- `ELEMENT a (#PCDATA)` : a contient du texte
- `ATTLIST a x ID #REQUIRED` : x identifiant unique obligatoire
- `ATTLIST a x CDATA #IMPLIED` : x texte optionnel

## ⚖️ Bien formé vs Valide

- **Bien formé** = respecte la syntaxe XML (balises fermées, attributs entre guillemets, 1 seule racine)
- **Valide** = bien formé **+** respecte une DTD donnée (structure, attributs requis...)

## 💻 DTD exemple complet

```dtd
<!ELEMENT voitures (voiture*)>
<!ELEMENT voiture EMPTY>
<!ATTLIST voiture marque  CDATA #REQUIRED
                  vitesse CDATA #REQUIRED>
```

## ⚠️ MES ERREURS RÉELLES — checklist avant de rendre

- Type générique cohérent PARTOUT : si `Map<String,Integer>`, alors `Map.Entry<String,Integer>` aussi (pas de Double mélangé)
- `e.getKey()` / `e.getValue()` : vérifier la casse exacte (K et V majuscules, pas `getkey()`)
- `new Element(...)` : `new`, pas une faute de frappe — relire le mot entier
- `;` en fin de ligne, pas `:` — erreur de frappe fréquente sous pression
- `IOException` : nom exact, pas de lettre oubliée/ajoutée
- Les données (`.put(...)`) vont dans le `main()`, JAMAIS dans la classe Generateur elle-même

## 📖 Questions de cours — XML / Map

> **Q : Intérêt d'utiliser un Map plutôt qu'une Collection pour stocker des données nommées ?**
> → Map associe une clé unique à une valeur → accès direct par nom (`get(clé)`) sans parcourir toute la liste, contrairement à une Collection.

> **Q : ID, CDATA, EMPTY, | dans une DTD ?**
> → **ID** = identifiant unique (comme une clé primaire). **CDATA** = texte libre. **EMPTY** = élément sans contenu (attributs seuls). **|** = choix entre plusieurs éléments (OU).

> **Q : Intérêt d'utiliser OutputStream plutôt que directement un fichier ?**
> → `OutputStream` est une abstraction : la méthode peut écrire vers un fichier, la console, un réseau... sans dépendre d'un type précis (souplesse / réutilisabilité).

---

# 🔍 FICHE 3 — XML : LECTURE (SAX) + INTROSPECTION

## 💻 Lire un fichier XML avec SAX — pattern complet

```java
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;
import java.io.File;

public class MonHandler extends DefaultHandler {

    private int compteur = 0;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("voiture")) {
            compteur++;
            String marque = attributes.getValue("marque"); // lire attribut
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        // appelé à chaque fermeture de balise
    }

    public int getCompteur() { return compteur; }
}

// Lancer le parsing (3 lignes magiques) :
SAXParserFactory factory = SAXParserFactory.newInstance();
SAXParser parser = factory.newSAXParser();
parser.parse(new File("fichier.xml"), new MonHandler());
```

> 🟥 À adapter = le **nom de balise/attribut** cherché + le **nom du handler**. La structure `startElement` / `endElement` ne change jamais.

## 💻 Compter un niveau d'imbrication max

```java
private int niveau = 0, max = 0;

public void startElement(...) {
    if (qName.equals("tache")) {
        niveau++;
        if (niveau > max) max = niveau;
    }
}

public void endElement(...) {
    if (qName.equals("tache")) niveau--;
}
```

## 💻 Introspection — pattern complet

```java
import java.lang.reflect.*;

Class<?> c = Class.forName(nomClasse);   // ou objet.getClass()

// Lister les attributs
Field[] attributs = c.getDeclaredFields();
for (Field f : attributs) {
    System.out.println(f.getName());
}

// Lister les méthodes
Method[] methodes = c.getDeclaredMethods();
for (Method m : methodes) {
    boolean estStatic = Modifier.isStatic(m.getModifiers());
    boolean estPublic = Modifier.isPublic(m.getModifiers());
    Class<?> retour = m.getReturnType();        // type de retour
    Class<?>[] params = m.getParameterTypes();  // types des paramètres
}
```

## 🛠️ Modifier — méthodes utiles

- `Modifier.isStatic(m.getModifiers())` / `isPrivate` / `isPublic` / `isFinal` / `isAbstract`
- `c.getName()` = nom complet (`java.lang.String`) / `c.getSimpleName()` = nom court (`String`)

## ⚠️ MES ERREURS RÉELLES — checklist avant de rendre

- `qName.equals("voiture")` : le nom entre guillemets = nom de BALISE seul, jamais balise + attribut
- Import manquant si `Attributes` utilisé : il faut `import org.xml.sax.*;` (pas que `.helpers.*`)
- Les 3 lignes du parsing toujours dans cet ordre : Factory → Parser → `parser.parse(fichier, handler)`

## 📖 Questions de cours — généricité / réflexion

> **Q : Pourquoi `Collection<? extends X>` plutôt que `Collection<X>` en paramètre ?**
> → `? extends X` accepte aussi les sous-types de X (plus souple en **LECTURE**) ; `Collection<X>` exige le type exact.

> **Q : Pourquoi `Collection<? super X>` en paramètre ?**
> → `? super X` accepte X ou tout type parent (plus souple en **ÉCRITURE** : on peut y ajouter des X en sécurité).

> **Q : ClassCastException sur une Collection : qu'est-ce que ça signifie ?**
> → On a tenté d'insérer un élément d'un type incompatible avec le type attendu (ex : Double dans une `Collection<Integer>`).

---

# 🧱 FICHE 4 — POO / COLLECTIONS / EXCEPTIONS / JUNIT / COMPOSITE

## 💻 Composite — pattern complet (interface commune)

```java
public interface Tache {
    String getNom();
    int getCout();
}

public class TacheElementaire implements Tache {
    private String nom;
    private int cout;
    public TacheElementaire(String n, int c) { nom = n; cout = c; }
    public String getNom() { return nom; }
    public int getCout()   { return cout; }
}

public class TacheComplexe implements Tache {
    private String nom;
    private List<Tache> sousTaches = new ArrayList<>();
    public TacheComplexe(String n) { nom = n; }
    public void ajouter(Tache t) { sousTaches.add(t); }
    public String getNom() { return nom; }
    public int getCout() {
        int total = 0;
        for (Tache t : sousTaches) total += t.getCout();
        return total;
    }
}
```

> 🟥 À adapter = les **noms** (interface / classes / méthode de calcul). La boucle de sommation ne change jamais.

## 🧬 Héritage / Interface — rappels

- `class Chien extends Animal` : hérite (1 seule classe)
- `super(args)` : appelle le constructeur parent, en 1ère ligne
- `class X implements I1, I2` : plusieurs interfaces possibles
- Méthode d'interface implémentée → toujours `public`
- `@Override` : signale qu'on redéfinit une méthode
- `this.attribut = parametre` : distingue attribut / paramètre

## 🛒 Collections — ArrayList / Map

```java
ArrayList<String> liste = new ArrayList<>();
liste.add("x");
liste.get(0);

Map<String, Double> map = new HashMap<>();
map.put("cle", 1.0);
for (Map.Entry<String, Double> e : map.entrySet()) {
    e.getKey();
    e.getValue();
}
```

## 🚗💥 Exceptions — try / catch / finally

```java
try {
    int r = 100 / n;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("Toujours exécuté");
}

// Exception perso :
// public class MonException extends RuntimeException {
//     public MonException(String msg) { super(msg); }
// }
```

## 🧪 JUnit — tests

```java
import org.junit.*;
import static org.junit.Assert.*;

@Test
public void testAdd() {
    assertEquals(5, calc.add(2, 3));
    assertEquals(3.3, calc.div(10, 3), 0.01); // tolérance pour double
}

@Test(expected = MonException.class)
public void testErreur() {
    obj.methodeQuiDoitLever();
}
```

## 🔁 Surcharge & Généricité — l'essentiel

- **Surcharge** : même nom, paramètres différents → Java choisit selon le type donné
- **Générique<T>** : T remplacé par le vrai type à l'utilisation : `Boite<String>`, `Boite<Integer>`

## ⚠️ MES ERREURS RÉELLES — checklist avant de rendre

- JAMAIS 2 fois le même nom (1 interface `Tache` + 1 classe `Tache` = impossible, choisir un seul rôle par nom)
- `List<Tache> sousTaches` → la boucle for doit utiliser EXACTEMENT `for (Tache t : sousTaches)`, pas un autre type
- `ajouter(Tache t)` : le type du paramètre = le type générique de la liste, toujours cohérent

## 📖 Questions de cours — bases POO

> **Q : Égalité logique vs égalité physique en Java ?**
> → **Physique** (`==`) : compare si 2 références pointent le MÊME objet en mémoire. **Logique** (`.equals()`) : compare si 2 objets ont un CONTENU équivalent, même s'ils sont différents en mémoire.

> **Q : Que signifient `public`, `static`, `final` sur un attribut ?**
> → `public` = accessible de partout. `static` = appartient à la CLASSE, pas à une instance (1 seul exemplaire partagé). `final` = la référence ne peut plus être réaffectée après initialisation.

> **Q : Si `p` est une référence non-nulle de type interface `I` (avec méthode `m()`), pourquoi `p.m()` a-t-il toujours un sens ?**
> → Java garantit qu'un objet assigné à une variable d'interface implémente forcément cette interface (vérifié à la compilation) → une classe concrète fournit le code réel exécuté (liaison dynamique).

---

## ✅ Fiche de révision NFP121 — prête pour l'examen 🎓
