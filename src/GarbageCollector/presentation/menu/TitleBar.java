
package GarbageCollector.presentation.menu;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class TitleBar extends HBox 
{
    public TitleBar ()
    {
        Label title = new Label("RecyclApp");
        title.setText("RecyclApp");
        title.getStyleClass().add("title");

        ImageView logoview = new ImageView(new Image("file:Ressources/Images/logo.png"));
        logoview.setFitWidth(50);
        logoview.setPreserveRatio(true);
        logoview.setSmooth(true);
        logoview.setCache(true);
        logoview.getStyleClass().add("logo");

        this.setPrefSize(230, 70);
        this.getChildren().addAll(title, logoview);
        this.getStyleClass().add("titleBox");
    }
}