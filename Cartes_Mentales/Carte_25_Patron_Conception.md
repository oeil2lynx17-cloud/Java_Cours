# 🧠 Carte mentale — Leçon 25 : Les patrons de conception

> 💡 Idée centrale : des **solutions toutes faites** à des problèmes de code récurrents. 🧩

```
                 🧩 PATRONS DE CONCEPTION
                          │
        ┌─────────────────┴─────────────────┐
        │                                   │
   🌳 COMPOSITE                        🕵️ VISITEUR
   (le plus fréquent ⭐⭐⭐)               (tombe souvent)
        │                                   │
   📁 dossier / fichier               👀 inspecteur de maisons
        │                                   │
   traiter un élément SIMPLE          ajouter une opération
   et un GROUPE de la même façon      SANS modifier les classes
        │                                   │
   interface commune (Tache)          accept(v) → v.visiter(this)
   TacheElementaire / TacheComplexe   visiter(...) fait le travail
        │
   getCout() = boucle sur les sous-tâches
```

```
   🎯 Intérêt Composite (formule examen) :
   manipuler un objet simple et un groupe de façon identique,
   sans que le code appelant distingue les deux cas.
```

🎯 *À réviser avant l'examen : sais redire l'INTÉRÊT du Composite avec la bonne formulation + la structure accept/visiter du Visiteur.*
