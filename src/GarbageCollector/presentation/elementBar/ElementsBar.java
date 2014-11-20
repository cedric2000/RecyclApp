package GarbageCollector.presentation.elementBar;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class ElementsBar extends VBox {

    private final String[] nameElement  = {"Station","Convoyeur","Jonction","Sortie de matière","Entrée de matière"};
    private final String[] nameIcon  = {"station","convoyeur","junction","entryPoint","outPoint"};
    private boolean convoyeurActif =false;
            
    public ElementsBar()
    {
        this.setPrefSize(230, 400);
        
            /*========================
                    Titre
            ========================*/
        Label title = new Label("Reseau");
        title.getStyleClass().add("tileName");
        
        ImageView logoview = new ImageView(new Image("file:Ressources/Images/icons/arrow-down.png"));
        logoview.getStyleClass().add("tileimage");
        
        HBox titleBox = new HBox(2);
        titleBox.setSpacing(5);
        titleBox.setPadding(new Insets(0, 0, 0, 20));
        titleBox.getStyleClass().add("tileBox");
        titleBox.getChildren().addAll(title, logoview);
        
        
            /*========================
                 Liste d'éléments
            ========================*/
        
        ArrayList<Element> listElement = new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            Element element = new Element(nameElement[i], nameIcon[i]); 
            final Element e = element;
            if(i!=1)
            {
                element.setOnMousePressed(new EventHandler<MouseEvent>() 
                {
                    @Override 
                    public void handle(MouseEvent mouseEvent) 
                    {
                        e.setStyle("-fx-cursor: move;");
                    }
                });
                element.setOnMouseReleased(new EventHandler<MouseEvent>() 
                {
                    @Override 
                    public void handle(MouseEvent mouseEvent) 
                    {
                        e.setStyle("-fx-cursor: hand;");
                    }
                });
                
            }
            else{
                element.setOnMouseClicked(new EventHandler<MouseEvent>() 
                {
                    @Override 
                    public void handle(MouseEvent mouseEvent) 
                    {
                        if(convoyeurActif)
                            e.getStyleClass().remove("active");
                        else
                            e.getStyleClass().add("active");
                        convoyeurActif = !convoyeurActif;
                    }
                });
            }
            listElement.add(element);
        }
        
        
        this.setSpacing(25);
        this.setPadding(new Insets(20, 5, 0, 5));
        
        this.getChildren().add(titleBox);
        Iterator<Element> i = listElement.iterator();
        while(i.hasNext())
        {
            this.getChildren().add(i.next()); 
        }
        this.getStyleClass().add("elementsBar");
    }
        
}