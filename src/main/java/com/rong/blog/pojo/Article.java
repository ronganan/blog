package com.rong.blog.pojo;

public class Article {

    private int id;
    private String title;
    private String content;
    private int type;
    private String label;
    private int watch;
    private int star;
    private boolean state;
    private int aId;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setAId(int aId) {
        this.aId = aId;
    }
    public int getAId() {
        return this.aId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return this.type;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getLabel() {
        return this.label;
    }
    public void setWatch(int watch) {
        this.watch = watch;
    }
    public int getWatch() {
        return this.watch;
    }
    public void setStar(int star) {
        this.star = star;
    }
    public int getStar() {
        return this.star;
    }
    public void setState(Boolean state) {
        this.state = state;
    }
    public Boolean getState() {
        return this.state;
    }

}
