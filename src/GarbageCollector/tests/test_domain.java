/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCollector.tests;

import GarbageCollector.domaine.Convoyeur;
import GarbageCollector.domaine.EntreeEquipement;
import GarbageCollector.domaine.EntreeUsine;
import GarbageCollector.domaine.Graphe;
import GarbageCollector.domaine.SortieEquipement;
import GarbageCollector.domaine.Station;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 *
 * @author etienneSanquer
 */
public class test_domain extends Application{
    public static void testGraphe(){
        Graphe graphe = new Graphe();
        EntreeUsine entree = new EntreeUsine();
        entree.ajouteSortie(new SortieEquipement(entree));
        
        Station station = new Station(10, 10, graphe);
        station.ajouteEntree(new EntreeEquipement(station));
        graphe.ajouterEquipement(entree);
        graphe.ajouterEquipement(station);
        
        
        
        Convoyeur conv = new Convoyeur();
        conv.setEntreeEquipement(station.getEntreeEquipement().get(0));
        conv.setSortieEquipement(entree.getSortieEquipement().get(0));
         
        graphe.ajouterConvoyeur(conv);
        System.out.println(graphe.toString());
        graphe.supprimerEquipement(station);
        System.out.println(graphe.toString());
        //graphe.ajouterConvoyeur(conv);
        
        
        
        
        
    }

    @Override
    public void start(Stage stage) throws Exception {
            this.testGraphe();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public static void main(String[] args) {
        launch(args);
        
    }
}
