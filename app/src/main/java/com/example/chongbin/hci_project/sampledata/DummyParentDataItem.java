package com.example.chongbin.hci_project.sampledata;

import java.io.Serializable;
import java.util.ArrayList;

public class DummyParentDataItem implements Serializable {
    public String parentName;
    public ArrayList<DummyChildDataItem> childDataItems;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public ArrayList<DummyChildDataItem> getChildDataItems() {
        return childDataItems;
    }

    public void setChildDataItems(ArrayList<DummyChildDataItem> childDataItems) {
        this.childDataItems = childDataItems;
    }
}