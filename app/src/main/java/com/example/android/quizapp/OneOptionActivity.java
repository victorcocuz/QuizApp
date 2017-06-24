package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * Created by victo on 4/9/2017.
 */

public class OneOptionActivity extends Activity {

    int i = 0, score = 0;
    TextView OneQ;
    RadioButton OneA1, OneA2, OneA3, OneA4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_option);

        OneQ = (TextView) findViewById(R.id.one_q);
        OneA1 = (RadioButton) findViewById(R.id.one_a1);
        OneA2 = (RadioButton) findViewById(R.id.one_a2);
        OneA3 = (RadioButton) findViewById(R.id.one_a3);
        OneA4 = (RadioButton) findViewById(R.id.one_a4);

        Button buttonNextQuestion = (Button) findViewById(R.id.button_next_question);
        buttonNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    if (OneA1.isChecked()) {
                        score++;
                    }
                    OneQ.setText(R.string.one_q2);
                    OneA1.setText(R.string.one_q2_a1);
                    OneA2.setText(R.string.one_q2_a2);
                    OneA3.setText(R.string.one_q2_a3);
                    OneA4.setText(R.string.one_q2_a4);
                }
                if (i == 1) {
                    if (OneA3.isChecked()) {
                        score++;
                    }
                    OneQ.setText(R.string.one_q3);
                    OneA1.setText(R.string.one_q3_a1);
                    OneA2.setText(R.string.one_q3_a2);
                    OneA3.setText(R.string.one_q3_a3);
                    OneA4.setText(R.string.one_q3_a4);
                }
                if (i == 2) {
                    if (OneA4.isChecked()) {
                        score++;
                    }
                    OneQ.setText(R.string.one_q4);
                    OneA1.setText(R.string.one_q4_a1);
                    OneA2.setText(R.string.one_q4_a2);
                    OneA3.setText(R.string.one_q4_a3);
                    OneA4.setText(R.string.one_q4_a4);
                }
                if (i == 3) {
                    if (OneA2.isChecked()) {
                        score++;
                    }
                    OneQ.setText(R.string.one_q5);
                    OneA1.setText(R.string.one_q5_a1);
                    OneA2.setText(R.string.one_q5_a2);
                    OneA3.setText(R.string.one_q5_a3);
                    OneA4.setText(R.string.one_q5_a4);
                } else if (i == 4) {
                    if (OneA4.isChecked()) {
                        score++;
                    }
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("result", score * 20);
                    setResult(Activity.RESULT_OK, returnIntent);
                    score = 0;
                    finish();
                }
                i++;
                resetRadioBox();
            }
        });
    }

    public void resetRadioBox() {
        OneA1.setChecked(false);
        OneA2.setChecked(false);
        OneA3.setChecked(false);
        OneA4.setChecked(false);
    }
}
