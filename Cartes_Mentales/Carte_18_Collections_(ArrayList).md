# 🧠 Carte mentale — Leçon 18 : Les Collections (ArrayList)

> 💡 Idée centrale : une **ArrayList** est un **caddie** — elle grandit et rétrécit toute seule. 🛒

```
                   🛒 COLLECTIONS
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  📦 C'est quoi     🔌 Déclarer        🛠️ Méthodes
      │                 │                 │
  liste FLEXIBLE    import             ├─ add()    → ajouter
  (≠ tableau fixe)  java.util.ArrayList; ├─ get(i)   → récupérer
      │                 │              ├─ remove(i) → supprimer
  grandit /         ArrayList<String>  ├─ size()   → nombre
  rétrécit          liste =            └─ contains()→ existe ?
  automatiquement   new ArrayList<>();
```

```
   📊 Tableau          vs        ArrayList
   taille fixe                   taille variable
   tab.length                    liste.size()
   tab[0]                        liste.get(0)
```

🌙 *À retenir ce soir : pour une ArrayList, c'est `size()` (pas `length`) et `get(0)` (pas `[0]`).*
