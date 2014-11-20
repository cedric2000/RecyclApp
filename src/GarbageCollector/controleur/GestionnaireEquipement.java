package GarbageCollector.controleur;

import GarbageCollector.domaine.EntreeEquipement;
import GarbageCollector.domaine.Equipement;
import GarbageCollector.domaine.Graphe;
import GarbageCollector.domaine.SortieEquipement;
import java.util.Iterator;
import java.util.List;


public class GestionnaireEquipement {
	private Graphe graphe;
        private Equipement equipement;
	//public Controleur _unnamed_Controleur_;

	public void ajouterEquipement(Equipement e) 
        {
                 graphe.ajouterEquipement(e);
		throw new UnsupportedOperationException();
	}

	public void supprimerEquipement(Equipement e) 
        {
                graphe.supprimerEquipement(e);
		throw new UnsupportedOperationException();
	}

        public void modifierEquipement(Equipement aIdEquipement) 
        {
               //equipement.modifierEquipement(aIdEquipement);
             //A rajouter dans la classe Equipement
		throw new UnsupportedOperationException();
	}
        
        
	public void ajouterEntree(EntreeEquipement entree) 
        {
                equipement.ajouteEntree(entree);
		throw new UnsupportedOperationException();
	}

	public void ajouterSortie(SortieEquipement sortie) 
        {
               equipement.ajouteSortie(sortie);
		throw new UnsupportedOperationException();
	}

	public void findEquipementById(int aIdEquipement) 
        {
           
             Equipement e;
             List<Equipement> listeEquipment =  graphe.getEquipements();   
             Iterator<Equipement> i = listeEquipment.iterator();
             while(i.hasNext()){
                 //TODO
                 if(i.next().getId()==aIdEquipement)
                 {
                     e=i.next();
                 }
                 
             }
             //return e;
                
		//throw new UnsupportedOperationException();
	}
        
        
        public void supprimerEntreeEquipement(EntreeEquipement aIdEquipement) 
        {
                equipement.supprimeEntree(aIdEquipement);
		throw new UnsupportedOperationException();
	}
        
       public void supprimerSortieEquipement(SortieEquipement aIdEquipement) 
        {
                equipement.supprimeSortie(aIdEquipement);
		throw new UnsupportedOperationException();
	}
         
       
        
        
}