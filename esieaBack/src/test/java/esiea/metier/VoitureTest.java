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
    public void set_and_get_parameters() {
		this.voiture.setId(0);
        assertEquals(this.voiture.getId(), 0);
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { true, 1, "testMarque", "testModele", "testFinition", Carburant.ESSENCE, 1, 1901, 1 },
            { false, -1, "testMarque", "testModele", "testFinition", Carburant.ESSENCE, 1, 1901, 1 }
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
    public void check() {
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
    public void getTypeDonnee() {
        assertEquals(Voiture.getTypeDonnee("marque"), "string");
        assertEquals(Voiture.getTypeDonnee("modele"), "string");
        assertEquals(Voiture.getTypeDonnee("finition"), "string");

        assertEquals(Voiture.getTypeDonnee("id"), "entier");
        assertEquals(Voiture.getTypeDonnee("annee"), "entier");
        assertEquals(Voiture.getTypeDonnee("km"), "entier");
        assertEquals(Voiture.getTypeDonnee("prix"), "entier");

        assertEquals(Voiture.getTypeDonnee("test"), "");
    }
}
