# 📘 Lesson_15 — Les interfaces

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Interface** | Un contrat — liste des méthodes sans les écrire |
| `interface` | Remplace `class` pour déclarer une interface |
| `implements` | "signe le contrat" — oblige à écrire les méthodes |
| `public` | Obligatoire devant les méthodes implémentées |

---

## 📝 L'analogie du contrat

```
Interface  =  contrat de travail
              "tu dois savoir faire : voler, nager..."

Classe     =  employé qui signe le contrat
              "je sais faire : voler, nager..."
              ET doit écrire comment !
```

---

## 📊 extends vs implements

| | `extends` | `implements` |
|---|---|---|
| Pour | Hériter d'une classe | Signer un contrat |
| Nombre max | **1 seul** | **Plusieurs** |
| Méthodes | Héritées automatiquement | À écrire obligatoirement |

---

## 💻 Déclarer une interface

```java
public interface Volatile {
    void voler();  // pas de corps — juste la signature
}
```

---

## 💻 Implémenter une interface

```java
public class Aigle extends Animal implements Volatile {

    public void voler() {  // public obligatoire
        System.out.println(espece + " vole dans les airs !");
    }
}
```

---

## 💻 Plusieurs interfaces

```java
public class Canard extends Animal implements Volatile, Nageable {

    public void voler() {
        System.out.println(espece + " vole !");
    }

    public void nager() {
        System.out.println(espece + " nage !");
    }
}
```

---

## 💻 Code de référence complet

```java
// Interface
public interface Volatile {
    void voler();
}

// Classe parent
public class Animal {
    String espece;
    Animal(String espece) { this.espece = espece; }
    void manger() { System.out.println(espece + " mange."); }
}

// Classe enfant qui hérite ET implémente
public class Aigle extends Animal implements Volatile {
    String nom;
    Aigle(String nom, String espece) {
        super(espece);
        this.nom = nom;
    }
    public void voler() {
        System.out.println(espece + " vole dans les airs !");
    }
    void crier() {
        System.out.println(espece + " jacasse !");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Aigle a1 = new Aigle("Pygargue", "Aigle royal");
        a1.manger();  // hérité de Animal
        a1.voler();   // vient de Volatile
        a1.crier();   // propre à Aigle
    }
}
```

---

## ⚠️ Règles importantes

```
1. Interface → pas de corps dans les méthodes
2. implements → méthodes OBLIGATOIREMENT écrites avec public
3. Une classe peut implémenter PLUSIEURS interfaces
4. Une classe ne peut hériter que d'UNE seule classe
```

---

## ✅ Validé le

Leçon 15 — Interfaces — Validée ✅
