package GarbageCollector.domaine;

public class FluxMatiere {
	private float _debitKilogrammesParHeure; //en kg/heure
	private TypeProduit _typeProduit;

    /**
     * @return the _debitKilogrammesParHeure
     */
    public float getDebitKilogrammesParHeure() {
        return _debitKilogrammesParHeure;
    }

    /**
     * @param _debitKilogrammesParHeure the _debitKilogrammesParHeure to set
     */
    public void setDebitKilogrammesParHeure(float _debitKilogrammesParHeure) {
        this._debitKilogrammesParHeure = _debitKilogrammesParHeure;
    }

    /**
     * @return the _typeProduit
     */
    public TypeProduit getTypeProduit() {
        return _typeProduit;
    }

    /**
     * @param _typeProduit the _typeProduit to set
     */
    public void setTypeProduit(TypeProduit _typeProduit) {
        this._typeProduit = _typeProduit;
    }

    @Override
    public String toString() {
        return "FluxMatiere{" + "_debitKilogrammesParHeure=" + _debitKilogrammesParHeure + ", _typeProduit=" + _typeProduit + '}';
    }
        
    
        
        

}