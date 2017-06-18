package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by victo on 4/9/2017.
 */

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent UserNameFromMainActivity = getIntent();
        String UserName = UserNameFromMainActivity.getExtras().getString("UserName");
        TextView UserNameMenuActivity = (TextView) findViewById(R.id.welcome);
        UserNameMenuActivity.setText("Welcome " + UserName + "!");

        Button buttonMultipleChoice = (Button) findViewById(R.id.button_multiple_choice);
        buttonMultipleChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMultipleChoice = new Intent(MenuActivity.this, MultipleChoiceActivity.class);
                startActivity(goToMultipleChoice);
            }
        });

        Button buttonOneOption = (Button) findViewById(R.id.button_one_option);
        buttonOneOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToOneOption = new Intent(MenuActivity.this, OneOptionActivity.class);
                startActivity(goToOneOption);
            }
        });

        Button buttonWrittenActivity = (Button) findViewById(R.id.button_written_answer);
        buttonWrittenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToWrittenAnswer = new Intent(MenuActivity.this, WrittenAnswerActivity.class);
                startActivity(goToWrittenAnswer);
            }
        });
    }
}
