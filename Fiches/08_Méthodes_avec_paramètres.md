# 📘 Lesson_08 — Les méthodes avec paramètres

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Paramètre** | Une valeur donnée à une méthode pour qu'elle travaille avec |
| **Argument** | La valeur concrète passée lors de l'appel |
| **Type du paramètre** | Le type de valeur attendu (int, String, double...) |

---

## 🥤 L'analogie du distributeur

```
Méthode sans paramètre  →  distributeur qui donne toujours la même boisson
Méthode avec paramètre  →  distributeur où tu choisis ta boisson
```

Tu donnes quelque chose **en entrée** → la méthode travaille avec.

---

## 💻 Méthode sans vs avec paramètre

```java
// Sans paramètre — toujours pareil
static void direBonjour() {
    System.out.println("Bonjour !");
}

// Avec paramètre — flexible
static void direBonjour(String prenom) {
    System.out.println("Bonjour " + prenom + " !");
}
```

---

## 💻 Plusieurs paramètres

```java
static void presenterPersonne(String prenom, int age) {
    System.out.println("Je m'appelle " + prenom + " et j'ai " + age + " ans.");
}

// Appel :
presenterPersonne("Dominique", 50);
```

---

## 💻 Code de référence

```java
public class Ville {

    static void afficherVille(String ville) {
        System.out.println("Je vis à " + ville + ".");
    }

    public static void main(String[] args) {
        afficherVille("Figeac");
        afficherVille("Paris");
        afficherVille("Toulouse");
    }
}
```

Résultat :
```
Je vis à Figeac.
Je vis à Paris.
Je vis à Toulouse.
```

---

## 🔑 Règle essentielle

```
Le paramètre EST la variable.
On ne la redéclare JAMAIS à l'intérieur.

✅ static void afficherVille(String ville) {
       System.out.println("Je vis à " + ville);
       // ville est déjà disponible — pas besoin de String ville = "..."
   }
```

---

## ❌ Erreurs classiques

```java
// ❌ Redéclaration inutile du paramètre
static void afficherVille(String ville) {
    String ville = "Figeac";  // ERREUR — ville existe déjà !
}

// ❌ Mauvais type dans l'appel
afficherAge("vingt");  // attend int, reçoit String

// ✅ Correct
afficherAge(20);

// ❌ Appel sans argument
calculerTotal();       // attend 2 int

// ✅ Correct
calculerTotal(20, 6);
```

---

## ✅ Validé le

Leçon 8 — Méthodes avec paramètres — Validée ✅
