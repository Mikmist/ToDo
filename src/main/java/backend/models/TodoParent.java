package backend.models;

/**
 * @author Zino
 * Created: 7/10/2018
 * Package: backend.models
 * @version 1.0
 */
public class TodoParent extends TodoBase {

    private TodoChild[] child;

    public TodoParent(String title, String[] summary) {
        super(title, summary);
    }

    public TodoChild[] getChild() {
        return child;
    }

    public void setChild(TodoChild[] child) {
        this.child = child;
    }
}
