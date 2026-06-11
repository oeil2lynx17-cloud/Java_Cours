# 📘 Lesson_01 — Qu'est-ce que la programmation ?

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Programme** | Suite d'instructions qui dit à l'ordinateur ce qu'il doit faire |
| **Programmeur** | La personne qui écrit les instructions |
| **Langage de programmation** | La langue utilisée pour parler à l'ordinateur |
| **Java** | Un langage de programmation professionnel, utilisé partout dans le monde |
| **Exécuter** | Lancer un programme — l'ordinateur suit les instructions |

---

## 🧠 L'analogie de la recette

| Cuisine | Programmation |
|---|---|
| Le cuisinier | Le programmeur |
| La recette | Le programme |
| Celui qui suit la recette | L'ordinateur |

---

## 💻 Structure d'un programme Java

```java
public class MonPremierProgramme {
    public static void main(String[] args) {
        System.out.println("Bonjour le monde !");
    }
}
```

### Explication ligne par ligne

| Ligne | Signification |
|---|---|
| `public class MonPremierProgramme` | Déclare une boîte (classe) appelée MonPremierProgramme |
| `{` | Ouvre la boîte |
| `public static void main(String[] args)` | Porte d'entrée du programme — l'ordinateur commence ici |
| `{` | Ouvre la porte d'entrée |
| `System.out.println("...");` | Affiche du texte à l'écran |
| `}` | Ferme la porte d'entrée |
| `}` | Ferme la boîte |

---

## 🔍 Décryptage de System.out.println

```
System       → le système de l'ordinateur
out          → la sortie (ce qui s'affiche à l'écran)
println      → print line = affiche une ligne
( "..." )    → ce qu'on veut afficher, entre guillemets
;            → fin d'instruction (obligatoire en Java)
```

---

## ▶️ Exécution mentale

```
1. L'ordinateur trouve main() → porte d'entrée
2. Il lit System.out.println("Bonjour le monde !")
3. Il affiche : Bonjour le monde !
4. Il s'arrête.
```

---

## ⚠️ Règles à retenir

- Toute instruction Java se termine par `;`
- Ce qu'on affiche se met entre guillemets `" "`
- Le texte entre guillemets s'appelle une **String** (chaîne de caractères)
- L'ordinateur lit le code de haut en bas, dans l'ordre

---

## ✅ Validé le

Leçon 1 — 3/3 questions correctes ✅
