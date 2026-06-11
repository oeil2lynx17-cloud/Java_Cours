# 📘 Lesson_17 — Les relations entre classes

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Héritage ("EST")** | Une classe EST une autre (`extends`) |
| **Association ("A")** | Une classe A une autre (attribut objet) |
| **Déléguer** | Laisser un autre objet faire son travail (appeler sa méthode) |

---

## 🔗 Les 2 types de relations

| Relation | Mot clé | Exemple |
|---|---|---|
| **Héritage** | `extends` | Un Chien **EST** un Animal |
| **Association** | attribut | Une Voiture **A** un Moteur |

---

## 📊 Exemple — Personne et Adresse

```
Personne                    Adresse
────────                    ───────
nom                         rue
prenom          a ────────► ville
adresse ───────►            codePostal
                            afficher()
```

---

## 💻 Classe Adresse

```java
public class Adresse {

    String rue;
    String ville;
    String codePostal;

    Adresse(String rue, String ville, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    void afficher() {
        System.out.println(rue + ", " + codePostal + " " + ville);
    }
}
```

---

## 💻 Classe Personne — qui A une Adresse

```java
public class Personne {

    String nom;
    String prenom;
    Adresse adresse;  // ← relation "A" (un objet Adresse)

    Personne(String nom, String prenom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    void sePresenter() {
        System.out.println("Je m'appelle " + prenom + " " + nom);
        System.out.print("J'habite : ");
        adresse.afficher();   // on délègue à Adresse
    }
}
```

---

## 💻 Main

```java
public class Main {
    public static void main(String[] args) {

        Adresse adr = new Adresse("12 rue des Fleurs", "Figeac", "46100");
        Personne p = new Personne("Chatelot", "Dominique", adr);

        p.sePresenter();
    }
}
```

Résultat :
```
Je m'appelle Dominique Chatelot
J'habite : 12 rue des Fleurs, 46100 Figeac
```

---

## ⚠️ Règles importantes

```
1. "EST"  → extends   → héritage
2. "A"    → attribut  → association
3. Ne jamais afficher un objet directement avec +
   → utilise sa méthode afficher()
4. Nom de classe → toujours avec Majuscule
5. Nom de constructeur → même nom que la classe
```

---

## ❌ Erreurs classiques

```java
// ❌ Afficher un objet directement
System.out.println("Moteur : " + moteur);
// Résultat : "Moteur : Moteur@6d06d69c" — illisible !

// ✅ Appeler sa méthode
moteur.afficher();
```

---

## ✅ Validé le

Leçon 17 — Relations entre classes — Validée ✅
