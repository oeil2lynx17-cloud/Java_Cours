# 📘 Lesson_11 — Le Scanner (lire le clavier)

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Scanner** | L'outil qui lit ce que l'utilisateur tape au clavier |
| `import` | On va chercher l'outil avant de s'en servir |
| `nextLine()` | Lit une ligne de texte (String) |
| `nextInt()` | Lit un nombre entier (int) |
| `charAt(0)` | Récupère le 1er caractère d'un texte |

---

## 🎤 L'analogie du micro

```
Avant : ton programme PARLE (il affiche)
Maintenant : ton programme ÉCOUTE (il lit ce que tu tapes)
```

Le Scanner, c'est le **micro** 🎤 : tu parles, le programme t'entend.

---

## 💻 Code de référence

```java
import java.util.Scanner;  // ← obligatoire, tout en haut

public class LireClavier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est ton prénom ?");
        String prenom = scanner.nextLine();

        System.out.println("Bonjour " + prenom + " !");
    }
}
```

---

## 🔍 Explication ligne par ligne

```java
import java.util.Scanner;
```
👉 On importe l'outil Scanner — comme brancher un micro.

```java
Scanner scanner = new Scanner(System.in);
```
👉 On crée le Scanner. `System.in` = l'entrée clavier.

```java
String prenom = scanner.nextLine();
```
👉 Le programme attend que tu tapes quelque chose + Entrée, puis le range dans `prenom`.

---

## 💻 Lire différents types

```java
Scanner scanner = new Scanner(System.in);

// Lire un texte
String nom = scanner.nextLine();

// Lire un entier
int age = scanner.nextInt();

// Lire un seul caractère (char)
String ligne = scanner.nextLine();
char lettre = ligne.charAt(0);
```

---

## ⚠️ Règles importantes

```
1. import java.util.Scanner;  → TOUJOURS tout en haut
2. Scanner scanner = new Scanner(System.in);  → créer le Scanner
3. Pour lire un char → nextLine() + charAt(0)
4. Chaque scanner.next...() attend que l'utilisateur appuie sur Entrée
```

---

## ✅ Validé le

Leçon 11 — Le Scanner — Validée ✅
