package com.akash.listviewusingcustomadapterandlayout;


import java.util.Date;

public class Data {

    String name;
    int id;
    Date createdAt;

    public Data(String name, int id, Date createdAt) {
        this.name = name;
        this.id = id;
        this.createdAt = createdAt;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
