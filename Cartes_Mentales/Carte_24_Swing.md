# 🧠 Carte mentale — Leçon 24 : Swing (interface graphique)

> 💡 Idée centrale : Swing = créer des **fenêtres** avec composants + placement + réactions aux clics. 🪟

```
                        🪟 SWING
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
   🧩 Composants      📐 Layouts        🖱️ ActionListener
        │                 │                 │
   ├─ JFrame (fenêtre) ├─ BorderLayout    bouton.addActionListener(
   ├─ JPanel (panneau) │   (N/S/E/O/centre)  new ActionListener() {
   ├─ JButton          ├─ FlowLayout         public void
   ├─ JTextField       │   (à la suite)      actionPerformed(ActionEvent e){
   ├─ JTextArea        └─ GridLayout(n,m)        // au clic
   └─ JLabel               (grille)          }
                                           });
```

```
   🏗️ LA STRUCTURE TYPE (par cœur !)
   1. déclarer les composants
   2. Container c = fenetre.getContentPane();
   3. BorderLayout principal
   4. JPanel (GridLayout / FlowLayout)
   5. c.add(panneau, BorderLayout.NORTH / SOUTH)
   6. ActionListeners
   7. pack() + setVisible(true)
```

```
   🛠️ Méthodes : getText() · setText("") · dispose()
```

🎯 *À réviser avant l'examen : la structure en 7 étapes + le patron ActionListener tombent à CHAQUE fois.*
