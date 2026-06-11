# 📘 Lesson_07 — Les méthodes

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Méthode** | Un bloc d'instructions réutilisable |
| **Déclarer** | Écrire la méthode une fois |
| **Appeler** | Utiliser la méthode avec `nomMethode()` |
| `static` | La méthode appartient à la classe |
| `void` | La méthode ne retourne rien |
| **DRY** | Don't Repeat Yourself — n'écris le code qu'une fois |

---

## 🍝 L'analogie de la recette

```
Méthode    =  fiche recette
Déclarer   =  écrire la recette une fois
Appeler    =  sortir la fiche quand on veut cuisiner
```

---

## 💻 Structure d'une méthode

```java
static void nomDeLaMethode() {
    // instructions
}
```

| Mot | Signification |
|---|---|
| `static` | Appartient à la classe |
| `void` | Ne retourne rien |
| `nomDeLaMethode` | Le nom — commence par une minuscule |
| `()` | Parenthèses obligatoires |
| `{ }` | Bloc d'instructions |

---

## 💻 Code de référence

```java
public class Methodes {

    static void afficherMonNom() {
        System.out.println("Je m'appelle Dominique !");
    }

    public static void main(String[] args) {
        afficherMonNom();  // appel 1
        afficherMonNom();  // appel 2
        afficherMonNom();  // appel 3
    }
}
```

Résultat :
```
Je m'appelle Dominique !
Je m'appelle Dominique !
Je m'appelle Dominique !
```

---

## ⚠️ Règles sur les noms de méthodes

```
✅ direBonjour()     → commence par minuscule
✅ afficherMonNom()  → camelCase
❌ DireBonjour()     → majuscule interdite au début
❌ direBonjour      → parenthèses obligatoires
❌ direBonjour()    → point-virgule obligatoire à l'appel
```

---

## ❌ Erreurs classiques

```java
// ❌ Majuscule au début du nom
DireAuRevoir();

// ✅ Correct
direAuRevoir();

// ❌ Manque le ; après l'appel
direAuRevoir()

// ✅ Correct
direAuRevoir();
```

---

## ✅ Validé le

Leçon 7 — Les méthodes — 5/5 ✅
