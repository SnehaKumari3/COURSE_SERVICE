package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;

    public Courses( String title,String description){
        this.title=title;
        this.description = description;
    }
    public Courses(){
        super();
    }


    public long getId(){
        return id;
    }
    public void setId(){}
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return "Course [id =" + id + ",title = " + title + ", description = " + description +"]";
    }
}
