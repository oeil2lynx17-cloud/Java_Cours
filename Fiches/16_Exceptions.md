# 📘 Lesson_16 — Les exceptions

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Exception** | Un problème qui survient pendant l'exécution |
| `try` | "Essaie" d'exécuter ce bloc |
| `catch` | "Attrape" l'erreur si ça plante |
| `finally` | S'exécute TOUJOURS — erreur ou pas |
| **Stacktrace** | Message d'erreur technique de Java |

---

## 🚗 L'analogie du pneu crevé

```
Conduite normale  →  try
Pneu crevé        →  exception
Gérer le problème →  catch
Reprendre la route→  finally
```

---

## 💻 Structure try / catch / finally

```java
try {
    // code qui peut planter
} catch (TypeException e) {
    // code si ça plante
} finally {
    // s'exécute toujours
}
```

---

## 💻 Code de référence

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tape un nombre :");
        int nombre = scanner.nextInt();

        try {
            int resultat = 100 / nombre;
            System.out.println("100 / " + nombre + " = " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro !");
        } finally {
            System.out.println("Fin du programme");
        }
    }
}
```

👉 Si l'utilisateur tape `0`, le programme **ne plante pas** : il attrape l'erreur et continue.

---

## 📊 Les exceptions courantes

| Exception | Cause |
|---|---|
| `ArithmeticException` | Division par zéro |
| `NullPointerException` | Objet qui n'existe pas |
| `ArrayIndexOutOfBoundsException` | Index de tableau inexistant |
| `NumberFormatException` | Convertir du texte en nombre impossible |

---

## ⚠️ Règles importantes

```
1. finally → TOUJOURS collé après catch
2. finally → s'exécute erreur ou pas
3. Sans try/catch → le programme plante (stacktrace)
4. catch → attrape UN type d'exception précis
```

---

## ❌ Erreur classique — finally mal placé

```java
// ❌ finally en dehors du try/catch (hors du main)
    } // ferme le main
    finally { ... }
}

// ✅ finally collé au catch, dans le main
        } catch (ArithmeticException e) {
            ...
        } finally {
            ...
        }
    } // ferme le main
}
```

---

## ✅ Validé le

Leçon 16 — Exceptions — Validée ✅
