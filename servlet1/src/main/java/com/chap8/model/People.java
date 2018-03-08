package com.chap8.model;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.print.attribute.standard.RequestingUserName;

public class People {
    private int id;
    private String name;
    private int age;

    public People() {
    }

    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
