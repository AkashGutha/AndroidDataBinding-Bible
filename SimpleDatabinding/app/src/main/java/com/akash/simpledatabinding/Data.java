package com.akash.simpledatabinding;

/**
 * Created by Home on 27-02-2017.
 */

public class Data {

    String title;
    int id;
    float value;
    char group;

    public Data(String title, int id, float value, char group) {
        this.title = title;
        this.id = id;
        this.value = value;
        this.group = group;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }
}
