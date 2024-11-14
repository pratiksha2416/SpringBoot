package com.spring.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course {
    @Id
    private long id;
    private String title;
    private String description;



    public course(long id,String title, String description) {
       this.id=id;
        this.title = title;
        this.description = description;
    }

    public course() {
        super();

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
