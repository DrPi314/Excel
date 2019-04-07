package com.example.contractortracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button equipment;
    private Button time;
    private Button meals;
    private Button mileage;
    private Button fuel;
    private Button maintenance;
    private Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mileage = (Button) findViewById(R.id.btnMiles);
        mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_mileage();
            }
        });
    }

    public void activity_mileage() {
        Intent intent = new Intent(this, Mileage.class);
        startActivity(intent);
    }
}
