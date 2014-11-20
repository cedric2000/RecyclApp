package GarbageCollector.domaine;

import java.util.ArrayList;
import java.util.List;

public class SortieEquipement {

    private Equipement _equipement;
    private Convoyeur _convoyeur;
    private List<FluxMatiere> _fluxMatiere;

    public SortieEquipement(){
    this._fluxMatiere = new ArrayList<>();
    }


    public SortieEquipement(Equipement e){
        this();
        this._equipement=e;
    }

    public SortieEquipement(Equipement e,Convoyeur c){
        this(e);
        this._convoyeur=c;  
    }

    public void ajouteFluxMatiere(FluxMatiere f) {
            this._fluxMatiere.add(f);
    }

    public void supprimeFluxMatiere(FluxMatiere f) {
            this._fluxMatiere.remove(f);
    }

    public Convoyeur getConvoyeur() {
            return this._convoyeur;
    }
    public void setConvoyeur(Convoyeur c){
        this._convoyeur=c;
    }
    public Equipement getEquipement(){
        return this._equipement;
    }

    
}