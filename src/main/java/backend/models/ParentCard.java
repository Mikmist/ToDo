package main.java.backend.models;

/**
 * @author Zino
 * Created: 7/10/2018
 * Package: backend.models
 * @version 1.0
 */
public class ParentCard extends BaseCard {

    private ChildCard[] child;

    public ParentCard(String title, String[] summary) {
        super(title, summary);
    }

    public ChildCard[] getChild() {
        return child;
    }

    public void setChild(ChildCard[] child) {
        this.child = child;
    }
}
