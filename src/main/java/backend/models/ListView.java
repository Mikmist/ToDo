package main.java.backend.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zino
 * Created: 7/11/2018
 * Package: backend.models
 * @version 1.0
 */
public class ListView {

    private String title;
    private List<ParentCard> todoList;
    private String sortType;

    public ListView(String title, List<ParentCard> todoList, String sortType) {
        this.title = title;
        this.todoList = todoList;
        this.sortType = sortType;
    }

    public void addCard(ParentCard item) {
        if(this.todoList == null) {
            this.todoList = new ArrayList<>();
        }
        if(item != null) {
            this.todoList.add(item);
        }
    }

    public void removeCard(ParentCard item) {
        if(todoList != null) {
            this.todoList.remove(item);
        }
    }

    public String getSortType() {
        return this.sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public List<ParentCard> getTodoList() {
        return this.todoList;
    }

    public void setTodoList(List<ParentCard> todoList) {
        this.todoList = todoList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
