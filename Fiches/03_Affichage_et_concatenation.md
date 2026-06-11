# 📘 Lesson_03 — Affichage et concaténation

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Concaténation** | Assembler des morceaux de texte et de variables ensemble |
| **+** | Le symbole qui colle les morceaux (comme un crochet entre wagons) |
| **Case sensitive** | Java distingue majuscules et minuscules — `pays` ≠ `Pays` |

---

## 🚂 L'analogie des wagons

```
"Bonjour "   +   prenom   +   " tu as "   +   age   +   " ans."
 wagon 1         wagon 2       wagon 3         wagon 4    wagon 5
```

Le `+` est le crochet qui relie les wagons.

---

## 💻 Code de référence

```java
public class Affichage {
    public static void main(String[] args) {

        String nomAnimal = "Rex";
        int ageAnimal = 3;

        System.out.println("Mon animal s'appelle " + nomAnimal + " et il a " + ageAnimal + " ans.");
    }
}
```

### Résultat à l'écran
```
Mon animal s'appelle Rex et il a 3 ans.
```

---

## 🔍 Anatomie d'une concaténation

```java
System.out.println("Bonjour, je m'appelle " + prenom + " et j'ai " + age + " ans.");
```

| Morceau | Type | Rôle |
|---|---|---|
| `"Bonjour, je m'appelle "` | Texte fixe | Toujours pareil |
| `+` | Opérateur | Colle les morceaux |
| `prenom` | Variable | Valeur qui peut changer |
| `" et j'ai "` | Texte fixe | Attention aux espaces ! |
| `age` | Variable | Valeur numérique |
| `" ans."` | Texte fixe | Fin de phrase |

---

## ⚠️ Pièges classiques

```java
// ❌ Oubli du ; en fin de ligne
String pays = "France"

// ✅ Correct
String pays = "France";

// ❌ Majuscule incorrecte sur la variable
System.out.println("Je vis en " + Pays);

// ✅ Correct — respecte la casse
System.out.println("Je vis en " + pays);

// ❌ Oubli des espaces dans le texte fixe
System.out.println("Je m'appelle" + prenom);
// Résultat : Je m'appelleLucas (pas d'espace avant Lucas !)

// ✅ Correct — espace avant le guillemet fermant
System.out.println("Je m'appelle " + prenom);
// Résultat : Je m'appelle Lucas
```

---

## 🧠 Règles à retenir

```
Règle 1 → + colle du texte ET des variables
Règle 2 → Java est case sensitive : pays ≠ Pays ≠ PAYS
Règle 3 → Attention aux espaces dans les textes fixes
Règle 4 → Chaque ligne se termine par ;
Règle 5 → Nomme tes variables selon ce qu'elles contiennent
```

---

## ✅ Validé le

Leçon 3 — Affichage et concaténation — 5/5 ✅
