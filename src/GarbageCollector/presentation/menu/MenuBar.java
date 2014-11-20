package GarbageCollector.presentation.menu;

import javafx.scene.layout.HBox;

public class MenuBar extends HBox {

    public MenuBar() 
    {
        int height = 80;
        
        this.setPrefHeight(height);
        this.setMinHeight(height);
        this.setMaxHeight(height);
 
        TitleBar titleBox = new TitleBar();
        ToolBar toolBar = new ToolBar();
        this.getChildren().addAll(titleBox, toolBar);   
    }
    
}