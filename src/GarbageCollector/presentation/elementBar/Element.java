
package GarbageCollector.presentation.elementBar;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Element extends HBox{
    private String name;
    private String imageName;

    public Element(String name, String imageName) 
    {        
        this.name = name;
        this.imageName = imageName;
        
        Label title = new Label(name);
        title.getStyleClass().add("elementName");

        ImageView logoview = new ImageView(new Image("file:Ressources/Images/icons/"+imageName+".png"));
        logoview.setSmooth(true);
        logoview.setCache(true);
        logoview.getStyleClass().add("elementImage");

        this.setSpacing(15);
        this.setPadding(new Insets(2, 0,2, 30));
        this.setPrefSize(150, 35);
        this.getChildren().addAll(logoview, title);
        this.getStyleClass().add("element");
    }

}
