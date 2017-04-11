package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by victo on 4/9/2017.
 */

public class FinishActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        Intent getScoreFromMultipleChoiceActivity = getIntent();
        int scoreMultiple = getScoreFromMultipleChoiceActivity.getExtras().getInt("multipleScore");
        TextView multipleScore = (TextView) findViewById(R.id.final_score);
        if (scoreMultiple > 0) {
            multipleScore.setText("You scored\n" + scoreMultiple * 5 + "\n points");
        }

        Intent getScoreFromOneActivity = getIntent();
        int scoreOne = getScoreFromOneActivity.getExtras().getInt("oneScore");
        TextView oneScore = (TextView) findViewById(R.id.final_score);
        if (scoreOne > 0) {
            oneScore.setText("You scored\n" + scoreOne * 20 + "\n points");
        }
        Intent getScoreFromWrittenActivity = getIntent();
        int scoreWritten = getScoreFromWrittenActivity.getExtras().getInt("writtenScore");
        TextView writtenScore = (TextView) findViewById(R.id.final_score);
        if (scoreWritten > 0) {
            writtenScore.setText("You scored\n" + scoreWritten * 20 + "\n points");
        }
    }

    public void goToMenuActivity(View view) {
        Intent goToMenuActivity = new Intent(this, MenuActivity.class);
        startActivity(goToMenuActivity);
    }
}
