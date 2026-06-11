# 📘 Lesson_04 — Les opérations mathématiques

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Opérateur** | Un symbole qui fait un calcul (`+`, `-`, `*`, `/`, `%`) |
| **Modulo** | Le reste d'une division (symbole `%`) |
| **Division entière** | Division entre `int` qui coupe la virgule |

---

## ➗ Les 5 opérateurs mathématiques

| Symbole | Opération | Exemple | Résultat |
|---|---|---|---|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Soustraction | `10 - 4` | `6` |
| `*` | Multiplication | `3 * 4` | `12` |
| `/` | Division | `10 / 2` | `5` |
| `%` | Modulo (reste) | `10 % 3` | `1` |

👉 Le `%` donne le **reste** d'une division.
Exemple : `10 % 3` → 10 divisé par 3 = 3 fois, **reste 1**. Donc `10 % 3 = 1`.

---

## 💻 Code de référence

```java
public class Calculs {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int addition       = a + b;
        int soustraction   = a - b;
        int multiplication = a * b;
        int division       = a / b;
        int modulo         = a % b;

        System.out.println("Addition : "       + addition);
        System.out.println("Soustraction : "   + soustraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division : "       + division);
        System.out.println("Modulo : "         + modulo);
    }
}
```

---

## ▶️ Exécution mentale

```
a = 10, b = 3

addition       = 10 + 3  = 13
soustraction   = 10 - 3  = 7
multiplication = 10 * 3  = 30
division       = 10 / 3  = 3   ← attention ! (pas 3.33)
modulo         = 10 % 3  = 1
```

---

## ⚠️ Attention à la division entière !

`10 / 3` en Java avec des `int` donne `3`, **pas** `3.33`.
Java coupe la virgule. On appelle ça la **division entière**.

👉 Pour obtenir `3.33`, il faut utiliser des `double` :
```java
double division = 10.0 / 3.0;   // → 3.333...
```

---

## 🧹 Bonne pratique — code lisible

```java
// ✅ Lisible et professionnel
int total = prix * quantite;
System.out.println("Total : " + total);
```

Calcule d'abord dans une variable claire, puis affiche-la.
C'est plus lisible que de tout faire sur une seule ligne.

---

## ✅ Validé le

Leçon 4 — Opérations mathématiques — Validée ✅
