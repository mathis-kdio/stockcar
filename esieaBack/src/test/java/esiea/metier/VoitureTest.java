package esiea.metier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VoitureTest {
    Voiture voiture = new Voiture();

    @Test
    public void set_and_get_parameters() {
		this.voiture.setId(0);
        assertEquals(this.voiture.getId(), 0);
    }
    
}
