package com.practice.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtFirstName, txtLastName, txtEmail;
    private EditText fldFirstName, fldLastName, fldEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstName = (TextView) findViewById(R.id.txtFirstName);
        txtLastName = (TextView) findViewById(R.id.txtLastName);
        txtEmail = (TextView) findViewById(R.id.txtEmail);

        fldFirstName = (EditText) findViewById(R.id.fldFirstName);
        fldLastName = (EditText) findViewById(R.id.fldLastName);
        fldEmail = (EditText) findViewById(R.id.fldEmail);
    }

    public void onSubmit(View view) {
        txtFirstName.setText(
                String.format("%s%s",
                        getResources().getString(R.string.txtFirstName),
                        fldFirstName.getText().toString()
                )
        );

        txtLastName.setText(
                String.format("%s%s",
                        getResources().getString(R.string.txtLastName),
                        fldLastName.getText().toString()
                )
        );

        txtEmail.setText(
                String.format("%s%s",
                        getResources().getString(R.string.txtEmail),
                        fldEmail.getText().toString()
                )
        );
    }
}