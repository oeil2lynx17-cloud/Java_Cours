# 📘 Lesson_22 — La surcharge de méthodes

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Surcharge** | Plusieurs méthodes avec le même nom mais des paramètres différents |
| **Signature** | Le nom + les paramètres d'une méthode |

---

## 🗣️ L'analogie du mot « cours »

```
"cours" peut vouloir dire :
- je cours dans le parc  🏃
- le cours de Java       📚
- le cours de la bourse  📈

→ Même mot, sens différent selon le contexte
→ Java fait pareil avec les méthodes
```

---

## 💻 Code de référence

```java
public class Afficheur {

    // Version 1 — sans paramètre
    void afficher() {
        System.out.println("Rien à afficher !");
    }

    // Version 2 — avec un String
    void afficher(String texte) {
        System.out.println(texte);
    }

    // Version 3 — avec un String et un int
    void afficher(String texte, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(texte);
        }
    }
}
```

---

## 💻 Utilisation

```java
Afficheur a = new Afficheur();

a.afficher();                    // → "Rien à afficher !"
a.afficher("Bonjour !");         // → "Bonjour !"
a.afficher("Java !", 3);         // → "Java !" x3
```

---

## 🧠 Comment Java choisit ?

```
Java regarde CE QU'ON LUI DONNE :

a.afficher()           → pas de paramètre → version sans paramètre
a.afficher("hello")    → String           → version String
a.afficher("hi", 5)    → String + int     → version String + int
```

---

## ✅ Règles

```
✅ Même nom autorisé si :
   → nombre de paramètres différent
   → OU types de paramètres différents

❌ Impossible si :
   → seulement le type de retour change
```

```java
// ❌ Impossible — même signature, seul le retour change !
int    calculer() { return 1; }
double calculer() { return 1.0; }
```

---

## ✅ Validé le

Leçon 22 — La surcharge de méthodes — Validée ✅
