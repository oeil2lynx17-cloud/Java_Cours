# 📘 Lesson_23 — La généricité

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Généricité** | Écrire une classe ou méthode qui marche avec n'importe quel type |
| `<T>` | Un type « à trous » (placeholder) que Java remplace |
| **T** | Convention pour « Type » |
| `ArrayList<String>` | Une ArrayList rendue générique (type String) |

---

## 📦 L'analogie de la boîte universelle

```
Boite<String>   → contient des Strings
Boite<Integer>  → contient des entiers
Boite<Voiture>  → contient des Voitures
```

👉 **Une seule classe** `Boite` → **autant d'utilisations** que de types.

---

## ❌ Sans généricité — le problème

```java
// Une classe par type... très répétitif !
public class BoiteString {
    String contenu;
}

public class BoiteInteger {
    Integer contenu;
}
```

---

## ✅ Avec généricité — la solution

```java
// Une seule classe pour TOUS les types
public class Boite<T> {

    T contenu;

    Boite(T contenu) {
        this.contenu = contenu;
    }

    T getContenu() {
        return contenu;
    }

    void afficher() {
        System.out.println("Contenu : " + contenu);
    }
}
```

👉 `T` = **Type** — un placeholder.
👉 Java remplace `T` par le vrai type au moment du `new`.

---

## 💻 Utilisation

```java
Boite<String> b1 = new Boite<>("Bonjour");
Boite<Integer> b2 = new Boite<>(42);

b1.afficher();   // Contenu : Bonjour
b2.afficher();   // Contenu : 42
```

---

## 🛒 La généricité dans les Collections

```java
ArrayList<String> liste = new ArrayList<>();
//         ↑
//    T = String
```

---

## ⚠️ Sans vs avec généricité (sécurité)

```java
// ❌ Sans — dangereux, mélange les types
ArrayList liste = new ArrayList();
liste.add("Bonjour");
liste.add(42);   // mélange String et Integer !

// ✅ Avec — sécurisé
ArrayList<String> liste = new ArrayList<>();
liste.add("Bonjour");
liste.add(42);   // ❌ erreur de compilation → protégé !
```

---

## ⚠️ Règles importantes

```
1. <String> → majuscule (c'est un type)
2. ArrayList → pas de [] comme les tableaux
3. size() → avec parenthèses (pas length)
4. get(i) → pour accéder (pas tab[i])
5. <T> sur la classe → T réutilisable partout dedans
```

---

## ✅ Validé le

Leçon 23 — La généricité — Validée ✅
