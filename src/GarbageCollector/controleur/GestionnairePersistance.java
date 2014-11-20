package GarbageCollector.controleur;

import GarbageCollector.domaine.Graphe;
import GarbageCollector.serviceTechnique.ServicePersistance;

public class GestionnairePersistance {
	//private Graphe _graphe;
    //public Controleur _unnamed_Controleur_;
     private ServicePersistance servicePersistance;

     
	public void serialiserGraphe(Graphe g) 
        {
                servicePersistance.serialiserGraphe(g);
		throw new UnsupportedOperationException();
	}

	public void enregistrerGraphe(Graphe g)
        {
                servicePersistance.enregistrerGraphe(g);
		throw new UnsupportedOperationException();
	}

	public void chargerGraphe(Graphe g) 
        {
                servicePersistance.chargerGraphe(g);
		throw new UnsupportedOperationException();
	}
        
       
        public void deserialiserGraphe(Graphe g) 
        {
                servicePersistance.deserialiserGraphe(g);
		throw new UnsupportedOperationException();
	}
        
        
}