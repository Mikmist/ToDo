package main.java.backend.models;

/**
 * @author Zino
 * Created: 7/10/2018
 * Package: backend.models
 * @version 1.0
 *
 * A base class for the backend TodoObjects.
 */
public abstract class BaseCard {

    private String title;
    private String[] summary;
    private String duration;
    private Boolean finished;

    BaseCard(String title, String[] summary) {
        this.title = title;
        this.summary = summary;
        this.finished = false;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
