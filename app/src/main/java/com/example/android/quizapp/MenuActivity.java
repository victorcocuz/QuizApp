package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    }

    public void goToMultipleChoice(View view) {
        Intent goToMultipleChoice = new Intent(this, MultipleChoiceActivity.class);
        startActivity(goToMultipleChoice);
    }

    public void goToOneOption(View view) {
        Intent goToOneOption = new Intent(this, OneOptionActivity.class);
        startActivity(goToOneOption);
    }

    public void goToWrittenAnswer(View view) {
        Intent goToWrittenAnswer = new Intent(this, WrittenAnswerActivity.class);
        startActivity(goToWrittenAnswer);
    }
}
