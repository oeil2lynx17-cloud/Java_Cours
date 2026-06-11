# 📘 Lesson_21 — JUnit (Les tests)

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **JUnit** | Framework de tests automatiques pour Java |
| `@Test` | Indique à JUnit que la méthode est un test |
| `assertEquals` | Vérifie que deux valeurs sont égales |
| `assertTrue` | Vérifie que la condition est vraie |
| `assertFalse` | Vérifie que la condition est fausse |
| `assertNotNull` | Vérifie que l'objet existe |
| **Tolérance** | Marge d'erreur acceptée pour les double |

---

## 🚗 L'analogie du contrôle qualité

```
Sans tests  →  on espère que ça marche
Avec tests  →  Java vérifie automatiquement
```

---

## ⚙️ Configurer JUnit dans IntelliJ

```
1. Clic droit sur le projet → Open Module Settings (F4)
2. Dependencies
3. "+" → Library → From Maven
4. Tape : junit:junit:4.13.2
5. OK
```

---

## 📋 Convention de nommage

```
Classe normale  →  Convertisseur.java
Classe de test  →  ConvertisseurTest.java

Méthode normale →  euroEnDollar()
Méthode de test →  testEuroEnDollar()
```

---

## 💻 Classe à tester

```java
public class Convertisseur {

    public double euroEnDollar(double euro) {
        return euro * 1.10;
    }

    public boolean estGrand(int taille) {
        return taille >= 180;
    }
}
```

---

## 💻 Classe de test

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertisseurTest {

    Convertisseur calc = new Convertisseur();

    @Test
    public void testEuroEnDollar() {
        assertEquals(110.0, calc.euroEnDollar(100), 0.001);
        //                                           ↑
        //                                      tolérance double
    }

    @Test
    public void testEstGrand() {
        assertTrue(calc.estGrand(185));
        assertFalse(calc.estGrand(170));
    }
}
```

---

## 📊 Les assertions

| Méthode | Rôle | Exemple |
|---|---|---|
| `assertEquals(a, b)` | a == b | `assertEquals(5, resultat)` |
| `assertEquals(a, b, delta)` | Pour les double | `assertEquals(110.0, res, 0.001)` |
| `assertTrue(condition)` | condition == true | `assertTrue(age >= 18)` |
| `assertFalse(condition)` | condition == false | `assertFalse(age < 0)` |
| `assertNotNull(objet)` | objet != null | `assertNotNull(personne)` |

---

## 🔴 Résultats possibles

```
✅ testEuroEnDollar  — PASSED
✅ testEstGrand      — PASSED

❌ testEuroEnDollar  — FAILED
   expected: <110.0> but was: <100.0>
```

---

## ⚠️ La tolérance pour les double

```java
// ❌ Sans tolérance — peut échouer !
assertEquals(110.0, calc.euroEnDollar(100));

// ✅ Avec tolérance
assertEquals(110.0, calc.euroEnDollar(100), 0.001);
```

👉 Java calcule parfois `100 * 1.10 = 110.00000000000001` !
👉 Sans tolérance, le test **échouerait** alors que le résultat est correct.
👉 `0.001` signifie : *"accepte si la différence est inférieure à 0.001"*.

---

## ✅ Validé le

Leçon 21 — JUnit — Validée ✅
