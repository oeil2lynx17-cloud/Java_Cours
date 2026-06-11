import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Petite classe utilitaire de conversion et de comparaison.
 *
 * <p>Sert d'exemple pour les tests unitaires JUnit (Leçon 21).</p>
 *
 * @author  CHATELOT Dominique
 * @version 1.0
 */
public class Convertisseur {

    /**
     * Convertit un montant en euros en dollars, avec un taux fixe de 1,10.
     *
     * @param euro le montant en euros
     * @return le montant équivalent en dollars
     */
    public double euroEnDollar(double euro) {
        return euro * 1.10;
    }

    /**
     * Indique si une taille est considérée comme « grande » (180 cm ou plus).
     *
     * @param taille la taille en centimètres
     * @return true si la taille est supérieure ou égale à 180, false sinon
     */
    public boolean estGrand(int taille) {
        return taille >= 180;
    }
}

/**
 * Tests unitaires de la classe {@link Convertisseur} (Leçon 21 — JUnit).
 *
 * <p>Chaque méthode annotée {@code @Test} vérifie automatiquement
 * qu'une méthode de Convertisseur renvoie bien le résultat attendu.</p>
 */
public class ConvertisseurTest {

    Convertisseur calc = new Convertisseur();

    /**
     * Vérifie la conversion euro → dollar : 100 € doivent donner 110 $.
     *
     * <p>Le 3e argument (0.001) est la tolérance acceptée pour la comparaison
     * de nombres décimaux.</p>
     */
    @Test
    public void testEuroEnDollar() {
        assertEquals(110.0, calc.euroEnDollar(100), 0.001);
    }

    /**
     * Vérifie la méthode estGrand : vraie pour 185 cm, fausse pour 170 cm.
     */
    @Test
    public void testEstGrand() {
        assertTrue(calc.estGrand(185));
        assertFalse(calc.estGrand(170));
    }
}

