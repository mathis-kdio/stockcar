package esiea.metier;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import esiea.metier.Voiture.Carburant;

@RunWith(Parameterized.class)
public class VoitureTest {
    Voiture voiture = new Voiture();

    @Test
    public void test_set_and_get_parameters() {
		this.voiture.setId(0);
        assertEquals(this.voiture.getId(), 0);
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { true, 1, "testMarque", "testModele", "testFinition", Carburant.ESSENCE, 1, 1901, 1 },
            { false, -1, "testMarque", "testModele", "testFinition", Carburant.ESSENCE, 1, 1901, 1 },
            { false, 1, null, "testModele", "testFinition", Carburant.ESSENCE, 1, 1901, 1 },
            { false, 1, "", "testModele", "testFinition", Carburant.ESSENCE, 1, 1901, 1 },
            { false, 1, "testMarque", null, "testFinition", Carburant.ESSENCE, 1, 1901, 1 },
            { false, 1, "testMarque", "", "testFinition", Carburant.ESSENCE, 1, 1901, 1 },
            { false, 1, "testMarque", "testModele", null, Carburant.ESSENCE, 1, 1901, 1 },
            { false, 1, "testMarque", "testModele", "", Carburant.ESSENCE, 1, 1901, 1 },
            { false, 1, "testMarque", "testModele", "testFinition", null, 1, 1901, 1 },
            { false, 1, "testMarque", "testModele", "testFinition", Carburant.ESSENCE, -1, 1901, 1 },
            { false, 1, "testMarque", "testModele", "testFinition", Carburant.ESSENCE, 1, 1850, 1 },
            { false, 1, "testMarque", "testModele", "testFinition", Carburant.ESSENCE, 1, 3000, 1 }
        });
    }
    @Parameter
    public Boolean testExpected;
    @Parameter(1)
    public int testId;
    @Parameter(2)
    public String testMarque;
    @Parameter(3)
    public String testModele;
    @Parameter(4)
    public String testFinition;
    @Parameter(5)
    public Carburant testCarburant;
    @Parameter(6)
    public int testKm;
    @Parameter(7)
    public int testAnnee;
    @Parameter(8)
    public int testPrix;

    @Test
    public void test_check() {
		this.voiture.setId(testId);
        this.voiture.setMarque(testMarque);
        this.voiture.setModele(testModele);
        this.voiture.setFinition(testFinition);
        this.voiture.setCarburant(testCarburant);
        this.voiture.setKm(testKm);
        this.voiture.setAnnee(testAnnee);
        this.voiture.setPrix(testPrix);
        assertEquals(testExpected, this.voiture.check());
    }

    @Test
    public void test_getTypeDonnee_marque() {
        assertEquals(Voiture.getTypeDonnee("marque"), "string");
    }

    @Test
    public void test_getTypeDonnee_modele() {
        assertEquals(Voiture.getTypeDonnee("modele"), "string");
    }

    @Test
    public void test_getTypeDonnee_finition() {
        assertEquals(Voiture.getTypeDonnee("finition"), "string");
    }

    @Test
    public void test_getTypeDonnee_id() {
        assertEquals(Voiture.getTypeDonnee("id"), "entier");
    }

    @Test
    public void test_getTypeDonnee_annee() {
        assertEquals(Voiture.getTypeDonnee("annee"), "entier");
    }

    @Test
    public void test_getTypeDonnee_km() {
        assertEquals(Voiture.getTypeDonnee("km"), "entier");
    }

    @Test
    public void test_getTypeDonnee_prix() {
        assertEquals(Voiture.getTypeDonnee("prix"), "entier");
    }

    @Test
    public void test_getTypeDonnee_test() {
        assertEquals(Voiture.getTypeDonnee("test"), "");
    }
}
