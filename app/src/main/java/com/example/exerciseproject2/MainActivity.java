/* This is the second small exercise project based on the android tutorial part 2
*  This is used to practice how to open second activity and the google search */

package com.example.exerciseproject2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Opening the second activity inside our own app
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                // Passing information to our second activity:
                intent.putExtra("com.example.exerciseproject2.SOMETHING", "HELLO WORLD!");
                startActivity(intent);
            }
        });

        //Launching activity outside our android application
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "https://www.google.com";
                Uri webaddress = Uri.parse(google);
                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (goToGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogle);
                }
            }
        });
    }
}