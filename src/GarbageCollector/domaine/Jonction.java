package GarbageCollector.domaine;

public class Jonction extends Equipement {

    public Jonction(){
        super();
    }
    
    public void estConforme() {
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
    public String toString() {
        return "Jonction{"  +super.toString()+  '}';
    }
    
    
}