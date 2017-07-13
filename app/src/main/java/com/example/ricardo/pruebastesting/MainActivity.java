package com.example.ricardo.pruebastesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        okButton = (Button) findViewById(R.id.okButton);
        okButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == okButton) {
            Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
        }
    }
}
