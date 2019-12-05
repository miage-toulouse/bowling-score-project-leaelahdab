package miage.lela.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    @Before
    public void testJeuValide() throws Exception {
        //GIVEN : un jeu valide
        Jeu jeu1 = new Jeu(1,4); //A voir selon le constructeur
        //WHEN : je teste la validité
        boolean res = jeu1.isValid(); // méthode à implémenter
        //THEN : le résultat est positif
        assertTrue(res);

        // Version plus concise
        assertTrue(new Jeu(10).isValid());
        assertTrue(new Jeu(6,4).isValid());
    }

    @Test
    public void testJeuEstNonValide(){
        assertFalse(new Jeu(null, 2).isValid());
        assertFalse(new Jeu(null).isValid());

    }
}