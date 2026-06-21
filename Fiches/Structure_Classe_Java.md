# 📘 Fiche — Structure d'une classe Java

> 🧭 Le plan pour savoir **où ranger chaque chose** quand tu écris une classe.

---

## 🗺️ L'ordre général (du haut vers le bas)

```
1. IMPORTS              ← tout en haut, AVANT la classe
2. class Nom {
3.    ├── ATTRIBUTS     ← les données
4.    ├── CONSTRUCTEUR  ← qui remplit les données
5.    └── MÉTHODES      ← les actions
   }
```

> 💡 Moyen mnémotechnique à l'intérieur de la classe : **A → C → M**
> (**A**ttributs, **C**onstructeur, **M**éthodes)

---

## 💻 Le squelette annoté

```java
// 1️⃣ LES IMPORTS — tout en haut, avant la classe
import java.util.Scanner;

// 2️⃣ LA CLASSE (Majuscule au nom !)
public class Voiture {

    // 3️⃣ LES ATTRIBUTS — juste après l'accolade ouvrante
    String marque;
    String couleur;
    int vitesse;

    // 4️⃣ LE CONSTRUCTEUR — après les attributs
    Voiture(String marque, String couleur, int vitesse) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = vitesse;
    }

    // 5️⃣ LES MÉTHODES — après le constructeur
    void afficher() {
        System.out.println(marque + " - " + couleur + " - " + vitesse);
    }

}
```

---

## 🏠 Où va le `main` ?

En général, dans une **classe `Main` séparée**, qui sert à **utiliser** les autres classes.

```java
public class Main {
    public static void main(String[] args) {
        Voiture v = new Voiture("Ferrari", "Rouge", 320);
        v.afficher();
    }
}
```

| Type de classe | Contient |
|---|---|
| Classe « données » (`Voiture`, `Personne`…) | Attributs + Constructeur + Méthodes |
| Classe `Main` | Juste le `main` qui crée et utilise les objets |

---

## 🧬 Cas particuliers (héritage / interface)

```java
// Hériter d'une classe
public class Chien extends Animal {
    ...
}

// Signer un contrat (interface)
public class Aigle extends Animal implements Volatile {
    ...
}
```

👉 `extends` et `implements` se mettent **sur la ligne de la classe**.
👉 Dans un constructeur d'enfant, `super(...)` est **toujours en première ligne**.

---

## ⚠️ Règles d'or

```
1. IMPORTS toujours tout en haut (avant la classe)
2. Nom de classe → Majuscule (Voiture, Personne)
3. Ordre interne : Attributs → Constructeur → Méthodes
4. 1 seule classe public par fichier (même nom que le fichier)
5. Le main → souvent dans une classe Main à part
```

---

## ❌ Erreurs classiques

```java
// ❌ import après la classe
public class Voiture { }
import java.util.Scanner;   // trop tard !

// ✅ import avant la classe
import java.util.Scanner;
public class Voiture { }

// ❌ constructeur avant les attributs (désordre)
public class Voiture {
    Voiture(...) { ... }
    String marque;          // les attributs devraient être au-dessus
}

// ✅ attributs d'abord
public class Voiture {
    String marque;
    Voiture(...) { ... }
}
```

---

## 🧠 À retenir

> Une classe se lit comme une fiche d'identité :
> **ce qu'elle EST** (attributs) → **comment on la crée** (constructeur) → **ce qu'elle SAIT FAIRE** (méthodes).
