package esiea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;

import org.apache.log4j.Logger;

import esiea.metier.Voiture;
import esiea.metier.Voiture.Carburant;
import utils.Configuration;
import utils.StringUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class VoitureDAOTest {
    Voiture voiture = new Voiture();

    public void Init_voiture() {
        voiture.setId(10);
        voiture.setMarque("test");
        voiture.setModele("test");
        voiture.setFinition("test");
        voiture.setCarburant(Carburant.ESSENCE);
        voiture.setKm(1);
        voiture.setAnnee(1901);
        voiture.setPrix(1);    
    }

    @Test
    public void add_voiture() {
        Init_voiture();
        int nb = 0;
        try {
            VoitureDAO vDao = new VoitureDAO();
            Voiture[] voitures = vDao.rechercherVoitures("test", 0, 0).getData();
            nb = voitures.length;
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
        try {
            VoitureDAO vDao = new VoitureDAO();
            vDao.ajouterVoiture(voiture);
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
        try {
            VoitureDAO vDao = new VoitureDAO();
            Voiture[] voitures = vDao.rechercherVoitures("test", 0, 0).getData();
            assertEquals(voitures.length, nb + 1);
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
    }

    @Test
    public void delete_voiture() {
        int id = 0;
        try {
            VoitureDAO vDao = new VoitureDAO();
            Voiture[] voitures = vDao.rechercherVoitures("test", 0, 0).getData();
            id = voitures[0].getId();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
        try {
            VoitureDAO vDao = new VoitureDAO();
            vDao.supprimerVoiture(Integer.toString(id));
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
        try {
            VoitureDAO vDao = new VoitureDAO();
            Voiture[] voitures = vDao.rechercherVoitures("test", 0, 0).getData();
            int[] ids = new int[voitures.length];
            int i = 0;
            for (Voiture voiture : voitures) {
                ids[i] = voiture.getId();
                i++;
            }
            final int final_id = id;
            assertFalse(Arrays.stream(ids).anyMatch(x -> x == final_id));
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
    }

}
