# 📘 Lesson_13 — Les constructeurs

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Constructeur** | Remplit les attributs directement à la création de l'objet |
| `this` | Désigne l'objet lui-même (l'attribut de l'objet) |
| **Paramètre** | La valeur passée au constructeur lors du `new` |

---

## 🚗 L'analogie du concessionnaire

```
Sans constructeur  →  acheter la voiture puis régler couleur, options... après
Avec constructeur  →  commander la voiture DÉJÀ configurée
```

👉 Le constructeur configure l'objet **au moment de sa création**.

---

## 💻 Sans vs avec constructeur

```java
// ❌ Sans constructeur — long
Personne p = new Personne();
p.nom = "Chatelot";
p.prenom = "Dominique";
p.age = 50;

// ✅ Avec constructeur — rapide
Personne p = new Personne("Chatelot", "Dominique", 50);
```

---

## 💻 Écrire un constructeur

```java
public class Personne {

    String nom;
    String prenom;
    int age;

    // Le constructeur (même nom que la classe, sans type de retour)
    Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    void sePresenter() {
        System.out.println("Je m'appelle " + prenom + " " + nom + " et j'ai " + age + " ans.");
    }
}
```

---

## 🔑 Le mot `this`

```java
this.nom = nom;
```

👉 `this.nom` = l'attribut **de l'objet**
👉 `nom` = le paramètre **reçu**

> *"Mon nom à moi (this) = le nom qu'on m'a donné"*

---

## 💻 Utilisation dans le main

```java
public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("Chatelot", "Dominique", 50);
        Personne p2 = new Personne("Chatelot-Gary", "Isabelle", 44);

        p1.sePresenter();
        p2.sePresenter();
    }
}
```

Résultat :
```
Je m'appelle Dominique Chatelot et j'ai 50 ans.
Je m'appelle Isabelle Chatelot-Gary et j'ai 44 ans.
```

---

## ❌ Erreur classique — oubli de `this`

```java
// ❌ Faux — le paramètre s'assigne à lui-même
Animal(String nom, int age) {
    nom = nom;   // inutile !
    age = age;   // inutile !
}

// ✅ Correct
Animal(String nom, int age) {
    this.nom = nom;
    this.age = age;
}
```

---

## ✅ Validé le

Leçon 13 — Constructeurs — Validée ✅
