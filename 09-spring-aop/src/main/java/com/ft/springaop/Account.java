package com.ft.springaop;

public class Account {

    private String name;
    private String level;

    public Account(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
