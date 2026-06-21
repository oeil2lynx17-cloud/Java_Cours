# 🧠 Carte mentale — Leçon 23 : La généricité

> 💡 Idée centrale : une seule classe qui marche avec **n'importe quel type**, comme une boîte universelle. 📦

```
                  📦 GÉNÉRICITÉ
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  🔤 Le <T>         🏗️ Une classe     🛡️ Sécurité
      │             pour tous types       │
  T = "Type"            │              empêche de
  un placeholder    public class       mélanger les types
  que Java          Boite<T> {             │
  remplace             T contenu;      ArrayList<String>
      │             }                  → que des String
  ex : Boite<String>   │                  (sinon erreur
       Boite<Integer>  new Boite<>("x")    de compilation)
```

```
   ⚠️ Règles : <String> majuscule · size() (pas length) · get(i) (pas [i])
```

🌙 *À garder en tête : `<T>` est un type « à trous » que Java remplace par le vrai type au moment du `new`.*
