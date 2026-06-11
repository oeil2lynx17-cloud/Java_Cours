# 🧠 Carte mentale — Leçon 19 : L'introspection

> 💡 Idée centrale : le programme **s'examine lui-même**, comme un colis mystérieux qu'on ouvre. 📦

```
                  📦 INTROSPECTION
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  🔍 C'est quoi     🛠️ Les méthodes    📂 Le package
      │                 │                 │
  examiner ses      ├─ getClass()       java.lang.reflect
  propres classes   │   → la classe         │
  PENDANT           ├─ getName() → complet  reflect =
  l'exécution       ├─ getSimpleName()      "réfléchir"
      │             │   → nom simple        (un miroir 🪞)
  sans les          ├─ getDeclaredFields()
  connaître         │   → les attributs
  à l'avance        └─ getMethods()
                        → les méthodes
```

🌙 *À retenir ce soir : le programme se regarde dans un miroir pour découvrir ses attributs et méthodes.*
