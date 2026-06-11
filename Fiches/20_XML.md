# 📘 Lesson_20 — XML

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **XML** | eXtensible Markup Language — format pour stocker et échanger des données |
| **Balise** | Étiquette qui entoure une donnée `<nom>...</nom>` |
| **Balise racine** | La balise principale qui contient tout |
| **DOM** | Document Object Model — lit XML en mémoire comme un arbre |
| **Élément** | Donnée entre balises `<nom>Chatelot</nom>` |
| **Attribut** | Donnée dans la balise `<personne nom="Chatelot"/>` |

---

## 📝 L'analogie du formulaire

```
Formulaire papier  →  XML
Nom : Chatelot     →  <nom>Chatelot</nom>
```

---

## 📋 Règles du XML

```
1. Chaque donnée a une balise ouvrante  <nom>
2. Chaque donnée a une balise fermante  </nom>
3. Les balises s'imbriquent
4. Il y a toujours UNE balise racine
5. L'entête est obligatoire
```

---

## 💻 Structure XML de référence

```xml
<?xml version="1.0" encoding="UTF-8"?>
<voitures>
    <voiture>
        <marque>Lamborghini</marque>
        <couleur>Jaune</couleur>
        <vitesse>320 km/h</vitesse>
    </voiture>
    <voiture>
        <marque>Ferrari</marque>
        <couleur>Rouge</couleur>
        <vitesse>350 km/h</vitesse>
    </voiture>
</voitures>
```

---

## 🌳 Schéma — comme un arbre

```
voitures              ← racine
├── voiture           ← nœud
│   ├── marque        ← feuille
│   ├── couleur       ← feuille
│   └── vitesse       ← feuille
└── voiture
    ├── marque
    ├── couleur
    └── vitesse
```

---

## 💻 Lire XML en Java

```java
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class LireXML {
    public static void main(String[] args) throws Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("voitures.xml");

        NodeList liste = doc.getElementsByTagName("voiture");

        for (int i = 0; i < liste.getLength(); i++) {
            Element voiture = (Element) liste.item(i);
            String marque  = voiture.getElementsByTagName("marque").item(0).getTextContent();
            String couleur = voiture.getElementsByTagName("couleur").item(0).getTextContent();
            String vitesse = voiture.getElementsByTagName("vitesse").item(0).getTextContent();
            System.out.println(marque + " - " + couleur + " - " + vitesse);
        }
    }
}
```

---

## 📊 Élément vs Attribut

```xml
<!-- Élément — donnée entre balises -->
<personne>
    <nom>Chatelot</nom>
</personne>

<!-- Attribut — donnée dans la balise -->
<personne nom="Chatelot"/>
```

| | Élément | Attribut |
|---|---|---|
| Lecture Java | `getTextContent()` | `getAttribute("nom")` |
| Usage | Données complexes | Données simples |

---

## 💻 Créer un fichier XML dans IntelliJ

```
1. Clic droit sur src
2. New → File
3. Nom : voitures.xml
4. Entrée
```

---

## ✅ Validé le

Leçon 20 — XML — Validée ✅
