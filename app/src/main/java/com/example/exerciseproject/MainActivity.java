/* Exercise 1 based on the tutorial 1 */

package com.example.exerciseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn = (Button) findViewById(R.id.addButton);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1EditText = (EditText) findViewById(R.id.editTextNumber1);
                EditText number2EditText = (EditText) findViewById(R.id.editTextNumber2);
                TextView resultTextView = (TextView) findViewById(R.id.textViewResult);
                int num1 = Integer.parseInt(number1EditText.getText().toString());
                int num2 = Integer.parseInt(number2EditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");


            }
        });
    }
}