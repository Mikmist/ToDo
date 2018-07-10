package backend.models;

/**
 * @author Zino
 * Created: 7/10/2018
 * Package: backend.models
 * @version 1.0
 *
 * A base class for the backend TodoObjects.
 */
public abstract class TodoBase {

    private String title;
    private String[] summary;
    private Boolean finished;

    public TodoBase(String title, String[] summary, Boolean finished) {
        this.title = title;
        this.summary = summary;
        this.finished = finished;
    }

    public TodoBase(String title, String[] summary) {
        this(title, summary, false);
    }

    public TodoBase(String title) {
        this(title, null, false);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getContent() {
        return summary;
    }

    public void setContent(String[] content) {
        this.summary = content;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
}
