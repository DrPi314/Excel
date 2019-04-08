package com.example.contractortracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button equipment;
    public Button time;
    public Button meals;
    public Button mileage;
    public Button fuel;
    public Button maintenance;
    public Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equipment = (Button) findViewById(R.id.btnEquip);
        time = (Button) findViewById(R.id.btnTime);
        meals = (Button) findViewById(R.id.btnMeal);
        mileage = (Button) findViewById(R.id.btnMiles);
        fuel = (Button) findViewById(R.id.btnFuel);
        maintenance = (Button) findViewById(R.id.btnMaint);
        settings = (Button) findViewById(R.id.btnSettings);

        equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Equipment.class));
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Time.class));
            }
        });

        meals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Meals.class));
            }
        });

        mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Mileage.class));
            }
        });

        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Fuel.class));
            }
        });

        maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Maintenance.class));
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Settings.class));
            }
        });
    }
}