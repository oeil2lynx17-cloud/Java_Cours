# 📘 Lesson_12 — Les classes et les objets

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Classe** | Le plan / le moule — décrit à quoi ressemble un objet |
| **Objet** | Ce qu'on fabrique à partir de la classe |
| **Attribut** | Une caractéristique (marque, couleur...) |
| **Méthode** | Une action (démarrer, accélérer...) |
| `new` | Crée un nouvel objet à partir de la classe |
| `.` (point) | Accède à un attribut ou une méthode de l'objet |

---

## 🎂 L'analogie du moule à gâteau

```
Le moule    →   la classe
Le gâteau   →   l'objet
```

👉 Un seul moule (classe) → autant de gâteaux (objets) que tu veux.
👉 Chaque gâteau peut être différent, mais ils ont la même forme.

---

## 📊 Schéma — une Voiture

```
CLASSE Voiture
├── Attributs
│   ├── marque
│   ├── couleur
│   └── vitesse
└── Méthodes
    ├── demarrer()
    └── accelerer()
```

---

## 💻 Créer une classe

```java
public class Voiture {

    // Les attributs
    String marque;
    String couleur;
    int vitesse;

    // Une méthode
    void demarrer() {
        System.out.println(marque + " démarre !");
    }
}
```

---

## 💻 Créer et utiliser un objet

```java
public class Main {
    public static void main(String[] args) {

        // Créer un objet à partir de la classe
        Voiture v = new Voiture();

        // Remplir ses attributs (avec le point)
        v.marque = "Renault";
        v.couleur = "Bleue";
        v.vitesse = 180;

        // Appeler une méthode
        v.demarrer();
    }
}
```

Résultat :
```
Renault démarre !
```

---

## ⚠️ Règles importantes

```
1. Nom de classe → toujours une Majuscule (Voiture, Personne)
2. new → obligatoire pour créer un objet
3. Le point . → pour accéder aux attributs et méthodes
4. Attribut = caractéristique  /  Méthode = action
```

---

## ✅ Validé le

Leçon 12 — Classes et objets — Validée ✅
