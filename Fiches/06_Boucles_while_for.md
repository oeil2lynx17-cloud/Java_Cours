# 📘 Lesson_06 — Les boucles (while et for)

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Boucle** | Répète des instructions automatiquement |
| `while` | "Tant que" — répète tant que la condition est vraie |
| `for` | "Pour" — répète un nombre défini de fois |
| `i++` | Raccourci pour `i = i + 1` |
| **Boucle infinie** | Boucle qui ne s'arrête jamais → fait planter le programme |

---

## 💻 La boucle while

```java
int compteur = 1;

while (compteur <= 5) {
    System.out.println("Tour numéro : " + compteur);
    compteur = compteur + 1;
}
```

### Structure
```
while (condition) {
    // instructions répétées tant que condition est vraie
    // ne pas oublier de modifier le compteur !
}
```

---

## 💻 La boucle for

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("Tour numéro : " + i);
}
```

### Anatomie du for
```
for ( int i = 1 ; i <= 10 ; i++ )
       ^            ^          ^
    départ       condition   i = i + 1
```

---

## 🔍 while vs for

| Situation | Boucle conseillée |
|---|---|
| Tu sais combien de fois tu répètes | `for` |
| Tu ne sais pas combien de fois | `while` |

---

## 🔴 La boucle infinie — danger !

```java
// ❌ DANGER — boucle infinie
int i = 1;
while (i <= 5) {
    System.out.println("Java !");
    // on a OUBLIÉ de faire i = i + 1
}
```

👉 Ici, `i` reste toujours à `1`.
La condition `i <= 5` est **toujours vraie**.
La boucle ne s'arrête **jamais** et le programme plante.

```java
// ✅ Correct — on modifie le compteur
int i = 1;
while (i <= 5) {
    System.out.println("Java !");
    i = i + 1;   // sans cette ligne → boucle infinie
}
```

---

## 🧠 Règles à retenir

```
Règle 1 → for quand on connaît le nombre de tours
Règle 2 → while quand on ne le connaît pas
Règle 3 → Toujours modifier le compteur dans un while
Règle 4 → i++ veut dire i = i + 1
```

---

## ✅ Validé le

Leçon 6 — Les boucles (while et for) — Validée ✅
