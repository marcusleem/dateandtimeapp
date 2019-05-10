package com.marcus.p04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonDisplayTime;
    Button getButtonDisplayDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button = findViewById(R.id.buttonDisplayDate);
        Button = findViewById(R.id.buttonDisplayTime);
    }


    buttonDisplayTime.OnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View V) {
            String DisplayTime = "The time " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
            getButtonDisplayDate.setText(DisplayTime);




        }
    });



}
