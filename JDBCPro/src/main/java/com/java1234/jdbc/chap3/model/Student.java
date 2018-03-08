package com.java1234.jdbc.chap3.model;

import java.io.File;

/**
 * 学生模型
 */

public class Student {
    private int id;
    private String name;
    private File context;
    private File pic;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, File context) {
        this.id = id;
        this.name = name;
        this.context = context;
    }

    public Student(int id, String name, File context, File pic) {
        this.id = id;
        this.name = name;
        this.context = context;
        this.pic = pic;
    }

    public File getPic() {

        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public File getContext() {
        return context;
    }

    public void setContext(File context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "["+this.id+","+this.name+"]";
    }
}
