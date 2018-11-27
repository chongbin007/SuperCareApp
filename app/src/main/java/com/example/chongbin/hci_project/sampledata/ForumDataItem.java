package com.example.chongbin.hci_project.sampledata;

public class ForumDataItem {
    private int id;
    private String title;
    private String shortdesc;
    private String price;


    public ForumDataItem(int id, String title, String shortdesc, String price) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.price = price;

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

    public String getShortdesc() {
        return shortdesc;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
