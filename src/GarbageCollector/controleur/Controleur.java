package GarbageCollector.controleur;

import GarbageCollector.domaine.Graphe;
import GarbageCollector.domaine.Equipement;
import GarbageCollector.domaine.Convoyeur;
import GarbageCollector.domaine.EntreeEquipement;
import GarbageCollector.domaine.SortieEquipement;

public class Controleur {
    
	//private Object _pileGraphesPrecedents;
	//private Object _pileGraphesSuivants;
	public GestionnairePersistance gestionnairePersistance;
	public Graphe graphe;
	public GestionnaireEquipement gestionnaireEquipement;
	public GestionnaireConvoyeur gestionnaireConvoyeur;
	public GestionnaireGraphe gestionnaireGraphe;
        

	public void nouvelEquipement(Equipement e) 
        {
            gestionnaireEquipement.ajouterEquipement(e);
		throw new UnsupportedOperationException();
	}

	public void supprimerEquipement(Equipement aIdEquipement) 
        {
                gestionnaireEquipement.supprimerEquipement(aIdEquipement);
		throw new UnsupportedOperationException();
	}

	public void modifierEquipement(Equipement aIdEquipement) 
        {
               gestionnaireEquipement.modifierEquipement(aIdEquipement);
		throw new UnsupportedOperationException();
	}

	public void nouveauConvoyeur(Convoyeur c) 
        {
                gestionnaireConvoyeur.ajouterConvoyeur(c);
		throw new UnsupportedOperationException();
	}

	public int modifierConvoyeur(Convoyeur c) 
        {
                
                gestionnaireConvoyeur.modifierConvoyeur(c);
		throw new UnsupportedOperationException();
	}

	public void supprimerConvoyeur( Convoyeur c) 
        {
                gestionnaireConvoyeur.supprimerConvoyeur(c);
		throw new UnsupportedOperationException();
	}
         
         //visualiserElement= Binding
	/*public void visualiseElement(Object aIdElement) 
        {
            //Je ne sais pas trop comment faire....
		throw new UnsupportedOperationException();
	}*/

        
	public void ajouterEntreeEquipement(EntreeEquipement aIdEquipement) 
        {
                gestionnaireEquipement.ajouterEntree(aIdEquipement);
		throw new UnsupportedOperationException();
	}

	public void supprimerEntreeEquipement(EntreeEquipement aIdEquipement) 
        {
                gestionnaireEquipement.supprimerEntreeEquipement(aIdEquipement);
		throw new UnsupportedOperationException();
	}
        
       
        public void supprimerSortieEquipement(SortieEquipement aIdEquipement)
        {
            gestionnaireEquipement.supprimerSortieEquipement(aIdEquipement);
            throw new UnsupportedOperationException();
        }
        
        
        public void findEquipementbyId(int IdEquipement)
        {
          gestionnaireEquipement.findEquipementById(IdEquipement);
          throw new UnsupportedOperationException();

        }
        
         public void findConvoyeurbySource(SortieEquipement source)
        {
          gestionnaireConvoyeur.findConvoyeurBySource(source);
          throw new UnsupportedOperationException();
        }
        
	public void enregistrerGraphe( Graphe g) 
        {
                gestionnairePersistance.enregistrerGraphe(g);
		throw new UnsupportedOperationException();
	}

	public void chargerGraphe(Graphe g) 
        {
                gestionnairePersistance.chargerGraphe(g);
		throw new UnsupportedOperationException();
	}
        
	public void annulerOperation() 
        {
                //gestionnaireGraphe.annulerOperation();
		throw new UnsupportedOperationException();
	}

	public void retablirOperation() 
        {
                //GestionnaireGraphe.retablirOperation();
		throw new UnsupportedOperationException();
	}
}