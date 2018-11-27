package com.example.chongbin.hci_project.sampledata;

import java.io.Serializable;

public class DummyChildDataItem implements Serializable {
    public String childName;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
}