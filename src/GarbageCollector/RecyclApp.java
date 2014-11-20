
package GarbageCollector;

import GarbageCollector.presentation.elementBar.ElementsBar;
import GarbageCollector.presentation.graph.GridUI;
import GarbageCollector.presentation.graph.information.InformationStation;
import GarbageCollector.presentation.menu.MenuBar;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;


public class RecyclApp extends Application {
    
    class Delta { double x, y; } 
    
    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.initStyle(StageStyle.UNDECORATED);

        MenuBar menuBar = new MenuBar(); 
        ElementsBar elementPanel = new ElementsBar();
        InformationStation infoStation = new InformationStation();
        GridUI grid = new GridUI(60,900,500);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setLeft(elementPanel);
        borderPane.setCenter(grid);
        borderPane.setRight(infoStation);
        
        final Delta dragDelta = new Delta();
        final Stage stage = primaryStage;
        menuBar.setOnMousePressed(new EventHandler<MouseEvent>() 
        {
            @Override 
            public void handle(MouseEvent mouseEvent) 
            {
                // record a delta distance for the drag and drop operation.
                dragDelta.x = stage.getX() - mouseEvent.getScreenX();
                dragDelta.y = stage.getY() - mouseEvent.getScreenY();
             }
        });
        menuBar.setOnMouseDragged(new EventHandler<MouseEvent>() 
        {
            @Override 
            public void handle(MouseEvent mouseEvent) 
            {
                stage.setX(mouseEvent.getScreenX() + dragDelta.x);
                stage.setY(mouseEvent.getScreenY() + dragDelta.y);
            }
        });
 
        Scene scene = new Scene(borderPane, 1100, 600);
        scene.getStylesheets().add(RecyclApp.class.getResource("presentation/css/styleMenu.css").toExternalForm());
        scene.getStylesheets().add(RecyclApp.class.getResource("presentation/css/styleElementBar.css").toExternalForm());
        scene.getStylesheets().add(RecyclApp.class.getResource("presentation/css/styleInformation.css").toExternalForm());
        
        primaryStage.setTitle("Recycl App");
        primaryStage.setScene(scene);
        
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
