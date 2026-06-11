# 🧠 Carte mentale — Leçon 3 : Affichage et concaténation

> 💡 Idée centrale : le **+** colle les morceaux comme des **wagons de train**. 🚂

```
                 🚂 CONCATÉNATION
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  🔗 Le +          🧩 Les morceaux    ⚠️ Les pièges
      │                 │                 │
  colle texte      ├─ texte fixe " "  ├─ espaces oubliés
  ET variables     └─ variables       │   "Salut"+nom → Salutnom
      │                 (sans " ")    ├─ casse : pays ≠ Pays
  "Bonjour " + nom                    └─ ; en fin de ligne
```

🌙 *Le réflexe du soir : un espace avant le guillemet fermant → "Bonjour " + nom.*
