# 🧠 Carte mentale — Leçon 8 : Les méthodes avec paramètres

> 💡 Idée centrale : un **paramètre** rend la méthode **flexible**, comme un distributeur de boissons. 🥤

```
                  🥤 PARAMÈTRES
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  📥 C'est quoi     🏗️ Syntaxe       🔢 Plusieurs
      │                 │                 │
  une valeur        static void       (String prenom, int age)
  donnée EN ENTRÉE  nom(String x) {   séparés par des virgules
      │                ...
  la méthode        }
  travaille avec
      │
  ⚠️ Règles
      │
  ├─ le paramètre EST déjà la variable
  │   → ne JAMAIS le redéclarer dedans
  └─ bon TYPE à l'appel (int ≠ "texte")
```

🌙 *Le réflexe du soir : le paramètre existe déjà — pas besoin de String x = ... dedans.*
