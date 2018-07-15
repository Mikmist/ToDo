package main.java.backend.models;

/**
 * @author Zino
 * Created: 7/10/2018
 * Package: backend.models
 * @version 1.0
 */
public class ChildCard extends BaseCard {

    private ParentCard parent;
    private ChildCard[] child;

    public ChildCard(String title, String[] summary) {
        super(title, summary);
    }

    public ParentCard getParent() {
        return parent;
    }

    public void setParent(ParentCard parent) {
        this.parent = parent;
    }

    public ChildCard[] getChild() {
        return child;
    }

    public void setChild(ChildCard[] child) {
        this.child = child;
    }
}
