/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCollector.domaine;

/**
 *
 * @author etienneSanquer
 */
public class TypeProduit {
    private String _nomTypeProduit;
    
    public TypeProduit(String nom){
        this._nomTypeProduit = nom;
    }
    
    public void setNomTypeProduit(String nom){
        this._nomTypeProduit=nom;
    }
    public String getNomTypeProduit(){
        return this._nomTypeProduit;
    }

    @Override
    public String toString() {
        return "TypeProduit{" + "_nomTypeProduit=" + _nomTypeProduit + '}';
    }
    
    
}
