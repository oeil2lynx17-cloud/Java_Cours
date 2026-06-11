# 📘 Lesson_09 — Les méthodes avec retour (return)

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| `return` | Retourne une valeur à celui qui a appelé la méthode |
| `void` | La méthode ne retourne rien |
| `int` | La méthode retourne un entier |
| `boolean` | La méthode retourne vrai ou faux |
| `double` | La méthode retourne un décimal |

---

## 🧮 L'analogie de la calculette

```
Tu donnes 5 + 3 à la calculette
→ Elle te REND 8
→ Tu fais ce que tu veux avec ce résultat
```

C'est exactement ce que fait `return` : la méthode **rend** une valeur au lieu de l'afficher elle-même.

---

## 💻 void vs int — la différence clé

| | `void` | `int` |
|---|---|---|
| Signification | Ne retourne rien | Retourne un entier |
| Utilise `return` ? | ❌ Non | ✅ Oui |
| Exemple | `static void afficher()` | `static int calculer()` |

---

## 🔑 Règle essentielle

```
Le type avant le nom de la méthode
= le type de ce que return renvoie

static boolean estMajeur  →  return true ou false
static int additionner    →  return un entier
static double calculer    →  return un décimal
static void afficher      →  pas de return
```

---

## 💻 Code de référence

```java
public class Retour {

    static int additionner(int a, int b) {
        return a + b;
    }

    static boolean estMajeur(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int resultat = additionner(5, 3);
        System.out.println("Résultat : " + resultat);

        boolean r1 = estMajeur(15);
        boolean r2 = estMajeur(20);
        System.out.println(r1);
        System.out.println(r2);
    }
}
```

Résultat :
```
Résultat : 8
false
true
```

---

## ❌ Erreurs classiques

```java
// ❌ Méthode int sans return
static int calculer(int a, int b) {
    int resultat = a + b;
    // manque return resultat;
}

// ✅ Correct
static int calculer(int a, int b) {
    int resultat = a + b;
    return resultat;
}

// ❌ Stocker un boolean dans un int
int r1 = estMajeur(15);

// ✅ Correct
boolean r1 = estMajeur(15);

// ❌ Appel sans récupérer le résultat
calculer(5, 3);

// ✅ Correct
int r1 = calculer(5, 3);
```

---

## 📊 Tableau récapitulatif

| Type retour | Mot clé | Exemple return |
|---|---|---|
| Rien | `void` | pas de return |
| Entier | `int` | `return 42;` |
| Décimal | `double` | `return 3.14;` |
| Vrai/Faux | `boolean` | `return true;` |
| Texte | `String` | `return "Bonjour";` |

---

## ✅ Validé le

Leçon 9 — Méthodes avec retour — Validée ✅
