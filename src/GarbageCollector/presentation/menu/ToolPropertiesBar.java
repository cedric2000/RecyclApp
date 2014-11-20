
package GarbageCollector.presentation.menu;

import javafx.scene.layout.HBox;

public class ToolPropertiesBar extends HBox{

    
    public ToolPropertiesBar()
    {
        int height = 40;
        this.setPrefHeight(height);
        this.setMinHeight(height);
        this.setMaxHeight(height);
        
        this.getStyleClass().add("toolPropertiesPanel");
    }
}
