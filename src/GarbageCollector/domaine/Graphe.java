package GarbageCollector.domaine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class Graphe {
	private final List<Convoyeur> convoyeurs; 
	private final List<Equipement> equipements;

        
        public Graphe(){
        this.convoyeurs = new ArrayList<>(); // "diamond inference" : pas besoin de specifier le type pour le new
	this.equipements = new ArrayList<>();
        }
        
	public List<Convoyeur> getConvoyeurs() {
                return this.convoyeurs;
	}

	public List<Equipement> getEquipements() {
		return this.equipements;
	}

	public List<EntreeUsine> getEntreesUsine() {
            ArrayList<EntreeUsine> entreesUsine = new ArrayList<>();
            for(Iterator<Equipement> i = this.equipements.iterator(); i.hasNext();){
                if(i instanceof EntreeUsine){
                    entreesUsine.add((EntreeUsine)i);
                }
            }
            return entreesUsine;
	}
        
        public void ajouterEquipement(Equipement e){
            this.equipements.add(e);
        }
        public void ajouterConvoyeur(Convoyeur c){
            this.convoyeurs.add(c);
        }
        
        
        public void supprimerEquipement(Equipement e){
            //suppression des convoyeurs avant de supprimer l'équipement
            List<EntreeEquipement> entreesEquipement = e.getEntreeEquipement();
            for(int i = 0 ; i < entreesEquipement.size() ; i++){
                this.supprimerConvoyeur(entreesEquipement.get(i).getConvoyeur());
            }
            List<SortieEquipement> sortiesEquipement = e.getSortieEquipement();
            for(int i = 0 ; i < sortiesEquipement.size() ; i++){
                this.supprimerConvoyeur(sortiesEquipement.get(i).getConvoyeur());
            }
            this.equipements.remove(e);
        }
        
        public void supprimerConvoyeur(Convoyeur c){
                c.getEntreeEquipement().setConvoyeur(null);
                c.getSortieEquipement().setConvoyeur(null);
                this.convoyeurs.remove(c);
        }

    @Override
    public String toString() {
        return "Graphe{" + "convoyeurs=" + convoyeurs + ", equipements=" + equipements + '}';
    }
        
        
        
        
}