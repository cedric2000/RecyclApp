
package GarbageCollector.presentation.menu;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonIcon extends Button{
     ImageView icon;
            
    public ButtonIcon(String iconName)
    {
        icon= new ImageView(new Image("file:Ressources/Images/icons/"+iconName+".png"));
        this.setGraphic(icon);
        
        this.setPrefSize(40, 40);
        this.getStyleClass().add("buttonIcon");
    }
}
