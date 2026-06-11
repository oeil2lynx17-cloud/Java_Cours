# 🧠 Carte mentale — Leçon 20 : XML

> 💡 Idée centrale : XML range des données dans des **balises**, comme un formulaire bien organisé. 📄

```
                       📄 XML
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  📋 C'est quoi     🏷️ Les balises    🌳 DOM (en Java)
      │                 │                 │
  format pour       <nom>...</nom>     lit le XML en
  stocker /         ouvrante +         mémoire comme
  échanger des      fermante           un ARBRE
  données               │                 │
      │             ⚠️ règles :         getElementsByTagName()
  eXtensible        - 1 balise racine    → récupère les balises
  Markup            - imbrication
  Language          - entête obligatoire
                      <?xml version="1.0"?>
```

```
   🔍 Élément  <nom>Chatelot</nom>   →  getTextContent()
   🔍 Attribut <personne nom="..."/> →  getAttribute("nom")
```

🌙 *À retenir avant de dormir : toujours UNE balise racine + l'entête `<?xml ... ?>` tout en haut.*
