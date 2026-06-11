# 📘 Lesson_10 — Les tableaux

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Tableau** | Une seule variable qui contient plusieurs valeurs |
| **Case** | Un emplacement du tableau (numéroté à partir de 0) |
| **Index** | Le numéro d'une case |
| `length` | Le nombre de cases du tableau |

---

## 🚂 L'analogie du wagon de train

```
ages[0] = 50
ages[1] = 25
ages[2] = 30
ages[3] = 45
ages[4] = 20
```

👉 Un seul nom `ages` — 5 cases numérotées.
👉 Les cases commencent **toujours à 0**. Jamais à 1.

---

## 💻 Déclarer un tableau

```java
// Tableau d'entiers
int[] ages = {50, 25, 30, 45, 20};

// Tableau de textes
String[] villes = {"Bordeaux", "Nantes", "Figeac"};

// Tableau de caractères
char[] lettres = {'A', 'B', 'C'};
```

| Morceau | Signification |
|---|---|
| `int[]` | tableau de nombres entiers |
| `ages` | le nom du tableau |
| `{50, 25, ...}` | les valeurs dans les cases |

---

## 💻 Accéder à une case

```java
int[] ages = {50, 25, 30, 45, 20};

System.out.println(ages[0]);  // 50
System.out.println(ages[1]);  // 25
System.out.println(ages[4]);  // 20
```

---

## 💻 length — nombre de cases

```java
int[] ages = {50, 25, 30, 45, 20};
System.out.println(ages.length);  // affiche 5
```

👉 Java compte tout seul.
👉 Si tu ajoutes des cases → pas besoin de changer la boucle.

---

## 💻 Parcourir avec une boucle

```java
int[] nombres = {50, 25, 30, 45, 20};

for (int i = 0; i < nombres.length; i++) {
    System.out.println("Case " + i + " = " + nombres[i]);
}
```

Résultat :
```
Case 0 = 50
Case 1 = 25
Case 2 = 30
Case 3 = 45
Case 4 = 20
```

---

## 💻 Calculer une somme avec un tableau

```java
public class Notes {
    public static void main(String[] args) {

        int[] notes = {15, 12, 18, 9, 14};
        int somme = 0;

        for (int i = 0; i < notes.length; i++) {
            somme = somme + notes[i];
        }

        System.out.println("La somme des notes est : " + somme);
    }
}
```

Résultat :
```
La somme des notes est : 68
```

---

## ❌ Erreurs classiques

```java
// ❌ Index qui n'existe pas
int[] notes = {15, 12, 18, 9};  // 4 cases → index 0 à 3
System.out.println(notes[4]);    // ERREUR : ArrayIndexOutOfBoundsException

// ❌ Mauvais nom de tableau dans la boucle
int[] nombres = {1, 2, 3};
for (int i = 0; i < notes.length; i++)  // notes n'existe pas !

// ✅ Correct — même nom partout
for (int i = 0; i < nombres.length; i++)
```

---

## ✅ Validé le

Leçon 10 — Les tableaux — Validée ✅
