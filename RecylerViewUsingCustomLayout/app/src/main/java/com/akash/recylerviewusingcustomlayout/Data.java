package com.akash.recylerviewusingcustomlayout;

import java.util.Date;

/**
 * Created by Home on 28-02-2017.
 */

public class Data {
    String name;
    int id;
    Date createAt;

    public Data(String name, int id) {
        this.name = name;
        this.id = id;
        this.createAt = new Date();
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
