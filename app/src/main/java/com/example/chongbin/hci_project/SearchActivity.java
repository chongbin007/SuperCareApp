package com.example.chongbin.hci_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SearchView simpleSearchView = (SearchView) findViewById(R.id.search_activity);
        simpleSearchView.setIconifiedByDefault(false);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}