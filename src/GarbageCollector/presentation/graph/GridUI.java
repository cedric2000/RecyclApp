/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCollector.presentation.graph;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class GridUI extends Pane 
{
    private final int spacing;
    private final Canvas canvas = new Canvas();
 
    public GridUI(int spacing, int width, int height) 
    {
        this.spacing = spacing;
        canvas.setWidth(width);
        canvas.setHeight(height);
        
        this.setPrefSize(width, height);
        final int w = (int)canvas.getWidth();
        final int h = (int)canvas.getHeight();
        
        GraphicsContext g = canvas.getGraphicsContext2D();
        g.setStroke(Color.BLACK);

        for (int x = this.spacing; x < w; x += this.spacing)
            g.strokeLine(x, 0, x, h);
        for (int y = this.spacing; y < h; y += this.spacing)
            g.strokeLine(0, y, w, y);
        this.getChildren().add(canvas);
    }
    
    public int getSpacing() {
        return spacing;
    }
}