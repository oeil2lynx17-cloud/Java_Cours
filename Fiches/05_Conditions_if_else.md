# 📘 Lesson_05 — Les conditions (if / else)

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Condition** | Une question à laquelle Java répond par vrai ou faux |
| `if` | "Si" — exécute le bloc seulement si la condition est vraie |
| `else` | "Sinon" — exécute le bloc si la condition est fausse |
| **Bloc** | Le code entre `{ }` qui s'exécute selon la condition |

---

## 🌧️ L'analogie de la météo

```
SI il pleut
    → je prends mon parapluie
SINON
    → je laisse mon parapluie
```

En Java :
```java
if (ilPleut == true) {
    System.out.println("Je prends mon parapluie.");
} else {
    System.out.println("Je laisse mon parapluie.");
}
```

---

## 🧮 Les opérateurs de comparaison

| Symbole | Signification | Exemple |
|---|---|---|
| `==` | égal à | `age == 18` |
| `!=` | différent de | `age != 18` |
| `>` | supérieur à | `age > 18` |
| `<` | inférieur à | `age < 18` |
| `>=` | supérieur ou égal | `age >= 18` |
| `<=` | inférieur ou égal | `age <= 18` |

⚠️ **Attention !**
- `=` → on **assigne** une valeur (`int age = 18`)
- `==` → on **compare** deux valeurs (`age == 18`)

Ce sont deux choses totalement différentes.

---

## 💻 Code de référence

```java
public class Conditions {
    public static void main(String[] args) {

        int age = 15;

        if (age >= 18) {
            System.out.println("Tu es majeur.");
        } else {
            System.out.println("Tu es mineur.");
        }
    }
}
```

---

## 🔍 Explication ligne par ligne

```java
if (age >= 18) {
```
- `if` → "si"
- `(age >= 18)` → la condition à vérifier
- `{` → ouvre le bloc "si c'est vrai"

```java
    System.out.println("Tu es majeur.");
```
- S'exécute **seulement si** `age >= 18` est vrai

```java
} else {
```
- `}` → ferme le bloc "si c'est vrai"
- `else` → "sinon"
- `{` → ouvre le bloc "si c'est faux"

```java
    System.out.println("Tu es mineur.");
```
- S'exécute **seulement si** la condition est fausse

---

## ▶️ Exécution mentale

```
age = 15
→ Est-ce que 15 >= 18 ?  NON
→ On entre dans le bloc else
→ Affiche : "Tu es mineur."
```

Si `age = 20` :
```
→ Est-ce que 20 >= 18 ?  OUI
→ On entre dans le bloc if
→ Affiche : "Tu es majeur."
```

---

## 🧠 Règles à retenir

```
Règle 1 → if = "si", else = "sinon"
Règle 2 → = assigne, == compare
Règle 3 → La condition se met entre parenthèses ( )
Règle 4 → Chaque bloc se met entre accolades { }
```

---

## ✅ Validé le

Leçon 5 — Les conditions (if / else) — Validée ✅
