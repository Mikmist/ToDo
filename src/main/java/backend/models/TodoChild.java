package backend.models;

/**
 * @author Zino
 * Created: 7/10/2018
 * Package: backend.models
 * @version 1.0
 */
public class TodoChild extends TodoBase {

    private TodoParent parent;
    private TodoChild[] child;

    public TodoChild(String title, String[] summary) {
        super(title, summary);
    }

    public TodoParent getParent() {
        return parent;
    }

    public void setParent(TodoParent parent) {
        this.parent = parent;
    }

    public TodoChild[] getChild() {
        return child;
    }

    public void setChild(TodoChild[] child) {
        this.child = child;
    }
}
