# 📘 Lesson_25 — Les patrons de conception

> 🎯 Dernier sujet du parcours. Tombe régulièrement à l'examen CNAM (souvent Composite ou Visiteur).

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Patron de conception** | Une solution réutilisable à un problème de code récurrent |
| **Composite** | Traiter un élément simple et un groupe d'éléments de la même façon |
| **Visiteur** | Ajouter des opérations sur des objets sans modifier leurs classes |

---

## 📊 Les patrons fréquents au CNAM

| Patron | Années | Fréquence |
|---|---|---|
| **Composite** | 2008, 2013 | ⭐⭐⭐ |
| **Décorateur** | 2016 | ⭐⭐ |
| **Visiteur** | 2012, 2013 | ⭐⭐ |
| **Itérateur** | 2017 | ⭐⭐ |

---

# 🌳 1) Patron COMPOSITE

## 📁 L'analogie du dossier

```
Un dossier contient :
 ├── des fichiers  (éléments simples)
 └── d'autres dossiers (qui contiennent des fichiers)
```

👉 On manipule **un fichier** et **un dossier entier** de la **même façon**.

## 💻 Code de référence (annale 2008 — tâches)

```java
// L'interface commune
public interface Tache {
    String getNom();
    int getCout();
}

// Élément simple
public class TacheElementaire implements Tache {
    private String nom;
    private int cout;

    public TacheElementaire(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }

    public String getNom() { return nom; }
    public int getCout()   { return cout; }
}

// Élément composite — contient d'autres tâches
public class TacheComplexe implements Tache {
    private String nom;
    private List<Tache> sousTaches = new ArrayList<>();

    public TacheComplexe(String nom) {
        this.nom = nom;
    }

    public void ajouter(Tache t) {
        sousTaches.add(t);
    }

    public String getNom() { return nom; }

    // Le coût = somme des coûts des sous-tâches
    public int getCout() {
        int total = 0;
        for (Tache t : sousTaches) {
            total += t.getCout();
        }
        return total;
    }
}
```

## 💻 Utilisation (dans une classe Main séparée !)

```java
public class Main {
    public static void main(String[] args) {
        TacheComplexe tA = new TacheComplexe("A");
        tA.ajouter(new TacheElementaire("A1", 10));
        tA.ajouter(new TacheElementaire("A2", 20));
        System.out.println(tA.getCout()); // 30
    }
}
```

## 🎯 L'intérêt (formulation pour l'examen)

> *Le Composite permet de manipuler un objet simple et un groupe d'objets de façon identique (via une interface commune), sans que le code appelant ait besoin de distinguer les deux cas.*

---

# 🕵️ 2) Patron VISITEUR

## 👀 L'analogie de l'inspecteur

```
L'inspecteur visite des maisons.
 → chaque maison l'accueille : accept(visiteur)
 → l'inspecteur fait son travail : visit(maison)
```

👉 On ajoute une **nouvelle opération** sans toucher aux classes existantes.

## 💻 Structure de référence

```java
// Interface Visiteur
public interface Visiteur {
    void visiter(TacheElementaire te);
    void visiter(TacheComplexe tc);
}

// L'interface des éléments ajoute accept()
public interface Tache {
    void accept(Visiteur v);
    String getNom();
    int getCout();
}

// Chaque élément accepte le visiteur
public class TacheElementaire implements Tache {
    public void accept(Visiteur v) {
        v.visiter(this);
    }
    // ... reste de la classe
}

// Un visiteur concret
public class AfficheurTache implements Visiteur {
    public void visiter(TacheElementaire te) {
        System.out.println("Tâche : " + te.getNom() + " coût : " + te.getCout());
    }
    public void visiter(TacheComplexe tc) {
        System.out.println("Tâche complexe : " + tc.getNom());
    }
}
```

## 🎯 L'intérêt

> Ajouter de nouvelles opérations (afficher, calculer…) **sans modifier** les classes visitées. On crée juste un nouveau Visiteur.

---

## ⚠️ Erreurs classiques

```java
// ❌ Mettre la classe Main À L'INTÉRIEUR d'une autre classe
public class TacheComplexe implements Tache {
    ...
    public class Main { ... }   // imbriquée → faux !
}

// ✅ Main dans son propre fichier / sa propre classe

// ❌ Du code après un return (jamais exécuté)
return total;
TacheComplexe tA = new TacheComplexe("A");  // mort !
```

---

## ✅ Validé le

Leçon 25 — Patrons de conception — Validée ✅
