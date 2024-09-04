package com.itheima.bean;

import java.io.Serial;
import java.io.Serializable;

public class Diary implements Serializable {
    @Serial
    private static final long serialVersionUID = 1656165192477786772L;
    private Integer index;
    private String title;
    private String context;

    public Diary() {
    }

    public Diary(int index, String title, String context) {
        this.index = index;
        this.title = title;
        this.context = context;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "index=" + index +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
