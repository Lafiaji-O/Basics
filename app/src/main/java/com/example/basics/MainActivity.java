package com.example.basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void myName (View view) {

        EditText editText2 = (EditText) findViewById(R.id.editText2);

        Double money = Double.parseDouble(editText2.getText().toString());

        Double amount = money * 1.85 ;

        Toast.makeText(MainActivity.this, "$" + amount.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
