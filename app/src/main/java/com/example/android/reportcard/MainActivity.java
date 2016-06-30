package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of ReportCard objects
        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();
        reportCards.add(new ReportCard("Maximiliano Pombo", 90, 60, 95));
        reportCards.add(new ReportCard("Carlos Gomez", 60, 65, 45));
        reportCards.add(new ReportCard("Juana Perez", 63, 34, 87));
        reportCards.add(new ReportCard("Luisa Wave", 12, 23, 87));
        reportCards.add(new ReportCard("Tomas Auchain", 16, 76, 43));
        reportCards.add(new ReportCard("Fernando Trun", 76, 87, 57));
        reportCards.add(new ReportCard("Elisa Bonino", 83, 84, 34));
        reportCards.add(new ReportCard("Paula Chiarino", 90, 98, 91));


    }
}
