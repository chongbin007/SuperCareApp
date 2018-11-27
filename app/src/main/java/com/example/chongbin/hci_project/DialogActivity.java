package com.example.chongbin.hci_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.chongbin.hci_project.message.MessageListAdapter;


public class DialogActivity extends AppCompatActivity {
    private RecyclerView mMessageRecycler;
    private MessageListAdapter mMessageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AppCompatButton button1 = findViewById(R.id.button_chatbox_send);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Toast.makeText(DialogActivity.this,"Waiting for server connecting.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}