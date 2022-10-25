package esiea.api;

import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.Test;

import esiea.metier.Voiture;

public class VoitureAPITest {
  Voiture voiture = new Voiture();

  @Test
  public void voitureFromJsonTest() {
    JSONObject json = new JSONObject();
    json.put("id", "0");
    json.put("marque", "0");
    json.put("modele", "0");
    json.put("finition", "0");
    json.put("carburant", "0");
    json.put("km", "0");
    json.put("annee", "0");
    json.put("prix", "0");

    assertEquals(this.voiture.getId(), 0);
    assertEquals(this.voiture.getMarque(), 0);
    assertEquals(this.voiture.getModele(), 0);
    assertEquals(this.voiture.getFinition(), 0);
    assertEquals(this.voiture.getCarburant(), 0);
    assertEquals(this.voiture.getKm(), 0);
    assertEquals(this.voiture.getAnnee(), 0);
    assertEquals(this.voiture.getPrix(), 0);
  }
}
