# 📘 Lesson_18 — Les Collections (ArrayList)

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Collection** | Une structure qui peut grandir et rétrécir automatiquement |
| **ArrayList** | La collection la plus utilisée — une liste flexible |
| `<String>` | Le type des éléments contenus dans la liste |
| `size()` | Le nombre d'éléments de la liste |

---

## 🛒 L'analogie du caddie

```
Tableau   →  boîte rigide — taille fixe
ArrayList →  caddie de supermarché — on ajoute/retire ce qu'on veut
```

---

## 💻 Déclarer une ArrayList

```java
import java.util.ArrayList;   // ← obligatoire, tout en haut

ArrayList<String> prenoms = new ArrayList<>();
```

👉 `ArrayList<String>` → une liste de Strings
👉 `<String>` → le type d'éléments dans la liste

---

## 🛠️ Les méthodes essentielles

| Méthode | Rôle | Exemple |
|---|---|---|
| `add()` | Ajoute un élément | `liste.add("Lucas")` |
| `get()` | Récupère un élément | `liste.get(0)` |
| `remove()` | Supprime un élément | `liste.remove(0)` |
| `size()` | Nombre d'éléments | `liste.size()` |
| `contains()` | Vérifie si l'élément existe | `liste.contains("Lucas")` |

---

## 💻 Code de référence

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> prenoms = new ArrayList<>();

        // Ajouter
        prenoms.add("Dominique");
        prenoms.add("Isabelle");
        prenoms.add("Lucas");

        // Taille
        System.out.println("Taille : " + prenoms.size());

        // Récupérer un élément
        System.out.println("Premier : " + prenoms.get(0));

        // Parcourir
        for (int i = 0; i < prenoms.size(); i++) {
            System.out.println(prenoms.get(i));
        }

        // Supprimer
        prenoms.remove(1);
        System.out.println("Après suppression : " + prenoms.size());
    }
}
```

---

## 💻 ArrayList d'objets

```java
ArrayList<Personne> personnes = new ArrayList<>();

personnes.add(new Personne("Chatelot", "Dominique", 50));
personnes.add(new Personne("Chatelot-Gary", "Isabelle", 44));

for (int i = 0; i < personnes.size(); i++) {
    personnes.get(i).sePresenter();
}
```

---

## 📊 Tableau vs ArrayList

| | Tableau | ArrayList |
|---|---|---|
| Taille | Fixe | Variable |
| Syntaxe taille | `length` | `size()` |
| Accès | `tab[0]` | `liste.get(0)` |
| Ajout | Impossible | `liste.add()` |
| Suppression | Impossible | `liste.remove()` |

> 💡 `length` → pour les **tableaux** · `size()` → pour les **ArrayLists**

---

## ✅ Validé le

Leçon 18 — Les Collections — Validée ✅
