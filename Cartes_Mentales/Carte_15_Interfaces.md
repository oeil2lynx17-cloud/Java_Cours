# 🧠 Carte mentale — Leçon 15 : Les interfaces

> 💡 Idée centrale : une **interface** est un **contrat** qui liste les méthodes sans les écrire. 📝

```
                  📝 INTERFACES
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  📜 C'est quoi     ✍️ implements     📊 extends vs implements
      │                 │                 │
  un CONTRAT       "signer le         extends → 1 seule classe
  qui liste les    contrat"           implements → PLUSIEURS
  méthodes             │                 │
  sans les écrire  la classe DOIT      interface → pas de corps
      │             écrire les          dans les méthodes
  interface         méthodes
  remplace class   (public obligatoire)
```

🌙 *Le soir, retiens : l'interface dit QUOI faire, la classe écrit COMMENT le faire.*
