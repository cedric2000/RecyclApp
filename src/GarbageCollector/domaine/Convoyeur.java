package GarbageCollector.domaine;

public class Convoyeur {
        private static Integer nextId;
        private static Float debitDefaut;
        
	private Integer _id;
	private String _couleur;
	private Float _debitMax;
	private Graphe _graphe;
	private SortieEquipement _sortieEquipement;
	private EntreeEquipement _entreeEquipement;

        
        public Convoyeur(){
            if(nextId==null){
                nextId = new Integer(0);
            }
            this._id = nextId;
            nextId++;
            this._debitMax = debitDefaut;
        }
        
        public Convoyeur(SortieEquipement sortie, EntreeEquipement entree){
            this();
            this._entreeEquipement = entree;
            this._sortieEquipement = sortie;
        }
        
	public void setEntreeEquipement( EntreeEquipement e) {
		this._entreeEquipement=e;
                e.setConvoyeur(this);
	}

	public void setSortieEquipement(SortieEquipement s) {
		this._sortieEquipement = s;
                s.setConvoyeur(this);
	}
        
        public EntreeEquipement getEntreeEquipement(){
            return this._entreeEquipement;
        }
        public SortieEquipement getSortieEquipement(){
            return this._sortieEquipement;
        }
        
	public void estConforme() {
		throw new UnsupportedOperationException();
	}

    @Override
    public String toString() {
        return "Convoyeur{" + "_id=" + getId() + ", _couleur=" + _couleur + ", _debitMax=" + _debitMax + '}';
    }

    /**
     * @return the _id
     */
    public Integer getId() {
        return _id;
    }
        
}