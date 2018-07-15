package main.java.backend;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author Zino
 * Created: 7/11/2018
 * Package: backend
 * @version 1.0
 * For more on how to use this: https://stackoverflow.com/questions/4987476/java-propertychangelistener
 */
public class App {

    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public App() {

    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changeSupport.removePropertyChangeListener(l);
    }
}
