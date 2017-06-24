package com.example.android.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by victo on 4/9/2017.
 */

public class WrittenAnswerActivity extends Activity {

    int i = 0, score = 0;
    TextView writtenQ;
    ImageView writtenImage;
    EditText writtenA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_written_answer);
        writtenQ = (TextView) findViewById(R.id.written_q);
        writtenImage = (ImageView) findViewById(R.id.written_image);
        writtenA = (EditText) findViewById(R.id.written_answer);

        Button buttonNextQuestion = (Button) findViewById(R.id.button_next_question);
        buttonNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    TextView answer = (TextView) findViewById(R.id.written_answer);
                    if (answer.getText().toString().equals("Tehran")) {
                        score++;
                    }
                    writtenQ.setText(R.string.written_q2);
                    writtenImage.setImageResource(R.drawable.capital_rabat);
                }

                if (i == 1) {
                    TextView answer = (TextView) findViewById(R.id.written_answer);
                    if (answer.getText().toString().equals("Rabat")) {
                        score++;
                    }
                    writtenQ.setText(R.string.written_q3);
                    writtenImage.setImageResource(R.drawable.capital_rome);
                }

                if (i == 2) {
                    TextView answer = (TextView) findViewById(R.id.written_answer);
                    if (answer.getText().toString().equals("Rome")) {
                        score++;
                    }
                    writtenQ.setText(R.string.written_q4);
                    writtenImage.setImageResource(R.drawable.caiptal_ankara);
                }

                if (i == 3) {
                    TextView answer = (TextView) findViewById(R.id.written_answer);
                    if (answer.getText().toString().equals("Ankara")) {
                        score++;
                    }
                    writtenQ.setText(R.string.written_q5);
                    writtenImage.setImageResource(R.drawable.capital_doha);
                } else if (i == 4) {
                    TextView answer = (TextView) findViewById(R.id.written_answer);
                    if (answer.getText().toString().equals("Doha")) {
                        score++;
                    }
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("result", score * 20);
                    setResult(Activity.RESULT_OK, returnIntent);
                    score = 0;
                    finish();
                }

                i++;
                writtenA.getText().clear();
            }
        });
    }
}


