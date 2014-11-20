package GarbageCollector.presentation.graph.information;

import javafx.event.EventType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class InformationStation extends VBox
{
    String nom, description;
    int nbSorties;
    int matriceRecup[][] = {{0,0},{0,0}};

    public InformationStation()//String nom, String description, int nbSorties, int matriceRecup[][]) 
    {
        this.nom = "Tri Papier/fer";
        this.description = "Ba du cout sa trie du papier et du fer pardis";
        this.nbSorties = 2;
        
        this.setPrefSize(230, 400);
        
        Label title = new Label("Station ");
        title.setPrefSize(230, 50);
        title.getStyleClass().add("tileInformation");
        
        this.getChildren().add(title);
        this.getStyleClass().add("informationStation");
        
    }

}