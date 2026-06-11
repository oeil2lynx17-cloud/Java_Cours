# 📘 Lesson_02 — Variables et types de données

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Variable** | Une boîte qui stocke une valeur |
| **Nom** | L'étiquette collée sur la boîte |
| **Type** | Le genre de valeur que la boîte peut contenir |
| **Valeur** | Ce qu'il y a dans la boîte |
| **Assigner** | Mettre une valeur dans la boîte avec `=` |

---

## 📦 Les 4 types essentiels

| Type | Contient | Guillemets ? | Exemple |
|---|---|---|---|
| `int` | Nombre entier | ❌ jamais | `int age = 50;` |
| `double` | Nombre décimal | ❌ jamais | `double taille = 1.75;` |
| `boolean` | Vrai ou Faux | ❌ jamais | `boolean ok = true;` |
| `String` | Texte | ✅ toujours | `String prenom = "Lucas";` |

---

## 💻 Syntaxe — La règle universelle

```
type  nom  =  valeur  ;
```

Exemple :
```java
int age = 50;
```
- `int`   → le type
- `age`   → le nom
- `=`     → assigne la valeur
- `50`    → la valeur
- `;`     → fin d'instruction (OBLIGATOIRE)

---

## 💻 Code de référence

```java
public class MesVariables {
    public static void main(String[] args) {

        String prenom = "dominique";
        int age = 50;
        double taille = 1.75;
        boolean aimelechocolat = true;

        System.out.println(prenom);
        System.out.println(age);
        System.out.println(taille);
        System.out.println(aimelechocolat);
    }
}
```

### Résultat à l'écran
```
dominique
50
1.75
true
```

---

## ⚠️ Les 3 règles d'or

```
Règle 1 → String prend toujours une MAJUSCULE
Règle 2 → Le texte se met toujours entre " "
Règle 3 → On assigne avec = et jamais avec :
```

---

## ❌ Erreurs classiques à éviter

```java
// ❌ Faux — string sans majuscule
string prenom = "Lucas";

// ✅ Correct
String prenom = "Lucas";

// ❌ Faux — texte sans guillemets
String prenom = Lucas;

// ✅ Correct
String prenom = "Lucas";

// ❌ Faux — nombre avec guillemets
int age = "50";

// ✅ Correct
int age = 50;

// ❌ Faux — : au lieu de =
boolean ok : true;

// ✅ Correct
boolean ok = true;

// ❌ Faux — pas de point-virgule
int age = 50

// ✅ Correct
int age = 50;
```

---

## ✅ Validé le

Leçon 2 — Variables et types — Validée ✅
