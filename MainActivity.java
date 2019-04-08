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


        equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_equipment();
            }
        });

        Button equipment = (Button) findViewById(R.id.btnEquip);
        Button time = (Button) findViewById(R.id.btnTime);
        Button meals = (Button) findViewById(R.id.btnMeal);
        Button mileage = (Button) findViewById(R.id.btnMiles);
        Button fuel = (Button) findViewById(R.id.btnFuel);
        Button maintenance = (Button) findViewById(R.id.btnMaint);
        Button settings = (Button) findViewById(R.id.btnSettings);

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_time();
            }
        });

        meals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_meal();
            }
        });

        mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_mileage();
            }
        });

        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_fuel();
            }
        });

        maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_maintenance();
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_settings();
            }
        });
    }

    public void activity_mileage() {
        Intent intent = new Intent(MainActivity.this, Mileage.class);
        startActivity(intent);
    }

    public void activity_time() {
        Intent intent = new Intent(this, Time.class);
        startActivity(intent);
    }

    public void activity_meal() {
        Intent intent = new Intent(this, Meals.class);
        startActivity(intent);
    }

    public void activity_equipment() {
        Intent intent = new Intent(this, Equipment.class);
        startActivity(intent);
    }

    public void activity_fuel() {
        Intent intent = new Intent(this, Fuel.class);
        startActivity(intent);
    }

    public void activity_maintenance() {
        Intent intent = new Intent(this, Maintenance.class);
        startActivity(intent);
    }

    public void activity_settings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
