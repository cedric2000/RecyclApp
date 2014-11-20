package GarbageCollector.domaine;

public class Station extends Equipement {
    private String _nom;
    private String _description;
    private int _longueur;
    private int _largeur;
    private MatriceRecuperation _matriceRecuperation;

    
    public Station(){
        super();
    }
    
    public Station(int x,int y, Graphe g){
        super(x,y,g);
    }
    
    public Station(int x, int y, Graphe g, int largeur, int longueur){
        this(x,y,g);
        this._largeur=largeur;
        this._longueur = longueur;
    }
    
    public Station(int x, int y, Graphe g, int largeur, int longueur, String nom, String description){
        this(x, y, g, largeur, longueur);
        this._description =description;
        this._nom=nom;
    }

    
    public void operation() {
            throw new UnsupportedOperationException();
    }

    @Override
    public void estConforme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void calculerSorties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void appliquerCalcul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the _nom
     */
    public String getNom() {
        return _nom;
    }

    /**
     * @param _nom the _nom to set
     */
    public void setNom(String _nom) {
        this._nom = _nom;
    }

    /**
     * @return the _description
     */
    public String getDescription() {
        return _description;
    }

    /**
     * @param _description the _description to set
     */
    public void setDescription(String _description) {
        this._description = _description;
    }

    /**
     * @return the _longueur
     */
    public int getLongueur() {
        return _longueur;
    }

    /**
     * @param _longueur the _longueur to set
     */
    public void setLongueur(int _longueur) {
        this._longueur = _longueur;
    }

    /**
     * @return the _largeur
     */
    public int getLargeur() {
        return _largeur;
    }

    /**
     * @param _largeur the _largeur to set
     */
    public void setLargeur(int _largeur) {
        this._largeur = _largeur;
    }

    /**
     * @return the _matriceRecuperation
     */
    public MatriceRecuperation getMatriceRecuperation() {
        return _matriceRecuperation;
    }

    /**
     * @param _matriceRecuperation the _matriceRecuperation to set
     */
    public void setMatriceRecuperation(MatriceRecuperation _matriceRecuperation) {
        this._matriceRecuperation = _matriceRecuperation;
    }

    @Override
    public String toString() {
        return "Station{"  +super.toString()+  " _nom=" + _nom + ", _description=" + _description + ", _longueur=" + _longueur + ", _largeur=" + _largeur + ", _matriceRecuperation=" + _matriceRecuperation + '}';
    }
    
    
}