package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitName(View view) {
        EditText userNameET = (EditText) findViewById(R.id.user_name);
        String userName = userNameET.getText().toString();

        Intent menuActivityIntent = new Intent(this, MenuActivity.class);
        menuActivityIntent.putExtra("UserName", userName);
        startActivity(menuActivityIntent);
    }
}
