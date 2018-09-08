package com.migue.a05_lab_exercise_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] programs = {
            "ABM",
            "BSIT",
            "BSCS",
            "BSCpE",
            "MSIT",
            "MSCS"};
    EditText et_fn, et_mn, et_ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> programDataSet = new ArrayList<>(Arrays.asList(programs));

        Spinner program_spinner = findViewById(R.id.sp_ap);
        Button send_button = findViewById(R.id.btn_send);
        et_fn = findViewById(R.id.et_fn);
        et_mn = findViewById(R.id.et_mn);
        et_ln = findViewById(R.id.et_ln);

        ProgramSpinnerAdapter adapter = new ProgramSpinnerAdapter(this, R.layout.activity_spinner, programDataSet);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        program_spinner.setAdapter(adapter);
        send_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Record Submitted", Toast.LENGTH_SHORT).show();
    }
}
