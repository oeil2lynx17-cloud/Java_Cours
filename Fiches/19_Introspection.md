# 📘 Lesson_19 — L'introspection

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Introspection** | Capacité d'un programme à examiner ses propres classes |
| `getClass()` | Retourne la classe d'un objet |
| `getName()` | Retourne le nom complet de la classe |
| `getSimpleName()` | Retourne juste le nom simple |
| `getMethods()` | Liste toutes les méthodes |
| `getDeclaredFields()` | Liste tous les attributs |
| `reflect` | Package Java pour l'introspection |

---

## 📦 L'analogie du colis mystérieux

```
Colis mystérieux  →  objet inconnu
L'examiner        →  introspection
Découvrir contenu →  attributs et méthodes
```

---

## 💻 Obtenir le nom d'une classe

```java
Voiture v = new Voiture("Ferrari", "Rouge", 320);
Class c = v.getClass();

System.out.println(c.getName());       // Voiture
System.out.println(c.getSimpleName()); // Voiture
```

### Différence getName() vs getSimpleName()

```java
// Pour un String :
getName()       → "java.lang.String"  // nom complet
getSimpleName() → "String"            // nom simple
```

---

## 💻 Lister les attributs

```java
java.lang.reflect.Field[] attributs = c.getDeclaredFields();

for (java.lang.reflect.Field f : attributs) {
    System.out.println("  - " + f.getName());
}
```

---

## 💻 Lister les méthodes

```java
java.lang.reflect.Method[] methodes = c.getMethods();

for (java.lang.reflect.Method m : methodes) {
    System.out.println("  - " + m.getName());
}
```

---

## 💻 Code de référence complet

```java
public class Main {
    public static void main(String[] args) {

        Personne p = new Personne("Chatelot", "Dominique", 50);

        Class c = p.getClass();
        System.out.println("Classe : " + c.getName());
        System.out.println("Classe simple : " + c.getSimpleName());

        java.lang.reflect.Field[] attributs = c.getDeclaredFields();
        System.out.println("\nAttributs :");
        for (java.lang.reflect.Field f : attributs) {
            System.out.println("  - " + f.getName());
        }
    }
}
```

Résultat :
```
Classe : Personne
Classe simple : Personne
Attributs :
  - nom
  - prenom
  - age
```

---

## 🧠 Le for-each

```java
// Boucle classique
for (int i = 0; i < attributs.length; i++) {
    System.out.println(attributs[i].getName());
}

// For-each — plus moderne
for (java.lang.reflect.Field f : attributs) {
    System.out.println(f.getName());
}
```

👉 For-each = "pour chaque élément dans le tableau"
👉 Plus besoin de `i` — Java gère tout seul

---

## ✅ Validé le

Leçon 19 — Introspection — Validée ✅
