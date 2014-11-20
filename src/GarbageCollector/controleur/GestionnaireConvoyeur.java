package GarbageCollector.controleur;


import GarbageCollector.domaine.Graphe;
import GarbageCollector.domaine.Convoyeur;
import GarbageCollector.domaine.SortieEquipement;
import java.util.Iterator;
import java.util.List;

public class GestionnaireConvoyeur {
	private Graphe graphe;
        private Convoyeur convoyeur;
	
       

	public int ajouterConvoyeur(Convoyeur c) 
        {
                
               graphe.ajouterConvoyeur(c);
                
		throw new UnsupportedOperationException();
	}

	public void supprimerConvoyeur(Convoyeur c) 
        {
                graphe.supprimerConvoyeur(c);
		throw new UnsupportedOperationException();
	}
        
        public int modifierConvoyeur(Convoyeur c) 
        {
                //A rajouter dans la classe convoyeur une méthode modifierConvoyeur(convoyeur c)
                //convoyeur.modifierConvoyeur(c);
		throw new UnsupportedOperationException();
	}
        
         public  void  /*Convoyeur*/ findConvoyeurBySource(SortieEquipement aSortieEquipement_source) 
        {
            
            Convoyeur c;
             List<Convoyeur> listeConvoyeur = graphe.getConvoyeurs();
             Iterator<Convoyeur> i = listeConvoyeur.iterator();
             while(i.hasNext()){
                 //TODO
                 if(i.next().getSortieEquipement()==aSortieEquipement_source)
                 {
                     c=i.next();
                 }
                 
             }
            //return c;
            
		throw new UnsupportedOperationException();
	}
        
       
}