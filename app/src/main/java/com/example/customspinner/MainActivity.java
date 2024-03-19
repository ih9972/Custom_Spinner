package com.example.customspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private String[] names, capitals, population;
    private int[] flags;
    private ArrayList<State> states;
    private StateAdapter stateAdapter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAll();
        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.textView2);
        stateAdapter = new StateAdapter(this, states);
        spinner.setAdapter(stateAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    private void initAll() {
        names = new String[]
                {
                        "Alabama","Alaska","Arizona","Arkansas","California","Colorado",
                        "Connecticut"
                };
        flags = new int[]
                {
                        R.drawable.al, R.drawable.ak, R.drawable.az, R.drawable.ar, R.drawable.ca,
                        R.drawable.co, R.drawable.ct,
                };
        capitals = new String[]
                {
                        "Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver",
                        "Hartford"
                };
        population = new String[]
                {
                        "5,108,468", "733,406", "7,431,344", "3,067,732", "39,000,000",
                        "5,877,610","3,617,176"
                };
        states = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            states.add(new State(names[i],capitals[i],population[i],flags[i]));
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        State state = states.get(position);
        textView.setText("The state: "+state.getStateName() + "\nThe capital: " + state.getStateCapital() +
                "\nThe population: "+state.getStatePopulation());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}