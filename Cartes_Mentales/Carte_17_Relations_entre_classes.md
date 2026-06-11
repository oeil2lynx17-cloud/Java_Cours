# 🧠 Carte mentale — Leçon 17 : Les relations entre classes

> 💡 Idée centrale : deux liens possibles entre classes — **« EST »** et **« A »**. 🔗

```
                  🔗 RELATIONS
                        │
      ┌─────────────────┴─────────────────┐
      │                                   │
  🧬 "EST" → extends                  📦 "A" → attribut
      │                                   │
  HÉRITAGE                            ASSOCIATION
  un Chien EST un Animal              une Voiture A un Moteur
      │                                   │
  class Chien                         class Voiture {
  extends Animal                          Moteur moteur;
                                      }
                                          │
                                      🤝 déléguer :
                                      moteur.afficher()
                                      (pas "+" sur un objet !)
```

🌙 *Le truc à mémoriser : « EST » = `extends`, « A » = un attribut objet.*
