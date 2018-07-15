package main.java;

import javafx.application.Application;
import javafx.stage.Stage;
import main.java.backend.App;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author Zino
 * Created: 7/10/2018
 * @version 1.0
 *
 * Changelog:
 *
 * This is the main class of the app.
 */
public class TodoMain extends Application implements PropertyChangeListener  {

    private App application;

    public TodoMain() {
        this.application = new App();
        application.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getPropertyName());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the window.");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
