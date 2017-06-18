package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.android.quizapp.R.id.multiple_a1;

/**
 * Created by victo on 4/9/2017.
 */

public class MultipleChoiceActivity extends Activity {
    int i = 0, score = 20;
    TextView multipleQ;
    CheckBox multipleA1, multipleA2, multipleA3, multipleA4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);
        multipleQ = (TextView) findViewById(R.id.multiple_q);
        multipleA1 = (CheckBox) findViewById(multiple_a1);
        multipleA2 = (CheckBox) findViewById(R.id.multiple_a2);
        multipleA3 = (CheckBox) findViewById(R.id.multiple_a3);
        multipleA4 = (CheckBox) findViewById(R.id.multiple_a4);

        Button buttonNextQuestion = (Button) findViewById(R.id.button_next_question);
        buttonNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    if (multipleA1.isChecked()) {
                        score--;
                    }
                    if (!multipleA2.isChecked()) {
                        score--;
                    }
                    if (multipleA3.isChecked()) {
                        score--;
                    }
                    if (multipleA4.isChecked()) {
                        score--;
                    }
                    multipleQ.setText(R.string.multiple_q2);
                    multipleA1.setText(R.string.multiple_q2_a1);
                    multipleA2.setText(R.string.multiple_q2_a2);
                    multipleA3.setText(R.string.multiple_q2_a3);
                    multipleA4.setText(R.string.multiple_q2_a4);
                }
                if (i == 1) {
                    if (!multipleA1.isChecked()) {
                        score--;
                    }
                    if (multipleA2.isChecked()) {
                        score--;
                    }
                    if (multipleA3.isChecked()) {
                        score--;
                    }
                    if (!multipleA4.isChecked()) {
                        score--;
                    }
                    multipleQ.setText(R.string.multiple_q3);
                    multipleA1.setText(R.string.multiple_q3_a1);
                    multipleA2.setText(R.string.multiple_q3_a2);
                    multipleA3.setText(R.string.multiple_q3_a3);
                    multipleA4.setText(R.string.multiple_q3_a4);
                }
                if (i == 2) {
                    if (!multipleA1.isChecked()) {
                        score--;
                    }
                    if (!multipleA2.isChecked()) {
                        score--;
                    }
                    if (!multipleA3.isChecked()) {
                        score--;
                    }
                    if (multipleA4.isChecked()) {
                        score--;
                    }
                    multipleQ.setText(R.string.multiple_q4);
                    multipleA1.setText(R.string.multiple_q4_a1);
                    multipleA2.setText(R.string.multiple_q4_a2);
                    multipleA3.setText(R.string.multiple_q4_a3);
                    multipleA4.setText(R.string.multiple_q4_a4);
                }
                if (i == 3) {
                    if (multipleA1.isChecked()) {
                        score--;
                    }
                    if (!multipleA2.isChecked()) {
                        score--;
                    }
                    if (multipleA3.isChecked()) {
                        score--;
                    }
                    if (!multipleA4.isChecked()) {
                        score--;
                    }
                    multipleQ.setText(R.string.multiple_q5);
                    multipleA1.setText(R.string.multiple_q5_a1);
                    multipleA2.setText(R.string.multiple_q5_a2);
                    multipleA3.setText(R.string.multiple_q5_a3);
                    multipleA4.setText(R.string.multiple_q5_a4);
                }

                if (i == 4) {
                    if (!multipleA1.isChecked()) {
                        score--;
                    }
                    if (multipleA2.isChecked()) {
                        score--;
                    }
                    if (!multipleA3.isChecked()) {
                        score--;
                    }
                    if (multipleA4.isChecked()) {
                        score--;
                    }
                    Intent goToFinishActivity = new Intent(MultipleChoiceActivity.this, FinishActivity.class);
                    goToFinishActivity.putExtra("multipleScore", score);
                    startActivity(goToFinishActivity);
                    score = 0;
                }
                i++;
                resetCheckbox();
            }
        });
    }

    public void resetCheckbox() {
        multipleA1.setChecked(false);
        multipleA2.setChecked(false);
        multipleA3.setChecked(false);
        multipleA4.setChecked(false);
    }

}

