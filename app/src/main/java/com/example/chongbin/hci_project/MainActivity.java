package com.example.chongbin.hci_project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.Toast;

import com.example.chongbin.hci_project.message.RecyclerDataAdapter;
import com.example.chongbin.hci_project.sampledata.DummyChildDataItem;
import com.example.chongbin.hci_project.sampledata.DummyParentDataItem;
import com.example.chongbin.hci_project.sampledata.FakeDataList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ShareActionProvider mShareActionProvider;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // set up the RecyclerView
        FakeDataList fakeDataList = new FakeDataList();
        mRecyclerView = findViewById(R.id.recyclerView);
        RecyclerDataAdapter recyclerDataAdapter = new RecyclerDataAdapter(fakeDataList.getDummyDataToPass());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(recyclerDataAdapter);
        mRecyclerView.setHasFixedSize(true);


        SearchView simpleSearchView = (SearchView) findViewById(R.id.search_main);
        simpleSearchView.setIconifiedByDefault(false);
        // perform set on query text listener event
        simpleSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent myIntent = new Intent(MainActivity.this, SearchActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // do something when text changes
                return false;
            }
        });


        AppCompatButton button1 = findViewById(R.id.button_search_hos);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(MainActivity.this, HospitalActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        AppCompatButton button2 = findViewById(R.id.button_help_sleep);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(MainActivity.this, SleepActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        AppCompatButton button3 = findViewById(R.id.button_forum);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent myIntent = new Intent(MainActivity.this, ForumActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_exit:
                finish();

                return true;
            case R.id.menu_share:
                Toast.makeText(MainActivity.this,"Share this app to your friends.",Toast.LENGTH_SHORT).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
