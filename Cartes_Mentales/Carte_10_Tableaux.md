# 🧠 Carte mentale — Leçon 10 : Les tableaux

> 💡 Idée centrale : un **tableau** = une seule variable avec plusieurs cases, comme un train. 🚂

```
                     🚂 TABLEAUX
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
   📦 C'est quoi      🔢 Les cases      🛠️ Les outils
        │                 │                 │
   1 nom →            commencent à 0     ├─ déclarer
   plusieurs valeurs  jamais à 1 !       │   int[] t = {50, 25, 30};
        │                 │              ├─ accéder
   int[] ages =       ages[0] = 1ère     │   t[0]
   {50, 25, 30}       ages[1] = 2ème     ├─ length → nb de cases
                                         └─ parcourir
                                             for(i=0; i<t.length; i++)
        │
   ⚠️ Piège : t[4] sur un tableau de 4 cases (0→3)
              → ArrayIndexOutOfBounds (case inexistante)
```

🌙 *Le truc à mémoriser : la 1ère case, c'est `[0]`, pas `[1]`.*
