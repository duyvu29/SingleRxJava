package com.example.singlerxjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class user {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("name")
    @Expose
    private String name;

    public user(int id, String title, String name) {
        this.id = id;
        this.title = title;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
