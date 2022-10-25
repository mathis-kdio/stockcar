package esiea.metier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import esiea.metier.Voiture.Carburant;

public class VoitureTest {
    Voiture voiture = new Voiture();

    @Test
    public void set_and_get_parameters() {
		this.voiture.setId(0);
        assertEquals(this.voiture.getId(), 0);
    }

    @Test
    public void check() {
		this.voiture.setId(1);
        this.voiture.setMarque("test");
        this.voiture.setModele("test");
        this.voiture.setFinition("test");
        this.voiture.setCarburant(Carburant.ESSENCE);
        this.voiture.setKm(1);
        this.voiture.setAnnee(1901);
        this.voiture.setPrix(1);
        assertEquals(this.voiture.check(), true);

        this.voiture.setId(-1);
        assertEquals(this.voiture.check(), false);
        this.voiture.setId(0);

        this.voiture.setMarque(null);
        assertEquals(this.voiture.check(), false);
        this.voiture.setMarque("");
        assertEquals(this.voiture.check(), false);
        this.voiture.setMarque("test");

        this.voiture.setModele(null);
        assertEquals(this.voiture.check(), false);
        this.voiture.setModele("");
        assertEquals(this.voiture.check(), false);
        this.voiture.setModele("test");

        this.voiture.setFinition(null);
        assertEquals(this.voiture.check(), false);
        this.voiture.setFinition("");
        assertEquals(this.voiture.check(), false);
        this.voiture.setFinition("test");

        this.voiture.setCarburant(null);
        assertEquals(this.voiture.check(), false);
        this.voiture.setCarburant(Carburant.ESSENCE);

        this.voiture.setKm(-1);
        assertEquals(this.voiture.check(), false);
        this.voiture.setKm(1);

        this.voiture.setAnnee(1850);
        assertEquals(this.voiture.check(), false);
        this.voiture.setAnnee(3000);
        assertEquals(this.voiture.check(), false);
        this.voiture.setAnnee(1901);

        this.voiture.setPrix(-1);
        assertEquals(this.voiture.check(), false);
    }
    
}
