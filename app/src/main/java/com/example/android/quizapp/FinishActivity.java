package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by victo on 4/9/2017.
 */

public class FinishActivity extends Activity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        score = getIntent().getExtras().getInt("score");

        TextView congratulationsView = (TextView) findViewById(R.id.congratulations);
        if (score == 0) {
            congratulationsView.setText(R.string.boo);
        } else {
            congratulationsView.setText(R.string.congratulations);
        }
        TextView scoreView = (TextView) findViewById(R.id.final_score);

        scoreView.setText("You scored " + score + " points");
        Toast.makeText(this, "You scored " + score + " points", Toast.LENGTH_SHORT).show();

        Button buttonBackMenu = (Button) findViewById(R.id.button_back_menu);
        buttonBackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMenuActivity = new Intent(FinishActivity.this, MenuActivity.class);
                startActivity(goToMenuActivity);
            }
        });
    }
}
