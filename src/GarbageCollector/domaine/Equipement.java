package GarbageCollector.domaine;

import java.util.List;
import java.util.ArrayList;

public abstract class Equipement {
        private static Integer nextId;
	protected Integer _id;
	protected Integer _positionX; // en mètres
	protected Integer _positionY; // en mètres
	protected Graphe _graphe;
	private List<EntreeEquipement> _entreeEquipement;
        private List<SortieEquipement> _sortieEquipement;
        
        public Equipement(){
        if(nextId==null){
            nextId = new Integer(0);
        }
        this._entreeEquipement = new ArrayList<>();
	this._sortieEquipement = new ArrayList<>();
        this._id = nextId;
        nextId++;
        }
        
        public Equipement(int x, int y, Graphe g)
        {
            this();
            this._positionX = x;
            this._positionY = y;
            this._graphe = g;
        }
        
        public abstract void estConforme();

	    
        public void ajouteEntree(EntreeEquipement entree) {
            this.getEntreeEquipement().add(entree);
        }

        public void ajouteSortie(SortieEquipement sortie) {
            this.getSortieEquipement().add(sortie);
        }

        public void supprimeSortie(SortieEquipement sortie) {
            this.getSortieEquipement().remove(sortie);
        }

        public void supprimeEntree(EntreeEquipement entree) {
            this.getEntreeEquipement().remove(entree);
        }

	public void setPosition(int x, int y) {
		this._positionX=x;
                this._positionY=y;
	}
        public void setGaphe(Graphe g){
            this._graphe=g;
        }
        public Graphe getGraphe(){
            return this._graphe;
        }
        
        public Integer getId(){
            return this._id;
        }

	public abstract void calculerSorties();
	public abstract void appliquerCalcul();

    /**
     * @return the _entreeEquipement
     */
    public List<EntreeEquipement> getEntreeEquipement() {
        return _entreeEquipement;
    }

    /**
     * @return the _sortieEquipement
     */
    public List<SortieEquipement> getSortieEquipement() {
        return _sortieEquipement;
    }

    @Override
    public String toString() {
        return "Equipement{" + "_id=" + _id + ", _positionX=" + _positionX + ", _positionY=" + _positionY + '}';
    }
	
}