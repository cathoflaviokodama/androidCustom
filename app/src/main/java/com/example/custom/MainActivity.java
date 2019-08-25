package com.example.custom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText text3 = (EditText) findViewById(R.id.txtUrl);
        text3.setText("http://localhost:3002/");

        Button btnGo= (Button) findViewById(R.id.btnGo);
        final Context self = this;

        btnGo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(self, CustomApp.class);
                i.putExtra("location", (String)text3.getText().toString());
                startActivity(i);

            }
        });

    }
}
