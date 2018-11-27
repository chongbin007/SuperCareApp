package com.example.chongbin.hci_project.sampledata;

import java.util.ArrayList;

public class FakeDataList {

    public ArrayList<DummyParentDataItem> getDummyDataToPass() {
        ArrayList<DummyParentDataItem> dummyDataItems = new ArrayList<>();
        ArrayList<DummyChildDataItem> dummyChildDataItems;
        DummyParentDataItem dummyParentDataItem;
        DummyChildDataItem dummyChildDataItem;
        /////////
        dummyParentDataItem = new DummyParentDataItem();
        dummyParentDataItem.setParentName("Department of dermatology");
        dummyChildDataItems = new ArrayList<>();
        //
        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor A");
        dummyChildDataItems.add(dummyChildDataItem);
        //
        dummyParentDataItem.setChildDataItems(dummyChildDataItems);
        dummyDataItems.add(dummyParentDataItem);
        ////////
        dummyParentDataItem = new DummyParentDataItem();
        dummyParentDataItem.setParentName("Department of stomatology");
        dummyChildDataItems = new ArrayList<>();
        //
        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor A");
        dummyChildDataItems.add(dummyChildDataItem);

        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor B");
        dummyChildDataItems.add(dummyChildDataItem);
        //
        dummyParentDataItem.setChildDataItems(dummyChildDataItems);
        dummyDataItems.add(dummyParentDataItem);
        ////////
        dummyParentDataItem = new DummyParentDataItem();
        dummyParentDataItem.setParentName("Department of orthopaedics");
        dummyChildDataItems = new ArrayList<>();
        //
        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor A");
        dummyChildDataItems.add(dummyChildDataItem);
        //
        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor B");
        dummyChildDataItems.add(dummyChildDataItem);
        //
        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor C");
        dummyChildDataItems.add(dummyChildDataItem);
        //
        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor D");
        dummyChildDataItems.add(dummyChildDataItem);
        //
        dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Doctor E");
        dummyChildDataItems.add(dummyChildDataItem);
        //
        dummyParentDataItem.setChildDataItems(dummyChildDataItems);
        dummyDataItems.add(dummyParentDataItem);
        ////////
        return dummyDataItems;
    }
}
