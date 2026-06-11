# 🧠 Carte mentale — Leçon 9 : Les méthodes avec retour (return)

> 💡 Idée centrale : `return` fait **rendre** une valeur, comme une calculette. 🧮

```
                    🧮 RETURN
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
   📤 C'est quoi      🎯 La règle d'or   📥 Récupérer
        │                 │                 │
   la méthode REND     le TYPE avant le   int r = methode();
   une valeur          nom = ce que       (on range le résultat
   (au lieu de         return renvoie      dans une variable)
   l'afficher)             │
                      ├─ int → return 42
   void = ne rend     ├─ double → return 3.14
   rien (pas de       ├─ boolean → return true
   return)            └─ String → return "..."
        │
   ⚠️ une méthode NON-void
      DOIT avoir un return
```

🌙 *À garder en tête : `void` n'affiche, `return` rend. Le type annonce ce qui sort.*
