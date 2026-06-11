# 🧠 Carte mentale — Leçon 11 : Le Scanner (lire le clavier)

> 💡 Idée centrale : le **Scanner** permet au programme d'**écouter** ce que tu tapes, comme un micro. 🎤

```
                     🎤 SCANNER
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
   📥 C'est quoi      🔌 Brancher       👂 Lire
        │                 │                 │
   le programme       import             ├─ nextLine() → texte
   ÉCOUTE le          java.util.Scanner; │   (String)
   clavier            (tout en HAUT !)   ├─ nextInt() → entier
   (avant : il          │                │   (int)
   parlait seulement) Scanner sc =       └─ un seul caractère :
                      new Scanner(System.in);  nextLine() + charAt(0)
        │
   ⚠️ Chaque lecture attend que tu appuies sur Entrée
```

🌙 *À retenir avant de dormir : l'`import` du Scanner se met TOUJOURS tout en haut du fichier.*
