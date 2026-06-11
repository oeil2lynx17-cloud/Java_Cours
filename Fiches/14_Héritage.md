# 📘 Lesson_14 — L'héritage

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Héritage** | Une classe enfant récupère attributs et méthodes d'une classe parent |
| `extends` | "hérite de" |
| `super()` | Appelle le constructeur du parent — obligatoire si le parent a un constructeur |
| **Classe parent** | La classe qui donne ses attributs et méthodes |
| **Classe enfant** | La classe qui hérite et peut ajouter ses propres choses |

---

## 🏠 L'analogie de la famille

```
Parent  →  donne ses caractéristiques
Enfant  →  hérite + ajoute les siennes
```

---

## 📊 Schéma

```
Animal
├── nom
├── age
└── manger()
      ↑
    hérite
    /    \
Chien    Chat
├── race  ├── couleur
└── aboyer() └── miauler()
```

---

## 💻 Classe parent

```java
public class Animal {

    String nom;
    int age;

    Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    void manger() {
        System.out.println(nom + " mange.");
    }
}
```

---

## 💻 Classe enfant Chien

```java
public class Chien extends Animal {

    String race;

    Chien(String nom, int age, String race) {
        super(nom, age);   // constructeur du parent
        this.race = race;
    }

    void aboyer() {
        System.out.println(nom + " aboie : Woof !");
    }
}
```

---

## 💻 Classe enfant Chat

```java
public class Chat extends Animal {

    String couleur;

    Chat(String nom, int age, String couleur) {
        super(nom, age);
        this.couleur = couleur;
    }

    void miauler() {
        System.out.println(nom + " miaule : Miaou !");
    }
}
```

---

## 💻 Main

```java
public class Main {
    public static void main(String[] args) {

        Chien chien = new Chien("Patxi", 5, "Berger Belge");
        Chat chat = new Chat("Lucifer", 10, "Maine Coon");

        chien.manger();   // hérité de Animal ✅
        chien.aboyer();   // propre à Chien ✅

        chat.manger();    // hérité de Animal ✅
        chat.miauler();   // propre à Chat ✅
    }
}
```

---

## 🔑 Le mot `super`

```java
super(nom, age);
```

👉 Appelle le constructeur du **parent**.
👉 Obligatoire si le parent a un constructeur.
👉 Toujours en **première ligne** du constructeur enfant.

---

## ⚠️ Règles importantes

```
1. extends → une seule classe parent en Java
2. super() → toujours en PREMIÈRE ligne du constructeur enfant
3. Un Chien connaît manger() ET aboyer()
4. Un Chien NE connaît PAS miauler() — c'est propre à Chat
```

---

## ✅ Validé le

Leçon 14 — L'héritage — Validée ✅
