package GarbageCollector.domaine;

import java.util.ArrayList;
import java.util.List;

public class EntreeUsine extends Equipement {

    private List<FluxMatiere> fluxEntrants;
    
    public EntreeUsine(){
        
        super();
        fluxEntrants = new ArrayList<>();
    }
    
    public void estConforme() {
            throw new UnsupportedOperationException();
    }

    @Override
    public void ajouteEntree(EntreeEquipement entree) {
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
    public void supprimeEntree(EntreeEquipement entree) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the fluxEntrants
     */
    public List<FluxMatiere> getFluxEntrants() {
        return fluxEntrants;
    }
    
    
    public void ajouterFluxEntrant(FluxMatiere f){
        this.fluxEntrants.add(f);
    }

    @Override
    public String toString() {
        
        return "EntreeUsine{" +super.toString()+ " fluxEntrants=" + fluxEntrants + '}';
    }
    
    
}