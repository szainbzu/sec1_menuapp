package com.example.sec1_menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.sec1_menuapp.model.DatabaseItems;

public class MainActivity extends AppCompatActivity {
    private Spinner spnItems;
    private Button btnSearch;
    private ListView lstItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
        populateSpinner();
    }

    private void populateSpinner() {
        DatabaseItems db = new DatabaseItems();
        String[] cats = db.getCategories();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, cats);
        spnItems.setAdapter(adapter);
    }

    private void setupViews() {
        spnItems = findViewById(R.id.spnCategories);
        btnSearch = findViewById(R.id.btnSearch);
        lstItems = findViewById(R.id.lstItems);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}