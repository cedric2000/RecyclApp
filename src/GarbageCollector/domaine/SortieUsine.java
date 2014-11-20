package GarbageCollector.domaine;

public class SortieUsine extends Equipement {

        
        public SortieUsine(){
            super();
        }
	public void estConforme() {
		throw new UnsupportedOperationException();
	}

	public void ajouteEntree(EntreeEquipement aEntree) {
		throw new UnsupportedOperationException();
	}

	public void ajouteSortie(SortieEquipement aSortie) {
		throw new UnsupportedOperationException("ne doit pas etre appellé");
	}

	public void supprimeSortie(int aIdSortie) {
		throw new UnsupportedOperationException();
	}

	public void supprimeEntree(int aIdEntree) {
		throw new UnsupportedOperationException();
	}

    @Override
    public void calculerSorties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void appliquerCalcul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimeSortie(SortieEquipement sortie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimeEntree(EntreeEquipement entree) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        super.toString();
        return "SortieUsine{"  +super.toString()+ '}';
    }
    
    
}
