# 🧠 Carte mentale — Leçon 6 : Les boucles (while / for)

> 💡 Idée centrale : une **boucle** répète des instructions automatiquement. 🔁

```
                     🔁 BOUCLES
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
   ⏳ while           🔢 for            🔴 Boucle infinie
        │                 │                 │
   = "tant que"      = "pour"          si on oublie de
   nombre de tours   nombre de tours   modifier le compteur
   INCONNU           CONNU             → ne s'arrête jamais
        │                 │            → le programme plante
   modifier le       for(i=1; i<=10; i++)
   compteur !        départ│cond.│ i++
                          (i++ = i + 1)
```

🌙 *La règle d'or du soir : dans un `while`, ne JAMAIS oublier de faire avancer le compteur.*
