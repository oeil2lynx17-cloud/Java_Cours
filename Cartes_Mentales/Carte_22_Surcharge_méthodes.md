# 🧠 Carte mentale — Leçon 22 : La surcharge de méthodes

> 💡 Idée centrale : **même nom**, mais des **paramètres différents** — comme le mot « cours ». 🗣️

```
                  🗣️ SURCHARGE
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  📚 C'est quoi     ✍️ Signature      🧠 Java choisit
      │                 │                 │
  plusieurs         = nom +            selon CE QU'ON
  méthodes au       paramètres         LUI DONNE
  même nom              │                 │
      │             c'est ce qui       afficher()    → version vide
  paramètres        les distingue      afficher("x") → version String
  différents                           afficher("x",3)→ version String+int
```

```
   ✅ Autorisé si : nb de paramètres OU types différents
   ❌ Interdit si : seul le TYPE DE RETOUR change
```

🌙 *À retenir ce soir : c'est la liste des paramètres (la signature) qui distingue deux méthodes, jamais le type de retour.*
