# 🧠 Carte mentale — Leçon 16 : Les exceptions

> 💡 Idée centrale : une **exception** est un problème en cours de route — on la **gère** au lieu de planter. 🚗💥

```
                  🚗💥 EXCEPTIONS
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  ⚠️ C'est quoi     🛠️ try/catch/finally  📋 Types courants
      │                 │                 │
  un problème       try → essaie       ├─ ArithmeticException
  pendant           catch → attrape    │   (÷ par zéro)
  l'exécution       finally → TOUJOURS ├─ NullPointerException
      │                 │              ├─ ArrayIndexOutOfBounds
  non géré →        finally s'exécute  └─ NumberFormatException
  ça plante         erreur ou pas
  géré → ça continue
```

🌙 *À retenir avant de dormir : le bloc `finally` s'exécute TOUJOURS, qu'il y ait une erreur ou non.*
