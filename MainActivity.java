package com.example.bds;

import android.Manifest;
import android.inputmethodservice.Keyboard;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.Cell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.biff.CellValue;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class MainActivity extends AppCompatActivity {

    public Button btnStart;
    public Button btnEnd;
    public Button btnTaxStart;
    public Button btnTaxEnd;
    EditText eDate;
    EditText eTime;
    EditText eOdometer;
    EditText eWaitTime;
    EditText eNumberStops;
    private static final String FILE_PATH = "E:\\OneDrive\\AppAccess\\Pagels Books 2019.xlsx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);
        btnEnd = findViewById(R.id.btnEnd);
        btnTaxStart = findViewById(R.id.btnTaxStart);
        btnTaxEnd = findViewById(R.id.btnTaxEnd);
        eDate = findViewById(R.id.eDate);
        eTime = findViewById(R.id.eTime);
        eOdometer = findViewById(R.id.eOdometer);
        eWaitTime = findViewById(R.id.eWaitTime);
        eNumberStops = findViewById(R.id.eNumberStops);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Start();
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                End();
            }
        });
        btnTaxStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TaxStart();
            }
        });
        btnTaxEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TaxEnd();
            }
        });

    }

    private void Start() {
    }

    private void End() {
    }

    private void TaxStart() {

    }

    private void TaxEnd() {
        String time = eTime.getText().toString();   //col 2
        String mile = eOdometer.getText().toString();  //col 4
        Workbook wb;
        Integer col;
        Integer row;
        try
        {
            wb = Workbook.getWorkbook(new File(FILE_PATH));
            Sheet s = wb.getSheet(0);

            for (int row=1; row < s.getRows(); row++) //worried about this loop setup, maybe getrows+1?
                if (s.getCell(2, row) == null) {

                } else {
                    continue;
                }
        }
        catch (BiffException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        eTime.setText("");
        eOdometer.setText("");

    }


}
