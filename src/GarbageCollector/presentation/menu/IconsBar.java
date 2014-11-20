
package GarbageCollector.presentation.menu;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class IconsBar extends HBox
{  
    private ButtonIcon activeButton;
    private final String[] nameIcons  = {"save","add","load","export","undo","redo", "grid", "zoom"};
    
    public IconsBar()
    {
        int height = 40;
        
        this.setPrefHeight(height);
        this.setMinHeight(height);
        this.setMaxHeight(height);
 
        ArrayList<ButtonIcon> listIcon = new ArrayList<>();
        for(String nameIcon : nameIcons)
        {
            ButtonIcon button = new ButtonIcon(nameIcon);
            final ButtonIcon buttonClick = button;
            button.setOnMouseClicked(new EventHandler<MouseEvent>() 
            {
                @Override 
                public void handle(MouseEvent mouseEvent) 
                {
                    if(buttonClick != activeButton)
                    {
                        activeButton.getStyleClass().remove("active");
                        buttonClick.getStyleClass().add("active");
                        activeButton = buttonClick;
                    }
                }
            });
            listIcon.add(button);
        }
        listIcon.get(0).getStyleClass().add("active");
        activeButton = listIcon.get(0);

        
        
        Button closeBtn = new Button("X");
        closeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Platform.exit();
            }
        });
        
        
        this.setSpacing(46);
        this.setPadding(new Insets(5, 5, 0, 55));
        Iterator<ButtonIcon> i = listIcon.iterator();
        while(i.hasNext())
        {
            this.getChildren().add(i.next()); 
        }
        this.getChildren().add(closeBtn);

        this.getStyleClass().add("toolPanel");
    }
}
