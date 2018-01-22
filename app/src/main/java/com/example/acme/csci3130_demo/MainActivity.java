package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText inputTfield;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        inputTfield = (EditText) findViewById(R.id.inputTfield);
        text1 = (TextView) findViewById(R.id.text1);

        button.setOnClickListener(new View.OnClickListener() {//this method will set textview value to edittext
            @Override
            public void onClick(View view) {
                text1.setText(inputTfield.getText());
            }
        });
    }
}
