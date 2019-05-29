package com.yu.bean;

/**
 * @author yuyang
 * @create 2019-05-29 14:31
 */
public class UserEntry {
    public String id;
    public String name;

    public UserEntry(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEntry{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
