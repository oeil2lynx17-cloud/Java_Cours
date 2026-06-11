# 🧠 Carte mentale — Leçon 14 : L'héritage

> 💡 Idée centrale : une classe **enfant hérite** d'une classe **parent**, comme dans une famille. 🏠

```
                    🏠 HÉRITAGE
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
   🔑 extends         👨‍👦 Enfant         🧬 super()
        │                 │                 │
   "hérite de"       récupère TOUT       appelle le
        │             du parent           constructeur
   class Chien       + ajoute ses         du parent
   extends Animal    propres choses          │
        │                 │              super(nom, age);
   un seul parent    Chien : manger()    → 1ère ligne du
   en Java !         (hérité) +              constructeur enfant
                     aboyer() (propre)
```

🌙 *À garder en tête : `super()` en première ligne, et un seul `extends` par classe.*
