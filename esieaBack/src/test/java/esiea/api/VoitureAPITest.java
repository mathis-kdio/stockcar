package esiea.api;

import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.Test;

import esiea.metier.Voiture;

public class VoitureAPITest {

  @Test
  public void voitureFromJsonTest() {
    JSONObject json = new JSONObject();
    json.put("id", "0");
    json.put("marque", "Renault");
    json.put("modele", "Twingo");
    json.put("finition", "Dynamique");
    json.put("carburant", "E");
    json.put("km", "11111");
    json.put("annee", "2010");
    json.put("prix", "4000");
    VoitureAPI voitureApi = new VoitureAPI();
    Voiture voiture = voitureApi.voitureFromJson(json);
    assertEquals(voiture.getId(), 0);
    assertEquals(voiture.getMarque(), "Renault");
    assertEquals(voiture.getModele(), "Twingo");
    assertEquals(voiture.getFinition(), "Dynamique");
    assertEquals(voiture.getCarburant().toString(), "E");
    assertEquals(voiture.getKm(), 11111);
    assertEquals(voiture.getAnnee(), 2010);
    assertEquals(voiture.getPrix(), 4000);
  }
}
