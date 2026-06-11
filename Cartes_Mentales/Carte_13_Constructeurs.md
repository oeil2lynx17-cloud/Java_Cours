# 🧠 Carte mentale — Leçon 13 : Les constructeurs

> 💡 Idée centrale : le **constructeur** configure l'objet **dès sa création**, comme une commande déjà réglée chez le concessionnaire. 🚗

```
                  🚗 CONSTRUCTEUR
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  🎯 À quoi ça sert  🏗️ Comment       🔑 Le mot this
      │                 │                 │
  remplir les       même nom que       this.nom = nom
  attributs À LA    la classe              │
  CRÉATION          (pas de type      this.nom → l'attribut
      │             de retour)         nom → le paramètre reçu
  new Personne(         │
   "Chatelot",      Personne(String nom, ...) {
   "Dominique",         this.nom = nom;
    50)             }
```

🌙 *Le réflexe du soir : `this.x = x` range le paramètre reçu dans l'attribut de l'objet.*
