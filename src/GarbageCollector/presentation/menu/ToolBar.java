
package GarbageCollector.presentation.menu;


import javafx.scene.layout.VBox;

public class ToolBar extends VBox{

    public ToolBar()
    {
        int height = 80;
        this.setPrefHeight(height);
        this.setMinHeight(height);
        this.setMaxHeight(height);
        
        IconsBar iconsBar = new IconsBar();
        ToolPropertiesBar toolPropertiesBar = new ToolPropertiesBar();
        this.getChildren().addAll(iconsBar, toolPropertiesBar);
    }
    
}
