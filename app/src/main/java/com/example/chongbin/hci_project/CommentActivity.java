package com.example.chongbin.hci_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.chongbin.hci_project.message.ForumDataAdapter;
import com.example.chongbin.hci_project.sampledata.ForumDataItem;

import java.util.ArrayList;
import java.util.List;

public class CommentActivity extends AppCompatActivity {
    //a list to store all the products
    List<ForumDataItem> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    private void addFakeData(List<ForumDataItem> tempList) {
        //adding some items to our list
        tempList.add(
                new ForumDataItem(
                        1,
                        "Looking for.... ",
                        "Post requests for information about people you've lost touch with, and would like to contact again.",
                        "13.00 11.11.2018"
                ));
        tempList.add(
                new ForumDataItem(
                        1,
                        "pain from cellulitis",
                        "When will I see some improvement after being diagnosed with cellulitis. This pain is intense",
                        "13.04 11.11.2018"
                ));
        tempList.add(
                new ForumDataItem(
                        1,
                        "I'm having a hard swellings on...",
                        "It's starts very small and spread out over some weeks or months, it's hard when touched, the surface skin pill off as the ...",
                        "13.07 11.11.2018"
                ));
        tempList.add(
                new ForumDataItem(
                        1,
                        "I'm having a hard swellings on...",
                        "It's starts very small and spread out over some weeks or months, it's hard when touched, the surface skin pill off as the ...",
                        "13.07 11.11.2018"
                ));
        tempList.add(
                new ForumDataItem(
                        1,
                        "I'm having a hard swellings on...",
                        "It's starts very small and spread out over some weeks or months, it's hard when touched, the surface skin pill off as the ...",
                        "13.07 11.11.2018"
                ));
        tempList.add(
                new ForumDataItem(
                        1,
                        "I'm having a hard swellings on...",
                        "It's starts very small and spread out over some weeks or months, it's hard when touched, the surface skin pill off as the ...",
                        "13.07 11.11.2018"
                ));

    }
}
