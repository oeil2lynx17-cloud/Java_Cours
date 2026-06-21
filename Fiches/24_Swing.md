# 📘 Lesson_24 — Swing (Interface graphique)

> 🎯 Sujet **présent à chaque examen CNAM**. Connaître la structure type = répondre à coup sûr.

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Swing** | Bibliothèque Java pour créer des fenêtres graphiques |
| **Composant** | Un élément de l'interface (bouton, champ…) |
| **Layout** | La façon de placer les composants |
| **ActionListener** | Le code qui réagit quand on clique |

---

## 🧩 Les composants essentiels

| Composant | Rôle |
|---|---|
| `JFrame` | La fenêtre principale |
| `JPanel` | Un conteneur de composants |
| `JButton` | Un bouton cliquable |
| `JTextField` | Zone de saisie sur une ligne |
| `JTextArea` | Zone de saisie multi-lignes |
| `JLabel` | Texte non modifiable |

---

## 📐 Les layouts (placement)

| Layout | Rôle |
|---|---|
| `BorderLayout` | Nord / Sud / Est / Ouest / Centre |
| `FlowLayout` | Les uns à la suite des autres |
| `GridLayout(n, m)` | Grille de n lignes × m colonnes |

---

## 🏗️ La structure type (à connaître par cœur)

```
1. Déclarer les composants (attributs)
2. Constructeur → récupérer le Container
3. BorderLayout principal
4. JPanel avec GridLayout ou FlowLayout
5. c.add(panneau, position)
6. ActionListeners
7. pack() et setVisible()
```

---

## 💻 Code de référence complet

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SaisirQuestionnaire {

    // 1. Déclarer les composants
    private JFrame fenetre = new JFrame("Saisie questionnaire");
    private JLabel labelId = new JLabel("Identifiant : ");
    private JLabel labelReponse = new JLabel("Réponse : ");
    private JTextField champId = new JTextField(20);
    private JTextField champReponse = new JTextField(20);
    private JButton boutonEnregistrer = new JButton("Enregistrer");
    private JButton boutonAnnuler = new JButton("Annuler");
    private JButton boutonQuitter = new JButton("Quitter");

    public SaisirQuestionnaire() {

        // 2. Récupérer le conteneur principal
        Container c = fenetre.getContentPane();
        c.setLayout(new BorderLayout());

        // 4. Le formulaire (GridLayout)
        JPanel formulaire = new JPanel(new GridLayout(2, 2));
        formulaire.add(labelId);
        formulaire.add(champId);
        formulaire.add(labelReponse);
        formulaire.add(champReponse);

        // Les boutons (FlowLayout)
        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(boutonEnregistrer);
        boutons.add(boutonAnnuler);
        boutons.add(boutonQuitter);

        // 5. Placement
        c.add(formulaire, BorderLayout.NORTH);
        c.add(boutons, BorderLayout.SOUTH);

        // 6. ActionListeners
        boutonQuitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fenetre.dispose();
            }
        });

        boutonAnnuler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                champId.setText("");
                champReponse.setText("");
            }
        });

        boutonEnregistrer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = champId.getText();
                System.out.println("Enregistré : " + id);
            }
        });

        // 7. Finalisation
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.pack();
        fenetre.setVisible(true);
    }

    public static void main(String[] args) {
        new SaisirQuestionnaire();
    }
}
```

---

## 🖱️ Le patron ActionListener (toujours pareil)

```java
bouton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // ce qui se passe au clic
    }
});
```

---

## 🛠️ Méthodes utiles

| Méthode | Rôle |
|---|---|
| `champ.getText()` | Lire le contenu d'un champ |
| `champ.setText("")` | Vider / modifier un champ |
| `fenetre.dispose()` | Fermer la fenêtre |
| `fenetre.pack()` | Ajuster la taille automatiquement |
| `fenetre.setVisible(true)` | Afficher la fenêtre |

---

## ⚠️ Règles & pièges

```
1. import javax.swing.* / java.awt.* / java.awt.event.*  → en haut
2. getText() renvoie un String → convertir si besoin (Double.parseDouble)
3. Bien fermer les accolades des ActionListener : }  });
4. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) → la croix ferme le programme
5. pack() et setVisible() → TOUJOURS à la fin du constructeur
```

---

## ✅ Validé le

Leçon 24 — Swing — Validée ✅
