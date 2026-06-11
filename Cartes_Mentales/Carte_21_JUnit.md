# 🧠 Carte mentale — Leçon 21 : JUnit (les tests)

> 💡 Idée centrale : JUnit fait le **contrôle qualité** de ton code, automatiquement. 🧪

```
                     🧪 JUNIT
                        │
      ┌─────────────────┼─────────────────┐
      │                 │                 │
  🎯 C'est quoi     🏷️ @Test          ✅ Les assertions
      │                 │                 │
  tests             marque une         ├─ assertEquals(a, b)
  AUTOMATIQUES      méthode comme      ├─ assertTrue(cond)
      │             un test            ├─ assertFalse(cond)
  vérifie que           │              └─ assertNotNull(obj)
  le code marche    convention :           │
  + dit OÙ          XxxTest.java        ⚠️ pour les double :
  ça casse          testXxx()           3e argument = tolérance
                                        assertEquals(110.0, x, 0.001)
```

```
   ✅ PASSED  → barre verte (tout marche)
   ❌ FAILED  → expected: <110.0> but was: <100.0>
```

🌙 *À garder en tête : pour comparer des `double`, `assertEquals` a besoin d'une **tolérance** (le 3e argument).*
